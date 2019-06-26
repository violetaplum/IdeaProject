<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>사원 전체 보기</h1>
	<hr>
	<table border="1">
		<tr>
			<td colspan="4">
				<!-- <form action="Telallview" method="post"> -->
				<form action="getAllInfo.do">
					<input type="submit" value="모두보기">
				</form>
			</td>
		</tr>
	<!-- 서블릿으로 갔다가 business logic 처리한다음 다시 출발한 곳으로 온다. -->
		<tr>
			<td>사번</td>	
			<td>이름</td>	
			<td>전화번호</td>	
			<td>입사일</td>	
		</tr>
		
		<!-- java의 for : 같은것 -->
		<c:forEach var="vo1" items="${alist1}">	<!-- request scope에 객체전체를 ArrayList alist1에 저장 -->
		<tr>
			<td>${vo1.id}</td>
			<%-- <td>${vo1.name}</td> --%>
			<td><a href="telSearchOne.do?name=${vo1.name}">${vo1.name}</a>
			<td>${vo1.tel}</td>
			<td>${vo1.d}</td>
		</tr>
		</c:forEach>
		<table border=0>
			<tr>
				<td><a href="sawonInsertForm.jsp">[입력]</a></td>
				<td><a href="getAllInfo.jsp">[모두보기]</a></td>
		</table>
	</table>
</body>
</html>