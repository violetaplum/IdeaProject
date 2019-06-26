<%@page import="telinfodao.TelInfoDAO"%>
<%@page import="telinfovo.TelInfoVO" %>
<%@page import="java.util.*" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Insert title here</title>
    <style>
        *
        {
            background: #c166a1;
            text-align: center;
        }
    </style>
</head>
<body>
<h2>사원 전체 명단</h2><br>

<%
    request.setCharacterEncoding("utf-8");
    response.setCharacterEncoding("utf-8");

    TelInfoVO tivo = new TelInfoDAO().search_nametel((String)request.getParameter("name"));
    String name = tivo.getName();
    String tel = tivo.getTel();
    int id = tivo.getId();
    Date d = tivo.getDate();
%>

<table border="2" align="center">
    <tr><td>사번</td><td>이름</td><td>전화번호</td><td>입사일</td></tr>
    <tr><td><%=id%></td><td><%=name%></td><td><%=tel%></td><td><%=d%></td></tr>
</table>
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
