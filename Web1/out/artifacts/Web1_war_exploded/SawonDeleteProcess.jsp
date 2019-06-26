<%--
  Created by IntelliJ IDEA.
  User: KGITBANK
  Date: 2019-06-17
  Time: 오후 5:50
  To change this template use File | Settings | File Templates.
--%>
<%@page import="telinfodao.TelInfoDAO"%>
<%@page import="telinfovo.TelInfoVO" %>
<%@page import="java.util.*" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<%
    request.setCharacterEncoding("utf-8");
    response.setCharacterEncoding("utf-8");

    TelInfoDAO tidao = new TelInfoDAO();

    int id = Integer.parseInt(request.getParameter("id"));

    tidao.delete_sawon(id);


    response.sendRedirect("./SawonDeleteForm.jsp");

%>
