package com.xjtu.controller;

import com.xjtu.pojo.UploadRecord;
import com.xjtu.service.UploadService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;
@Controller
public class UploadController {
    @Resource
    private UploadService uploadServiceImpl;
    //声明上传处理单元方法
    /*
    * uid 上传的用户id
    * uname 上传的用户名
    * photo 封存了上传文件所有相关数据的对象
    * */
    @RequestMapping("/upload")
    public String upload(int uid, String uname , MultipartFile photo, HttpServletRequest req) throws IOException {
        //将上传数据存储到服务器硬盘中
            //创建动态的文件名
                //获取文件的后缀名,photo.getOriginalFilename()获取原始文件名
        /*photo.getSize()返回上传文件的大小，long类型，字节大小
        * 注意：使用photo.getSize()来对上传文件的大小进行校验也可以，但是该校验是发生在解析后的，
        * 其实大小的校验在解析时就可以完成。在SpringMVC.xml文件中配置的上传资源解析bean中声明上传文件大小限制
        * 示例：
        * <bean id="multipartResolver" class="org.springframework.web.multipart.commons.CommonsMultipartResolver" >
        <property name="defaultEncoding" value="utf-8"></property><!--设置解析编码格式-->
        <property name="maxInMemorySize" value="10485760"></property><!--设置上传数据的总大小 字节-->
        <property name="maxUploadSize" value="1048576"></property><!--设置单个文件大小  字节-->
        </bean>
        *问题：如果DispatcherServlet在处理请求时出现异常，我们希望某些指定的异常出现后，跳转到指定的资源，怎么办？
        * 解决：在SpringMVC.xml文件中配置异常的跳转bean
        * 示例：
        * <bean id="exceptionResolver" class="org.springframework.web.servlet.handler.SimpleMappingExceptionResolver">
            <property name="exceptionMappings">
                <props>
                    <prop key="org.springframework.web.multipart.MaxUploadSizeExceededException">limit</prop>
                </props>
            </property>
         </bean>
         * MIME类型：规范了浏览器和服务器之间交互的数据类型
         * 使用：每次浏览器发送给服务器的数据，都是用MIME类型说明了发送的数据类型；每次服务器响应给浏览器的数据也会使用
         * MIME类型说明响应的数据类型
         * 内容：http://www,w3School.com.cn/media/media.mimeref.asp
        * */

        String suffixName = photo.getOriginalFilename().substring(photo.getOriginalFilename().lastIndexOf("."));
        //校验文件类型
        if(!(".jpg".equals(suffixName)||".png".equals(suffixName)||".bmp".equals(suffixName))){
            return"error";
        }
                //创建动态的文件名
        String name = UUID.randomUUID().toString()+System.currentTimeMillis();
                //拼接成新的文件名
        String realName = name+suffixName;
        //获取动态的存储路径
        String path =req.getServletContext().getRealPath("/images");
        File file = new File(path);
        if(!file.exists()){
            file.mkdirs();
        }
        //拼接数据存储的绝对路径
        File f = new File(file,realName);
        photo.transferTo(f);
        //将上传记录存储到数据库中（用户id，上传文件原始名，上传文件新名，时间，文件类型）
        int i = uploadServiceImpl.insUploadRecord(uid, photo.getOriginalFilename(), realName, photo.getContentType());
        if(i>0){
            return"forward:/records";
        }else {
            return "error";
        }
    }
    @RequestMapping("/records")
    public String getUploadRecords(HttpServletRequest req){
        List<UploadRecord> list = uploadServiceImpl.selUploadRecords();
        req.setAttribute("list",list);
        return "success";
    }
}
