<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false"
%>

<%
	request.setCharacterEncoding("utf-8");
	request.setAttribute("id", "hong");
	request.setAttribute("pwd","1234"); //request내장 객체에 바인딩(데이터를 묶음)
	session.setAttribute("name", "홍길동"); //session내장 객체에 바인딩
	application.setAttribute("email", "hong@test.com"); //application내장 객체에 바인딩
	request.setAttribute("address", "서울시 강남구");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>forward4</title>
</head>
<body>
	<jsp:forward page="member4.jsp"/>
</body>
</html>