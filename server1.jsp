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
  //��û�� ���� �����   httpRequest.responseText �� ó����
  //Ajax �� text, xml �� ó������ 
%>
�ȳ��ϼ��� <%=name%> ȸ����!!!

ȸ������ �Է��Ͻ� �ڷ�� 
name=<%=name%>
age=<%=age%>
�Դϴ� . 
�Է��Ͻ� �ڷ��
ȸ�������� ���˴ϴ�. ���

