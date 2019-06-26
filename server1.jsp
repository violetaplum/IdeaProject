<%@ page language="java" 
         contentType="text/plain; charset=UTF-8" pageEncoding="EUC-KR"%>
<%
String name    = "";
String age     = "";

  if ("POST".equals(request.getMethod())) {
    request.setCharacterEncoding("utf-8");
  }
   
  name    = request.getParameter("name");
  age     = request.getParameter("age");
  
  
  if ("GET".equals(request.getMethod())) {
    name    = new String(name.getBytes("8859_1"), "utf-8");
  }
  //요청에 대한 결과는   httpRequest.responseText 로 처리함
  //Ajax 는 text, xml 만 처리가능 
%>
안녕하세요 <%=name%> 회원님!!!

회원님이 입력하신 자료는 
name=<%=name%>
age=<%=age%>
입니다 . 
입력하신 자료는
회원관리에 사용됩니다. 행쇼

