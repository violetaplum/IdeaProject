<%@page import="telinfodao.TelInfoDAO"%>
<%@page import="telinfovo.TelInfoVO" %>
<%@page import="java.util.*" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

<%
String name = (String)session.getAttribute("name");
String tel = (String)request.getParameter("updateTel");

	new TelInfoDAO().update_nametel(name,tel);
	response.sendRedirect("sawonAllView.jsp");

%>