package com.xjtu.controller;
import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

@Controller
public class DownloadController {

    //下载图片资源
    @RequestMapping("/download")
    public void downloadImage(String oldName, String newName , String contentType, HttpServletRequest req, HttpServletResponse resp) throws IOException {
        //设置响应的数据的MIME类型
        resp.setContentType(contentType);
        //设置响应头，告诉浏览器将接受的数据另存为存储到客户端，而不是直接解析
        String str1 = oldName;
        //进行中文转码
        String str2 = new String(str1.getBytes("utf-8"),"iso-8859-1");
        resp.setHeader("Content-Disposition","attachment;fileName="+str2);
        //获取要下载的资源的读取流对象
            //获取资源存储路径
        String path = req.getServletContext().getRealPath("/images");
        FileInputStream fis = new FileInputStream(new File(path,newName));
        //使用流对象读取文件数据，并响应给浏览器
        ServletOutputStream os = resp.getOutputStream();
        int i = 0;
        byte[] b = new byte[1024];//设置数组大小可以控制下载速度
        while((i=fis.read(b))!=-1){
            os.write(b,0,i);
            os.flush();
        }
        os.close();
        fis.close();
        //也可以使用工具类实现数据流读写,就不需要fis和下面的读写操作
        //os.write(FileUtils.readFileToByteArray(new File(path,newName)));
    }

}
