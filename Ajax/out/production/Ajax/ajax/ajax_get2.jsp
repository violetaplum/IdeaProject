<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<%
    String irum=request.getParameter("irum");
    String na2=request.getParameter("na2");
%>
안녕하세요 <%=irum %> 회원님!!!

회원님이 입력하신 자료는
name=<%=irum %>
age=<%=na2 %>
입니다.
입력하신 자료는
회원관리에 사용됩니다. 행쇼

