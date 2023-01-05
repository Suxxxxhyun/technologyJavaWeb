<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false"
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath }" /> <!-- pro14와 같은 컨텍스트 이름을 가져오려고 -->
<c:url var="url1" value="/test01/member1.jsp"> <!-- url정보를 저장함 -->
	<c:param name="id" value="hong"></c:param>
	<c:param name="pwd" value="1234"></c:param>
	<c:param name="name" value="홍길동"></c:param>
	<c:param name="email" value="hong@test.com"></c:param>
</c:url>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>url 태그 실습</title>
</head>
<body>
	<%-- <a href='${contextPath}/test01/member1.jsp'>회원정보출력</a> --%>
	<a href="${url1 }">회원정보출력</a>
</body>
</html>