<%--
  Created by IntelliJ IDEA.
  User: huangwei
  Date: 2019/6/28
  Time: 16:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title></title>
</head>
<body>
    <table cellpadding="10px" border="1px" cellspacing="0px">
        <tr>
            <td>上传编号</td>
            <td>用户编号</td>
            <td>文件原名</td>
            <td>文件存储名称</td>
            <td>文件预览</td>
            <td>文件类型</td>
            <td>文件上传时间</td>
            <td>操作</td>
        </tr>
        <c:forEach items="${list}" var="item">
            <tr>
                <td>${item.upid}</td>
                <td>${item.uid}</td>
                <td>${item.oldName}</td>
                <td>${item.newName}</td>
                <td><image src="${pageContext.request.contextPath}/images/${item.newName}" width="100px"></image></td>
                <td>${item.contentType}</td>
                <td>${item.uploadTime}</td>
                <td><a href="download?oldName=${item.oldName}&newName=${item.newName}&contentType=${tem.contentType}">下载</a></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
