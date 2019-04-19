package com.wust.utils;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;

import sun.misc.BASE64Encoder;
import net.sf.json.JSONObject;

/**
 *
 * 快云存储API使用demo
 * @author HAPPY
 *
 */
public class KuaiyunStorage {

    /**
     * 接口API地址
     */
    public static final String API = "http://api.storagesdk.com/";

    /**
     * 接口方法
     */
    public static final String METHOD_GETTOKEN = "restful/storageapi/storage/getToken"; // 获取操作密钥token
    public static final String METHOD_UPLOAD = "restful/storageapi/file/uploadFile"; // 上传文件
    public static final String METHOD_GETURL = "restful/storageapi/file/getFileUrl"; // 获取文件访问链接
    public static final String METHOD_DELFile = "restful/storageapi/file/deleteFile"; // 删除文件

    /**
     * 参数
     */
    public static final String ACCESS_KEY = "BYMGP91PMBWZDTAR4IEK"; // 用户秘钥对：开通快云存储时的Access_Key，可在会员中心获取
    public static final String SECRET_KEY = "gujwEayyyFljOzl7egQJ872YUkuiNyO/Qb0omydY"; // 用户秘钥对：开通快云存储时的Secret_Key，可在会员中心获取
    public static final String RESOURCE = "VG3OQ81wtrMEWQAj+1rvPWYQ/STmqYjU"; // API调用来源，可在会员中心点击获取
    public static final String VOUCHER = "75fcd805ff8cf8844a9dd1a6d19cdf9d"; // 凭证，用户通过accesskey和secretkey获取的，可在会员中心点击，以邮件形式获取

    public static final String BUCKET_NAME = "onlineshop"; // 用户的空间名称
    public static String token = "" ; // 用户操作秘钥，是用户调用api接口时必须用到的的秘钥；可以通过API获取


    /**
     * 获取文件访问链接变量
     */
    static int minutes = 0; // 获取链接时效；默认是0，即无时效，永久有效。
    static int leng = 0; // 是否获取长链接。若链接时效不为0，即为长链接。链接时效为0，默认是leng = 0，即短链接；leng = 1, 是长链接。

    /**
     * demo测试
     * @param args
     */
    public static void main(String[] args){
        System.out.println("demo-test-景安网络快云对象存储测试");
        // 获取token，这一步是给静态变量token赋值，必须要有！！！
        //token = getToken();
        //System.out.println("获取token的返回结果:" + token);
        // 上传文件
        //String uploadInfo = uploadFile("C:\\Users\\ZhangYang\\Pictures\\testImg\\demo.jpg");
        //System.out.println("上传文件返回结果:" + uploadInfo);
        // 获取文件访问链接
//        String objectUrlInfo = getFileUrl();
//		System.out.println("获取文件访问链接的返回结果:" + objectUrlInfo);
        // 删除文件
//		String delFileInfo = delFile("demo.jpg");
//		System.out.println("删除文件的返回结果:" + delFileInfo);
    }

    public static String getToken() {
        JSONObject jsStr = new JSONObject();
        jsStr.put("voucher", VOUCHER);
        jsStr.put("accessKey", ACCESS_KEY);
        jsStr.put("secretKey", SECRET_KEY);
        jsStr.put("resource", RESOURCE);
        String msg = sendPost(API + METHOD_GETTOKEN, jsStr.toString(), null, null);
        System.out.println(msg);
        return token = JSONObject.fromObject(msg).get("message").toString().split(":")[1];
    }

