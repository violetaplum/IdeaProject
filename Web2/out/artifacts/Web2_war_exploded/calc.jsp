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

${requestScope.rcalc.getOne()}${requestScope.rcalc.getMath()}${requestScope.rcalc.getTwo()} = ${requestScope.rcalc.getResult()}

</h2>
    </pre>
</body>
</html>
