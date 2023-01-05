<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	session.setAttribute("name", "이순신");
	application.setAttribute("address", "서울시 성동구");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>이름과 주소를 저장합니다.</h1>
	<a href =appTest2.jsp>두번째 웹페이지로 이동</a>
</body>
</html>