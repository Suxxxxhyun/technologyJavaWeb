<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgonored = "false"
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>표현 언어에서 사용되는 데이터들</title>
</head>
<body>
	<h1>표현 언어로 여러 가지 데이터 출력하기</h1>
	<h1>
		\${100} : ${100}<br>
		\${"안녕하세요"} : ${"안녕하세요"}<br>
		\${10+1} : ${10+1}<br>
		\${"10"+1} : ${"10"+1}<br>
		<%-- \${null+10} : ${null+10}<br> --%> <%--숫자형 문자열과 숫자를 더하면 숫자형 문자열은 숫자로 인식됨 --%>
		<%-- \${"안녕" +11 } : ${"안녕" +11 }<br> 
		\${"hello" +"world" } : ${"hello" +"world" }<br>--%> <%--문자열과 숫자 또는 문자열 문자열은 계산안됨--%>
	</h1>
</body>
</html>