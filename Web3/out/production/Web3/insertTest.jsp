<%--
  Created by IntelliJ IDEA.
  User: violeta
  Date: 6/23/19
  Time: 3:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@page import="java.util.*" %>
<%@ page import="snsDAO.SnsDAO" %>
<%@ page import="snsVO.SnsVO" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    Class.forName("oracle.jdbc.driver.OracleDriver");
    Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","root","root");
    String sql = "insert into mvcsnsboard values(mvcsnsboard_sequence1.NEXTVAL,?,?,?,mvcsnsboard_sequence1.CURRVAL,0,0)";
    PreparedStatement pstmt = conn.prepareStatement(sql);
    pstmt.setString(1,"Hello");
    pstmt.setString(2,"jang");
    pstmt.setString(3,"myFirstContent!");
    pstmt.executeUpdate();
%>
<%--
<input type="text" name="jemok">
<input type="text" name="writer">
<input type="text" name="content">
--%>

