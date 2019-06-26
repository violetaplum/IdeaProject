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
<h2>사원 전체 명단</h2>

<%
    request.setCharacterEncoding("utf-8");
    response.setCharacterEncoding("utf-8");

%>


    <form action="insertOne.do" mthod="get">
        <table border="2px" align="center">
            <tr>
                <td colspan=4 align="center">
                    사원명단
                </td>
            </tr>
            <tr>
                <td>사번</td><td><input type="number" name="id"></td>
            </tr>
            <tr>
                <td>이름</td><td><input type="text" name="name"></td>
            </tr>
            <tr>
                <td>전화번호</td><td><input type="text" name="tel"></td>
            </tr>
            <tr>
                <td>입사일</td><td><input type="date" name="date"></td>
            </tr>
            <tr><td colspan="2"><input type="submit" value="submit"></td><td colspan="2"><input type="reset" value="cancel"></td></tr>

        </table>
    </form>
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
