<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false"
%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSON 테스트</title>
<script src = "http://code.jquery.com/jquery-latest.min.js"></script> <!-- json이 제이쿼리의 기능이기때문에 -->
<script>
	$(function (){
		$("#checkJson").click(function(){
			var jsonStr = '{"name" : ["홍길동","이순신","임꺽정"]}'; //json기능으로 배열name에 이름을 저장하고있음
			var jsonInfo = JSON.parse(jsonStr);
			var output = "회원 이름<br>";
			output += "======<br>";
			for(var i in jsonInfo.name){
				output += jsonInfo.name[i] + "<br>";
			}
			$("#output").html(output);
		})
	})
</script>
</head>
<body>
	<a id="checkJson" style="cursor:pointer">출력</a><br><br>
	<div id="output"></div>
</body>
</html>