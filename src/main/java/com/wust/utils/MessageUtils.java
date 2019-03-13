package com.wust.utils;
import com.github.qcloudsms.SmsSingleSender;
import com.github.qcloudsms.SmsSingleSenderResult;
import com.github.qcloudsms.httpclient.HTTPException;
import org.json.JSONException;

import java.io.IOException;

/*
 * 腾讯云短信SMS服务
 *
 * */
public class MessageUtils {
    public static void sendMessage(String tel,String checkCode) {
         // 短信应用SDK AppID
        int appid = 1400088247; // 1400开头
        // 短信应用SDK AppKey
        String appkey = "ad66a6f02fca498412949c82d1353615";
        // 需要发送短信的手机号码
        String phoneNumbers = tel;
        // 短信模板ID，需要在短信应用中申请
        int templateId = 115190; // NOTE: 这里的模板ID`7839`只是一个示例，真实的模板ID需要在短信控制台中申请
        // 签名
        String smsSign = "有什么理由不努力"; // NOTE: 这里的签名"腾讯云"只是一个示例，真实的签名需要在短信控制台中申请，另外签名参数使用的是`签名内容`，而不是`签名ID`

        try {
            String[] params=new String[1];
            params[0]=checkCode;
            SmsSingleSender ssender = new SmsSingleSender(appid, appkey);
            SmsSingleSenderResult result = ssender.sendWithParam("86", phoneNumbers,
                    templateId, params, smsSign, "", "");  // 签名参数未提供或者为空时，会使用默认签名发送短信
            System.out.print(result);
        } catch (HTTPException e) {
            // HTTP响应码错误
            e.printStackTrace();
        } catch (JSONException e) {
            // json解析错误
            e.printStackTrace();
        } catch (IOException e) {
            // 网络IO错误
            e.printStackTrace();
        }
    }
}
