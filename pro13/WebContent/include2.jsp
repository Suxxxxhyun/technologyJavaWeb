<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>include2</title>
</head>
<body>
	�ȳ��ϼ���. ���θ� �߽� jsp�����Դϴ�.
	<br>
		<jsp:include page="duke_image.jsp" flush="true">
			<jsp:param name="name" value="��ũ2"/>
			<jsp:param name="imgName" value="duke2.png"/>
		</jsp:include>
	<br>
	�ȳ��ϼ���. ���θ� �߽� jsp �� �κ��Դϴ�.
</body>
</html>