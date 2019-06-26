<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

안녕하십니까
당신의 이름은 <%=request.getParameter("name")%> 이군요!!!
<%
String name=request.getParameter("name");
// name = new String(name.getBytes("8859_1"),"utf-8"); //utf-8이 아닌경우 그 코드값을 저렇게 바꿔달라는 의미
                                                      //때문에 이미 utf-8일때는 안써야 함
%>

이름은 <%=name%> 이시군요!!
