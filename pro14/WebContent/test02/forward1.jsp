<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	request.setCharacterEncoding("utf-8");
	request.setAttribute("id", "hong");
	request.setAttribute("pwd","1234"); //request내장 객체에 바인딩(데이터를 묶음)
	session.setAttribute("name", "홍길동"); //session내장 객체에 바인딩
	application.setAttribute("email", "hong@test.com"); //application내장 객체에 바인딩
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>forward1</title>
</head>
<body>
	<jsp:forward page="member1.jsp"/>
</body>
</html>