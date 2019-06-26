<%--
  Created by IntelliJ IDEA.
  User: KGITBANK
  Date: 2019-06-20
  Time: 오후 5:12
  To change this template use File | Settings | File Templates.
--%>

<%@page import="java.util.*" %>
<%@ page import="snsDAO.SnsDAO" %>
<%@ page import="snsVO.SnsVO" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
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
    <%
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");

//TelInfoDAO tidao = new TelInfoDAO(); //패키지 이름부터 class까지 import 경로 잡아줘야함 //new 하는순간 메모리에 올라간다!!!><><><><
        ArrayList<SnsVO> sa = new SnsDAO().getAllInfo();

    %>
</head>
<%--BUNHO                                     NOT NULL NUMBER(5)
SNSJEMOK                                           VARCHAR2(30)
SNSWRITER                                          VARCHAR2(30)
SBSCONTENT                                         VARCHAR2(200)
BASEBUN                                            NUMBER(5)
DAETBUN                                            NUMBER(5)
DAETDAETBUN                                        NUMBER(5)--%>
<body>

<table border="2px" align="center">

    <tr><td colspan="7" align="center">전체</td></tr>
    <tr>
        <td>BUNHO</td><td>SNSJEMOK</td><td>SNSWRITER</td><td>SNSCONTENT</td><td>BASEBUN</td><td>DAETBUN</td><td>DAETDAETBUN</td>
    </tr>
    <%
        for(int i=0;i<sa.size();i++)
        {

    %>
    <tr>
        <td><a href="snsDelete.do?bunho=<%=sa.get(i).getBunho()%>"><%=sa.get(i).getBunho() %></></td><td><%=sa.get(i).getJemok() %></></td><td><%=sa.get(i).getWriter() %></td><td><%=sa.get(i).getContent() %></td><td><%=sa.get(i).getBasebun() %></td><td><%=sa.get(i).getDaetbun() %></td><td><%=sa.get(i).getDaetdaetbun()%></td>
    </tr>
    <%
        } //jsp?name=value~~와 a태그를 이용하여 update완성
    %>
</table>

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
