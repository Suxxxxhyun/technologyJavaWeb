<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%
	request.setCharacterEncoding("utf-8");
	String user_id = request.getParameter("user_id");
	String user_pw = request.getParameter("user_pw");
%>

<%
	if(user_id == null || user_id.length() == 0){
%>

	���̵� �Է��ϼ���.<br>
	<a href = "/pro12/login.html">�α����ϱ�</a>
	<%
	}else{
	%>
	<h1>ȯ���մϴ�. <%=user_id %>��!!</h1>
	<%
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	
</body>
</html>