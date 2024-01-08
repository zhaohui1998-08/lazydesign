package com.lazydesign;

import com.alibaba.fastjson.JSON;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import sun.net.www.protocol.https.HttpsURLConnectionImpl;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;

public class TESTOKHttp {

    public static void main(String[] args) {
        String url = "https://tao.mirzibaba.com/index/account/login1.html";
        multipart apidao = new multipart();
        apidao.setCard("YKTUHF99466KTML1");
        String jsonString = JSON.toJSONString(apidao);
        interfaceUtil(url, jsonString);

    //    interfaceUtil("http://172.83.28.221:7001/NSRTRegistration/test/add.do?id=8888888&name=99999999", "");//get请求


    }
    /**
     * 调用对方接口方法
     * @param path 对方或第三方提供的路径
     * @param data 向对方或第三方发送的数据，大多数情况下给对方发送JSON数据让对方解析
     */
    public static void interfaceUtil(String path,String datadata) {
        try {
            URL url = new URL(path);
            //打开和url之间的连接
            HttpsURLConnectionImpl conn = (HttpsURLConnectionImpl) url.openConnection();
            PrintWriter out = null;

            /**设置URLConnection的参数和普通的请求属性****start***/

            conn.setRequestProperty("accept", "*/*");
            conn.setRequestProperty("connection", "Keep-Alive");
            conn.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)");

            /**设置URLConnection的参数和普通的请求属性****end***/

            //设置是否向httpUrlConnection输出，设置是否从httpUrlConnection读入，此外发送post请求必须设置这两个
            //最常用的Http请求无非是get和post，get请求可以获取静态页面，也可以把参数放在URL字串后面，传递给servlet，
            //post与get的 不同之处在于post的参数不是放在URL字串里面，而是放在http请求的正文内。
            conn.setDoOutput(true);
            conn.setDoInput(true);


            conn.setRequestMethod("POST");//GET和POST必须全大写
            /**GET方法请求*****start*/
            /**
             * 如果只是发送GET方式请求，使用connet方法建立和远程资源之间的实际连接即可；
             * 如果发送POST方式的请求，需要获取URLConnection实例对应的输出流来发送请求参数。
             * */
           // conn.connect();

            /**GET方法请求*****end*/

            /***POST方法请求****start*/

            out = new PrintWriter(conn.getOutputStream());//获取URLConnection对象对应的输出流

//            for (int i = 0; i < 100000; i++) {
//                System.out.println("================================"+i);
//            }

            // 创建Post请求
            HttpPost httpPost = new HttpPost("http://zs.rxsc.cc/index/account/login1.html");
            // HttpPost httpPost = new HttpPost("https://tao.mirzibaba.com/index/account/login1.html");

            // 设置ContentType(注:如果只是传普通参数的话,ContentType不一定非要用application/json)
            httpPost.setHeader("Content-Type", "application/json;charset=utf8");
            multipart apidao = new multipart();
            apidao.setCard("YKTUHF99466KTML1");

            String jsonString = JSON.toJSONString(apidao);
            StringEntity entity = new StringEntity(jsonString, "UTF-8");


            out.print(entity);//发送请求参数即数据
            out.flush();//缓冲数据


            /***POST方法请求****end*/

            //获取URLConnection对象对应的输入流
            InputStream is = conn.getInputStream();
            //构造一个字符流缓存
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String str = "";
            while ((str = br.readLine()) != null) {
                str=new String(str.getBytes(),"UTF-8");//解决中文乱码问题
                System.out.println(str);
            }
            //关闭流
            is.close();
            //断开连接，最好写上，disconnect是在底层tcp socket链接空闲时才切断。如果正在被其他线程使用就不切断。
            //固定多线程的话，如果不disconnect，链接会增多，直到收发不出信息。写上disconnect后正常一些。
            conn.disconnect();
            System.out.println("完整结束");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}