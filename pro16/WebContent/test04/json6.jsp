<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgonred = "false"
%>
<!-- ${}표현언어를 쓰기위해 isELIgnored를 false로 해줌 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!-- c코어 라이브러리가 jstl중 하나이기 때문에 jstl을 갖다 쓰겠다 -->
    <c:set var="contextPath" value="${pageContext.request.contextPath}"  />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>json 테스트</title>
<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
<script>
	$(function() {
		$("#checkJson").click(function() {
			$.ajax({
				type : "post",
				async : false,
				url : "${contextPath}/json2",
				success : function (data,textStatus){
					var jsonInfon = JSON.parse(data);
					var memberInfo = "회원정보<br>";
					memberInfo += "=======<br>";
					for(var i in jsonInfo.members){
						memberInfo += "이름 : " + jsonInfo.members[i].name + "<br>";
						memberInfo += "나이 : " + jsonInfo.members[i].age  + "<br>";
						memberInfo += "성별 : " + jsonInfo.members[i].gender + "<br>";
						memberInfo += "별명 : " + jsonInfo.members[i].nickname + "<br><br><br>";
					}
					$("#output").html(memberInfo);
				},
				error : function(data, textStatus){
					alert("에러가 발생했습니다");
				},
				complete : function(data, textStatus){
					
				}
			});
		});
	});
</script>
</head>
<body>
	<a id = "checkJson" style="cursor:pointer">회원 정보 수신하기</a><br><br>
	<div id = "output"></div>
</body>
</html>