    /**
     * 上传文件
     * @param localFile 本地文件路径： 如, C:\\images\\demo.jpg
     * @return
     */
    public static String uploadFile(String localFile){
        token=getToken();
        try {
            File file = new File(localFile);
            InputStream in = null;
            try {
                in = new FileInputStream(file);
            } catch (Exception e) {
                e.printStackTrace();
            }
            //防止图片重名
            String fileName=new Date().getTime()+"_"+new Random().nextInt(10)+"_"+localFile.substring(localFile.lastIndexOf("\\")+1,localFile.length());
            BASE64Encoder encoder = new BASE64Encoder();
            fileName = encoder.encode(fileName.getBytes("utf-8"));

            Map<String, String> hander = new HashMap<String, String>();
            hander.put("token", token);
            hander.put("resource", RESOURCE);
            hander.put("bucketName", BUCKET_NAME);
            hander.put("fileName", fileName);
            hander.put("length", in.available() + "");

            return sendPost(API + METHOD_UPLOAD, null, in, hander);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    /*
    * @fileName : 文件名，从控制器传入
    * */
    public static String uploadFile(InputStream in , String fileName) {
        token=getToken();
        try{
            //防止图片重名
            fileName=new Date().getTime()+"_"+new Random().nextInt(10)+"_"+fileName;
            BASE64Encoder encoder = new BASE64Encoder();
            fileName = encoder.encode(fileName.getBytes("utf-8"));

            Map<String, String> hander = new HashMap<String, String>();
            hander.put("token", token);
            hander.put("resource", RESOURCE);
            hander.put("bucketName", BUCKET_NAME);
            hander.put("fileName", fileName);
            hander.put("length", in.available() + "");

            return sendPost(API + METHOD_UPLOAD, null, in, hander);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 获取文件访问链接
     * keyName: 文件完整路径，例test/demo.png
     * @return
     */
    public static String getFileUrl(String keyName) {
        try {
            JSONObject jsStr = new JSONObject();
            jsStr.put("token", token);
            jsStr.put("resource", RESOURCE);
            jsStr.put("bucketName", BUCKET_NAME);
            jsStr.put("fileName", keyName); // 拼接文件路径
            jsStr.put("minutes", minutes);// 可以不传，默认是无时效。
            jsStr.put("leng", leng);// 可以不传，默认是短链接。
            return sendPost(API + METHOD_GETURL, jsStr.toString(), null, null);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 删除文件
     * @return
     */
    public static String delFile(String delfileName) {
        try {
            JSONObject jsStr = new JSONObject();
            jsStr.put("token", token);
            jsStr.put("resource", RESOURCE);
            jsStr.put("bucketName", BUCKET_NAME);
            jsStr.put("fileName", delfileName);
            return sendPost(API + METHOD_DELFile, jsStr.toString(), null, null);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * HTTP请求块（POST）
     * @param url 请求链接
     * @param JsonString 请求体中的参数
     * @param input 请求文件流
     * @param hander 请求头里的参数
     * @return
     */
    private static String sendPost(String url, String JsonString, InputStream input, Map<String, String> hander) {
        String result = "";
        // 创建连接
        try {
            URL realUrl = new URL(url);
            // 打开和URL之间的连接
            HttpURLConnection conn = (HttpURLConnection) realUrl.openConnection();
            // 设置通用的请求属性
            conn.setRequestProperty("Content-Type", " application/json");// 设定请求格式,json，也可以设定xml格式的
            conn.setRequestProperty("Accept-Charset", "UTF-8"); // 设置编码语言
            conn.setRequestProperty("X-Auth-Token", "token"); // 设置请求的token
            conn.setRequestProperty("Connection", "keep-alive"); // 设置连接的状态
            conn.setRequestProperty("Transfer-Encoding", "chunked");// 设置传输编码
            // post请求，无缓存
            conn.setRequestMethod("POST"); // 可以根据需要提交
            conn.setUseCaches(false);// 设置缓存，注意设置请求方法为post不能用缓存
            conn.setChunkedStreamingMode(0);// 设置该选项，则不使用HttpURLConnection的缓存机制，直接将流提交到服务器上
            conn.setInstanceFollowRedirects(true);
            // 发送POST请求必须设置如下两行
            conn.setDoOutput(true);
            conn.setDoInput(true);

            // 请求参数在请求头中
            if (hander != null) {
                for (Entry<String, String> entry : hander.entrySet()) {
                    conn.addRequestProperty(entry.getKey(), entry.getValue());
                }
            }
            // 建立实际的连接
            conn.connect();

            int code = 0;
            //
            if (JsonString != null) {
                OutputStream out = conn.getOutputStream();
                out.write(JsonString.getBytes());
                code = conn.getResponseCode();
                out.flush();
                out.close();
            }

            if (input != null) {
                OutputStream out = conn.getOutputStream();
                byte[] bytes = new byte[1024];
                int len = -1;
                while ((len = input.read(bytes)) != -1) {
                    out.write(bytes, 0, len);
                }
                code = conn.getResponseCode();
                input.close();
                out.flush();
                out.close();
            }

            // 读取响应
            if (code == 200) {
                BufferedReader read = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
                StringBuffer stb = new StringBuffer();
                String line = "";
                while ((line = read.readLine()) != null) {
                    stb.append(line);
                }
                read.close();
                String message = stb.toString();
                if (message != null && !"".equals(message)) {
                    JSONObject returnObject = JSONObject.fromObject(message);
                    result = returnObject.toString();
                } else {
                }
            } else {
                result = conn.getResponseMessage();
            }

            // 断开连接
            conn.disconnect();

        } catch (Exception e) {
            e.printStackTrace();
            result = "调用post方法异常，异常原因：" + e.getMessage();
        }
        return result;
    }
}
