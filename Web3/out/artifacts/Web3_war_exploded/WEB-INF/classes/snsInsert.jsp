<%--
  Created by IntelliJ IDEA.
  User: KGITBANK
  Date: 2019-06-20
  Time: 오후 5:12
  To change this template use File | Settings | File Templates.
--%>

<%@page import="java.util.*" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <style>
        *
        {
            background: #c166a1;
            text-align: center;

        }
      /*  pstmt.setString(1,snsjemok);
        pstmt.setString(2,snswriter);
        pstmt.setString(3,snscontent);*/
    </style>
</head>
<body>
<form action="snsInsert.do" method="get">
    <h2>입력</h2>
    <table border="2px" align="center">
<tr>
    <td>
        snsjemok
    </td>
    <td>
        <input type="text" name="snsjemok">
    </td>

</tr>
        <tr>
            <td>
                snswriter
            </td>
            <td>
                <input type="text" name="snswriter">
            </td>
        </tr>
        <tr>
            <td>
                snscontent
            </td>
            <td>
                <input type="text" name="snscontent">
            </td>
        </tr>
        <tr><td colspan="2"><input type="submit" value="완료"></td></tr>
    </table>
<table border="2" align="center">
    <tr>
        <td><a href="snsInsert.jsp">[입력]</a></td>
        <td><a href="snsUpdate.jsp">[수정]</a></td>
        <td><a href="snsDelete.jsp">[삭제]</a></td>
        <td><a href="snsAllview.jsp">[모두보기]</a></td>
    </tr>

</table>
</form>
</body>
</html>
