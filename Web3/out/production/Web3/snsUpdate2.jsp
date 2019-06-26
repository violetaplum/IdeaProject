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
        int bunho = Integer.parseInt(request.getParameter("bunho"));

//TelInfoDAO tidao = new TelInfoDAO(); //패키지 이름부터 class까지 import 경로 잡아줘야함 //new 하는순간 메모리에 올라간다!!!><><><><
        ArrayList<SnsVO> sa = new SnsDAO().getAllInfo();

    %>
</head>
<body>
<form action="snsUpdate2.do" method="get">
    <table border="2px" align="center">

        <tr><td colspan="4" align="center">전체</td></tr>
        <tr>
            <td>BUNHO</td><td>SNSJEMOK</td><td>SNSWRITER</td><td>SNSCONTENT</td>
        </tr>
        <%
            request.setAttribute("bunho",bunho);
            for(int i=0;i<sa.size();i++)
            {
                if(sa.get(i).getBunho()==bunho)
                {
        %>
        <tr>
            <td><%=sa.get(i).getBunho() %></td><td><input type="text" name="jemok"></td><td><input type="text" name="writer"></td><td><input type="text" name="content"></td>
        </tr>
        <%
                }
                else{

        %>
        <tr>
            <td><%=sa.get(i).getBunho() %></td><td><%=sa.get(i).getJemok() %></td><td><%=sa.get(i).getWriter() %></td><td><%=sa.get(i).getContent() %></td>
        </tr>
        <%
                }
            } //jsp?name=value~~와 a태그를 이용하여 update완성
        %>
        <tr><td colspan="4"><input type="submit" value="완료"></td></tr>
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
