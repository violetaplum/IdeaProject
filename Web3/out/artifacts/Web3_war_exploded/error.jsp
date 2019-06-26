<%--
  Created by IntelliJ IDEA.
  User: KGITBANK
  Date: 2019-06-20
  Time: 오후 8:17
  To change this template use File | Settings | File Templates.
--%>
<%@page import="java.util.*" %>
<%@ page import="snsDAO.SnsDAO" %>
<%@ page import="snsVO.SnsVO" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    request.setCharacterEncoding("utf-8");
    response.setCharacterEncoding("utf-8");
    String msg = (String)request.getAttribute("msg");
    out.println("<h2>"+msg+"</h2>");

%>
<html>
<head>
    <title>Title</title>
    <style>
        *
        {
            background: #c166a1;
            text-align: center;
        }
    </style>
</head>
<body>
<table border="2" align="center">
    <tr>
        <td><a href="snsInsert.jsp">[입력]</a></td>
        <td><a href="snsUpdate.jsp">[수정]</a></td>
        <td><a href="snsDelete.jsp">[삭제]</a></td>
        <td><a href="snsAllview.jsp">[모두보기]</a></td>
    </tr>

</table>

</body>
</html>
