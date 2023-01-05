<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored = "false"
%>

<%
	request.setCharacterEncoding("UTF-8");
%>

<jsp:useBean id = "m" class="sec01.ex01.MemberBean" /> <!-- useBean액션 태크로 아이디 이름이 m인 memberBean객체 생성 -->
<jsp:setProperty name = "m" property="*"/> <!-- memberform.jsp에 전송된 매개변수 이름과 memberBean의 속성을 비교한 후 값을 자동으로 설정 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보 출력창</title>
</head>
<body>
	<table border="1" align="center">
		<tr align = "center" bgcolor = "#99ccff">
			<td width="20%"><b>아이디</b></td>
			<td width="20%"><b>비밀번호</b></td>
			<td width="20%"><b>이름</b></td>
			<td width="20%"><b>이메일</b></td>
		</tr>
		<tr align = "center">
			<td><%=m.getId() %></td>
			<td><%=m.getPwd() %></td>
			<td><%=m.getName() %></td>
			<td><%=m.getEmail() %></td> <%--표현식을 사용해서 memberbean객체의 회원정보 출력 --%>
		</tr>
		<tr align = "center">
			<td>${m.id }</td>
			<td>${m.pwd }</td>
			<td>${m.name }</td>
			<td>${m.email }</td> <%--id의 속성이름으로 접근해서 회원정보 출력 --%>
		</tr>
	</table>
</body>
</html>