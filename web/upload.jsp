<%--
  Created by IntelliJ IDEA.
  User: huangwei
  Date: 2019/6/28
  Time: 15:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>上传</title>
</head>
<body>
    <h3>SSM上传案例</h3>
    <form action="/SSM_Upload/upload" method="post" enctype="multipart/form-data">
        用户id：<input type="text" name="uid" value=""/><br/>
        用户名：<input type="text" name="uname" value=""/></br>
        文件：<input type="file" name="photo" /><br/>
        <input type="submit" value="上传" />
    </form>
</body>
</html>
