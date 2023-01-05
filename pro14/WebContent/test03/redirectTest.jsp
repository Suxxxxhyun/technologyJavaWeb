<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false"
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
  request.setCharacterEncoding("UTF-8");
%>  

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>리다이렉트 실습</title>
</head>
<body>
	<c:redirect url="/test01/member1.jsp">
		<c:param name="id" value="${'hong' }"></c:param>
		<c:param name="pwd" value="${'1234' }"></c:param>
		<c:param name="name" value="${'홍길동' }"></c:param>
		<c:param name="email" value="${'hong@test.com' }"></c:param>
	</c:redirect>
</body>
</html>