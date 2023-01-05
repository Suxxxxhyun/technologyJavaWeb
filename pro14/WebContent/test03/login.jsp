<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored = "false" 
%><!-- 표현언어를 사용하려면 isELIgnored 를 false로 해줘야함 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> <!-- 톰켓에서 jstl라이브러리를 제공하지않기때문에 jstl라이브러리를 가져다 쓰겠다는 선언문 -->
<c:set var="contextPath" value = "${pageContext.request.contextPath}" /> <!--톰켓에서 자동으로 생성하는 pageContext객체 - 다른 서블릿이나 jsp로 이동하고자 할때 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인창</title>
</head>
<body>
	<form action="result.jsp">
		아이디 : <input type = "text" size = 20></br>
		비밀번호 : <input type = "password" size = 20></br>
		<input type ="submit" value="로그인" /> <input type ="reset" value="다시입력"/>
	</form>
	<br><br>
	<%--
		<a href = "${pageContext.request.contextPath}/memberForm.jsp">회원가입하기</a>
	 --%>
	 <a href = "${contextPath}/memberForm.jsp">회원가입하기</a>
</body>
</html>