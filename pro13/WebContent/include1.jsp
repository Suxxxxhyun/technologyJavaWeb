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
	�ȳ��ϼ���. ���θ� �߽� JSP�����Դϴ�.
	<br>
	<jsp:include page = "duke_image.jsp" flush="true"> <!-- �ڽ������� -->
		<jsp:param name="name" value="��ũ" />
		<jsp:param name="imgName" value="duke.png"/>
	</jsp:include>
</body>
</html>