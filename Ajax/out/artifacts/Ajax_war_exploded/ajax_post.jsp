<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String name="";
if("POST".equals(request.getMethod()))
{
  request.setCharacterEncoding("utf-8");

}
name=request.getParameter("name");

//encoding이 맞는지 확인해주는 if문
//사용할 위치 상단에 구현해놔야 사용가능해진다
%>

안녕하십니까
당신의 이름은 <%=request.getParameter("name")%> 이군요!!!
