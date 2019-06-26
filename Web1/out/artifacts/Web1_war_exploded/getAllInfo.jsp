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
<!-- DAO를 전달할때 객체를 new하여 값을 가져오는것으로 인자전달이 이루어질것!!! -->
<%
    request.setCharacterEncoding("utf-8");
    response.setCharacterEncoding("utf-8");

//TelInfoDAO tidao = new TelInfoDAO(); //패키지 이름부터 class까지 import 경로 잡아줘야함 //new 하는순간 메모리에 올라간다!!!><><><><
    ArrayList<TelInfoVO> tiArray = new TelInfoDAO().getAllInfo();

%>


<table border="2" align="center">
    <tr>
        <td colspan=4 align="center">
            <%--<form action="Telallview">--%>
                <form action="getAllInfo.do"><input type="submit" value="Gogo"></form>
                <%--원래는 submit을 누르면 tellallview로 가게 했지만 getallinfo.do로 가게끔 바꾸어놓음
                servlet에서 *.do 로 바뀌어있는 것을 인식함--%>
        </td>
    </tr>
    <%--servlet으로 갔다가 business logic 처라한다음 다시 출발한곳으로 온다--%>
    <tr><td>사번</td><td>이름</td><td>전화번호</td><td>입사일</td></tr>
        <c:forEach var="x" items="${requestScope.alist1}">
            <tr><td>${x.getId()}</td><td>${x.getName()}</td><td>${x.getTel()}</td><td>${x.getDate()}</td></tr>
    </c:forEach>
</table>
<table border=0 align="center">
    <tr>
        <td>
            <a href="searchOne.jsp">[한명]</a>
        </td>
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
