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
<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>

<%
    request.setCharacterEncoding("utf-8");
    response.setCharacterEncoding("utf-8");

    TelInfoDAO tidao = new TelInfoDAO();
    int id = Integer.parseInt(request.getParameter("id"));
    String name = (String)request.getParameter("name");
    String tel = (String)request.getParameter("tel");
    String sDate = (String)request.getParameter("date");

    tidao.insert_sawon(id,name,tel,sDate);
    response.sendRedirect("./SawonInsertForm.jsp");

%>
