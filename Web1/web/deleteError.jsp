<%--
  Created by IntelliJ IDEA.
  User: KGITBANK
  Date: 2019-06-18
  Time: 오후 8:33
  To change this template use File | Settings | File Templates.
--%>
<%@page import="telinfodao.TelInfoDAO"%>
<%@page import="telinfovo.TelInfoVO" %>
<%@page import="java.util.*" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <style>
        *
        {
            background: #c166a1;
            text-align: center;
        }
    </style>
</head>
<body>
<h2>${requestScope.msg}</h2>

<table border=0 align="center">
    <tr>
        <td>
            <a href="insertOne.jsp">[입력]</a>
        </td>
        <td>
            <a href="updateOne.jsp">[수정]</a>
        </td>
        <td>
            <a href="deleteOne.jsp">[삭제]</a>
        </td>

        <td>
            <a href="getAllInfo.jsp">[모두보기]</a>
        </td>
    </tr>
</table>
</body>

</html>

