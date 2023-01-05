<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	request.setCharacterEncoding("UTF-8");
	request.setAttribute("address", "서울시 강남구"); //바인딩(jsp간 데이터 묶어 공유함)
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>forward</title>
</head>
<body>
	<jsp:forward page="member2.jsp"></jsp:forward>
</body>
</html>