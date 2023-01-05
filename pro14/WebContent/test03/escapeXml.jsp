<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>escapeXml 변환기 실습 예제</title>
</head>
<body>
	<h2>
		<pre>
			<c:out value="&lt;" escapeXml="true"/>
			<c:out value="&lt;" escapeXml="false"/>
			<c:out value="&gt;" escapeXml="true"/>
			<c:out value="&gt;" escapeXml="false"/>
		</pre>
	</h2>
</body>
</html>