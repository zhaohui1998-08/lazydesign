package com.lazydesign;

import com.lazydesign.entity.English;
import com.lazydesign.service.EnglishService;
import org.apache.http.HttpEntity;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

@SpringBootTest
public class TestSj {

    @Autowired
    EnglishService englisHervice;

    @Test
    public void QWE() {
     //   String kami = "FD37-5F89-B3CE-BFFC";

        for (int i = 0; i < 99999; i++) {

//            String s = zhuan2(kami);
//            String jieshu = zhuan16(s);
//            kami = jieshu;
//            doUpload(kami, i);

            String shengcheng = shengcheng();
            doUpload(shengcheng, i);
        }


//        String er = Integer.toBinaryString(Integer.parseInt(aa, 16));
//        System.out.println(er);
    }


    //生成卡密
    public String shengcheng() {
        String kami = "";
        ThreadLocalRandom random = ThreadLocalRandom.current();
        for (int i = 0; i < 16; i++) {
            int i1 = random.nextInt(16);
            String s = Integer.toHexString(i1);
            kami += s;
            if (i == 3 || i == 7 || i ==11) {
                kami+="-";
            }
        }

        return kami.toUpperCase();
    }

    //16转2
    public String zhuan2(String kami) {
        // String kami = "FD37-5F89-B3CE-BCAB";
        String jz2 = "";
        //16转2
        for (int i = 0; i < kami.length(); i++) {
            char c = kami.charAt(i);
            if (!String.valueOf(c).equals("-")) {
                String er = Integer.toBinaryString(Integer.parseInt(String.valueOf(c), 16));
                if (er.length() == 1) {
                    er = "000" + er;
                } else if (er.length() == 2) {
                    er = "00" + er;
                } else if (er.length() == 3) {
                    er = "0" + er;
                }
                jz2 += er;
                //  System.out.println("16进制是：" + c + "。转换2进制是" + er);
                //  System.out.println(jz2);
            }

        }
        return jz2;
    }

    //2转16
    public String zhuan16(String jinzhi) {
        // String kami = "FD37-5F89-B3CE-BCAB";
        String jz16 = "";
        String jiawan = "";
        String jinzhi1 = jinzhi.substring(0, 15);
        String jinzhi2 = jinzhi.substring(15, 31);
        String jinzhi3 = jinzhi.substring(31, 47);
        String jinzhi4 = jinzhi.substring(47, 64);
        String b = "0110";
        String s1 = Integer.toBinaryString(Integer.parseInt(jinzhi1, 2) + Integer.parseInt(b, 2));
        String s2 = Integer.toBinaryString(Integer.parseInt(jinzhi2, 2) + Integer.parseInt(b, 2));
        String s3 = Integer.toBinaryString(Integer.parseInt(jinzhi3, 2) + Integer.parseInt(b, 2));
        String s4 = Integer.toBinaryString(Integer.parseInt(jinzhi4, 2) + Integer.parseInt(b, 2));
        int changdu1 = jinzhi1.length() - s1.length();
        int changdu2 = jinzhi2.length() - s2.length();
        int changdu3 = jinzhi3.length() - s3.length();
        int changdu4 = jinzhi4.length() - s4.length();
        for (int i = 0; i < changdu1; i++) {
            s1 = "0" + s1;
        }
        for (int i = 0; i < changdu2; i++) {
            s2 = "0" + s2;
        }
        for (int i = 0; i < changdu3; i++) {
            s3 = "0" + s3;
        }
        for (int i = 0; i < changdu4; i++) {
            s4 = "0" + s4;
        }

        jiawan = s1 + s2 + s3 + s4;
        for (int i = 0, j = 0; j < 16; i += 4, j++) {
            String substring = jiawan.substring(i, i + 4);
            String shiliu = Integer.toHexString(Integer.parseInt(substring, 2));
            jz16 += shiliu;
            if (j == 3 || j == 7 || j == 11) {
                jz16 += "-";
            }
        }
        return jz16.toUpperCase();
    }


    public void doUpload(String params, int end) {

        // 获得Http客户端(可以理解为:你得先有一个浏览器;注意:实际上HttpClient与浏览器是不一样的)
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();

        // 创建Post请求
        HttpPost httpPost = new HttpPost("https://api.libi.li/CardLogin" + "?card=" + params);

        // 设置ContentType(注:如果只是传普通参数的话,ContentType不一定非要用application/json)
        httpPost.setHeader("Content-Type", "application/json;charset=utf8");

        // 响应模型
        CloseableHttpResponse response = null;
        try {
            // 由客户端执行(发送)Post请求
            response = httpClient.execute(httpPost);
            // 从响应模型中获取响应实体
            HttpEntity responseEntity = response.getEntity();

            System.out.println("响应状态为:" + response.getStatusLine());
            English english = new English();
//            UUID uuid = UUID.randomUUID();
//            english.setId(uuid.toString());
            english.setTranslate(params);
            english.setWord("失败");
            if (responseEntity != null) {
                String s = EntityUtils.toString(responseEntity);
                english.setWord("无效");
                if (!s.contains("卡密无效")) {
                    System.out.println("---------------------------------------------:" + params);
                    english.setWord("成功");
                }

            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm: ss");
            String format = simpleDateFormat.format(new Date());
            english.setCreatime(format);
            int i = englisHervice.addWord(english);

        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (end == 99999) {
                try {
                    // 释放资源
                    if (httpClient != null) {
                        httpClient.close();
                    }
                    if (response != null) {
                        response.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

    }

}
