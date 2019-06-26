<%@page import="telinfodao.TelInfoDAO"%>
<%@page import="telinfovo.TelInfoVO" %>
<%@page import="java.util.*" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>

<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>Insert title here</title>
  <style>
    *
    {
      background: #c166a1;
        text-align:center;
    }
  </style>
</head>
<body>
<h2>사원 전체 명단</h2>
<!-- DAO를 전달할때 객체를 new하여 값을 가져오는것으로 인자전달이 이루어질것!!! -->
<%
  request.setCharacterEncoding("utf-8");
  response.setCharacterEncoding("utf-8");

  String name = request.getParameter("name");
  String tel="";

//TelInfoDAO tidao = new TelInfoDAO(); //패키지 이름부터 class까지 import 경로 잡아줘야함 //new 하는순간 메모리에 올라간다!!!><><><><
  ArrayList<TelInfoVO> tiArray = new TelInfoDAO().getAllInfo();
%>
<form action="./sawonUpdateFinal.jsp" method="get">
<table border="2px" align="center">
  <tr>
    <td colspan=4 align="center">
      사원 전체 명단
    </td>
  </tr>
  <tr>
    <td>사번</td><td>이름</td><td>전화번호</td><td>입사일</td>
  </tr>
  <%
    for(int i=0;i<tiArray.size();i++)
    {

  %>
    <tr>
        <td><%=tiArray.get(i).getId() %></td><td><a href="SawonUpdateForm.jsp?name=<%=tiArray.get(i).getName() %>"><%=tiArray.get(i).getName()%></a></td><td><%=tiArray.get(i).getTel()%></></td><td><%=tiArray.get(i).getDate() %></td>
    </tr>
  <%

    } //jsp?name=value~~와 a태그를 이용하여 update완성
  %>
<tr><td colspan="4"><input type="submit" value="완료"></td></tr>
</table>
</form>
<table border=0 align="center">
  <tr>
    <td>
      <a href="SawonInsertForm.jsp">[입력]</a>
    </td>

    <td>
      <a href="SawonDeleteForm.jsp">[삭제]</a>
    </td>
      <td>
          <a href="sawonAllView.jsp">[모두보기]</a>
      </td>
  </tr>
</table>
</body>
</html>
