package com.GDPU.market.utils;

import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.UUID;

public class ImageUtil {

    public String ImageUpload(MultipartFile file, HttpServletRequest request) throws IOException {

        String trueFileName = null;
        if (file != null) {
            String path = null;     //文件路径
            String type = null;     //文件类型
            String fileName = file.getOriginalFilename();   //文件原名称
            String uuid = UUID.randomUUID().toString().replaceAll("-", "");
            type = fileName.indexOf(".") != -1 ? fileName.substring(fileName.lastIndexOf(".") + 1, fileName.length()) : null;
            if (type != null) {     //上传文件是否为空
                if ("PNG".equals(type.toUpperCase()) || "JPG".equals(type.toUpperCase())) {
                    String realPath = request.getSession().getServletContext().getRealPath("/image/");
                    System.out.println(uuid);
                    trueFileName = new Date().getTime() + uuid + "." + type;
                    System.out.println(trueFileName);
                    path = realPath + trueFileName;
                    file.transferTo(new File(path));
                    System.out.println(path);
                } else {
                    System.out.println("类型错误！");
                    return null;
                }
            } else {
                System.out.println("没有相对应的文件");
                return null;
            }

        }

        return trueFileName;
    }

}
