<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%
	request.setCharacterEncoding("utf-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>include1.jsp</title>
</head>
<body>
	안녕하세요. 쇼핑몰 중심 JSP시작입니다.
	<br>
	<jsp:include page = "duke_image.jsp" flush="true"> <!-- 자식페이지 -->
		<jsp:param name="name" value="듀크" />
		<jsp:param name="imgName" value="duke.png"/>
	</jsp:include>
</body>
</html>