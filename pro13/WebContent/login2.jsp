<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>�α���â</title>
</head>
<body>
	<form action = "result2.jsp" method="post">
		���̵� : <input type="text" name="userID"><br>
		��й�ȣ : <input type="password" name="userPw"><br>
		<input type="submit" value="�α���">
		<input type="reset" value="�ٽ��Է�">
	</form>
	<%
		String msg = request.getParameter("msg");
		if(msg != null){
	%>
		<h1><%=msg %></h1>
	<%
		}
	%>
</body>
</html>