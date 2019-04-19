package com.wust.controller;

/*
* 测试插件的控制器
* */

import com.wust.utils.KuaiyunStorage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;

@Controller
public class PluginController {

    @RequestMapping("/uploadPlugin")
    public String uploadPluginUI(){
        return "uploadPlugin";
    }

    @RequestMapping("/doImageUpload")
    @ResponseBody
    public String doImageUpload(@RequestParam("file") MultipartFile image){
        System.out.println("默认name：file，所以形参为file,webupload批量上传，每一张图片都需要发起一次请求！");
        String imageName= image.getOriginalFilename();
        System.out.println("接收到的文件名"+imageName);
        //上传到快云对象存储业务代码
        try {
            InputStream inputStream=image.getInputStream();
            String uploadInfo=KuaiyunStorage.uploadFile(inputStream,imageName);
            System.out.println(uploadInfo);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "success";
    }
}
