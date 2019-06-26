<%@ page import="calcJava.CalcVO" %><%--
  Created by IntelliJ IDEA.
  User: KGITBANK
  Date: 2019-06-17
  Time: 오후 9:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<html>
<head>
    <style>
        body
        {
            background: #c166a1;
        }
    </style>

</head>
<body>
<pre>
<h2>계산 결과

${requestScope.rcalc}
<a href="${pageContext.request.contextPath}/calc.html">입력화면</a>
   <%-- 현재경로가져오기 - 개발 완료후 컨텍스트패스가 변경되어도 유지보수가 쉽다.       :   requestURI() 하면 경로가 자동으로 가져와진다
    http://localhost:8080/프로젝트명(컨텍스트명) /calcForm.html                   : ContextPath = 프로젝트명(컨텍스트명) : 경로명이 바뀌어도 오류 적음
    톰캣server.xml에서 <Context.docBase="....프로젝트명...."/>                    : path를 알아놓지 않으면 경로때문에 error발생할 수 있다.       --%>
</h2>
    </pre>
</body>
</html>
