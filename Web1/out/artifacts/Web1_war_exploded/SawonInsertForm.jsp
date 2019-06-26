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
    text-align: center;
}
    </style>
</head>
<body>
<h2>사원 전체 명단</h2>
<!-- DAO를 전달할때 객체를 new하여 값을 가져오는것으로 인자전달이 이루어질것!!! -->
<%
request.setCharacterEncoding("utf-8");
response.setCharacterEncoding("utf-8");

//TelInfoDAO tidao = new TelInfoDAO(); //패키지 이름부터 class까지 import 경로 잡아줘야함 //new 하는순간 메모리에 올라간다!!!><><><><
ArrayList<TelInfoVO> tiArray = new TelInfoDAO().getAllInfo();

%>
<form action="Telinsertone" mthod="get">
<table border="2px" align="center">
  <tr>
    <td colspan=4 align="center">
      사원명단
    </td>
  </tr>
  <tr>
    <td>사번</td><td><input type="number" name="id"></td>
  </tr>
  <tr>
    <td>이름</td><td><input type="text" name="name"></td>
</tr>
  <tr>
    <td>전화번호</td><td><input type="text" name="tel"></td>
</tr>
  <tr>
    <td>입사일</td><td><input type="date" name="date"></td>
  </tr>
  <tr><td colspan="2"><input type="submit" value="submit"></td><td colspan="2"><input type="reset" value="cancel"></td></tr>

</table>
</form>
<table border=0 align="center">
  <tr>
    <td>
      <a href="SawonInsertForm.jsp">[입력]</a>
    </td>
    <td>
      <a href="SawonAllforUpdate.jsp">[수정]</a>
    </td>
    <td>
      <a href="SawonAllforDelete.jsp">[삭제]</a>
    </td>
  </tr>
</table>
</body>
</html>
