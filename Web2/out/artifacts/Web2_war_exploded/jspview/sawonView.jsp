<%--
  Created by IntelliJ IDEA.
  User: KGITBANK
  Date: 2019-06-17
  Time: 오후 9:12
  To change this template use File | Settings | File Templates.
--%>

<%@page import="controller.sawon.my.SawonServlet" %>
<%@page import="java.util.*" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<html>
<head>
    <style>
        body
        {
            background: #c166a1;
        }
    </style>
</head>
<body>

<h2>사원 정보</h2>
${requestScope.rsawon.name}
${requestScope.rsawon.tel}
${requestScope.rsawon.age}
${requestScope.rsawon.address}

</body>

</html>
