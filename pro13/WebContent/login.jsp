<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%
	request.setCharacterEncoding("utf-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>�α���â</title>
</head>
<body>
	<h1>���̵� �Է����� �ʾҽ��ϴ�. ���̵� �Է����ּ���</h1>
	<form action = "result.jsp" method="post">
		���̵� : <input type="text" name="userID"><br>
		��й�ȣ : <input type="password" name="userPw"><br>
		<input type="submit" value="�α���">
		<input type="reset" value="�ٽ��Է�">
	</form>
</body>
</html>