package com.lazydesign;

import com.alibaba.fastjson.JSON;
import org.apache.http.*;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import java.io.*;



public class testAPI {




    private static String KEY_STR="myKey";
    private static String CHARSETNAME="UTF-8";
    private static String ALGORITHM="DES";
  //  @Test
    public static void doPostTestFour() throws IOException {
        // 获得Http客户端(可以理解为:你得先有一个浏览器;注意:实际上HttpClient与浏览器是不一样的)
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
        // 参数
//        StringBuffer params = new StringBuffer();
//        try {
//            // 字符数据最好encoding以下;这样一来，某些特殊字符才能传过去(如:某人的名字就是“&”,不encoding的话,传不过去)
//            params.append("name=" + URLEncoder.encode("&", "utf-8"));
//            params.append("&");
//            params.append("age=24");
//        } catch (UnsupportedEncodingException e1) {
//            e1.printStackTrace();
//        }
        // 创建Post请求
        HttpPost httpPost = new HttpPost("https://api.libi.li/CardLogin");
        // HttpPost httpPost = new HttpPost("https://tao.mirzibaba.com/index/account/login1.html");

        // 设置ContentType(注:如果只是传普通参数的话,ContentType不一定非要用application/json)
        httpPost.setHeader("Content-Type", "application/json;charset=utf8");
        multipart apidao = new multipart();
        apidao.setCard("YKTUHF99466KTML1");

        String jsonString = JSON.toJSONString(apidao);
        StringEntity entity = new StringEntity(jsonString, "UTF-8");
        httpPost.setEntity(entity);
        // 响应模型
        CloseableHttpResponse response = null;
//        for (int i = 0; i < 10000; i++) {
//            httpClient.execute(httpPost);
//            System.out.println(i);
//        }


        try {
            // 由客户端执行(发送)Post请求
            response = httpClient.execute(httpPost);
            // 从响应模型中获取响应实体
            HttpEntity responseEntity = response.getEntity();
            //     System.out.println("响应状态为:" + response.getStatusLine());
            if (responseEntity != null) {
                //       System.out.println("响应内容长度为:" + responseEntity.getContentLength());
                System.out.println("响应内容为:" + EntityUtils.toString(responseEntity));
                //  System.out.println("=========================================");
                //   System.out.println("|||||||||||" + EntityUtils.toString(responseEntity).indexOf("成功") + "||||||||||||");

            }
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("走了cache///////////////////////////////////////////////////////////////////////////////////");
        } finally {
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


    //@Test
    public void doUpload() {

        // 获得Http客户端(可以理解为:你得先有一个浏览器;注意:实际上HttpClient与浏览器是不一样的)
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();

        // 参数
        StringBuffer params = new StringBuffer();
        params.append("FD37-5F89-B3CE-BCAB");
        // 创建Post请求
        HttpPost httpPost = new HttpPost("https://api.libi.li/CardLogin" + "?card=" + params);

        // 设置ContentType(注:如果只是传普通参数的话,ContentType不一定非要用application/json)
        httpPost.setHeader("Content-Type", "application/json;charset=utf8");

        // 响应模型
        CloseableHttpResponse response = null;
        try {

            for (int i = 0; i < 11111; i++) {
                //zhuanhuan("FD375F89B3CEBCAB");

                // 由客户端执行(发送)Post请求
                response = httpClient.execute(httpPost);
                // 从响应模型中获取响应实体
                HttpEntity responseEntity = response.getEntity();

                System.out.println("响应状态为:" + response.getStatusLine());
                if (responseEntity != null) {
                    String s = EntityUtils.toString(responseEntity);
                    if (!s.contains("卡密无效")) {
                        System.out.println("---------------------------------------------");
                        break;
                    }
                }
            }
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
//        finally {
//            try {
//                // 释放资源
//                if (httpClient != null) {
//                    httpClient.close();
//                }
//                if (response != null) {
//                    response.close();
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }

    }

    public static void main(String[] args) throws Exception {
        //   String decryptString = zhuanhuan("FD37-5F89-B3CE-BCAB");
    }

//    public static String zhuanhuan(String code) {
//
//        Integer x = Integer.toString("A",2);
//        System.out.println(x);
//        return code;
//    }




}
