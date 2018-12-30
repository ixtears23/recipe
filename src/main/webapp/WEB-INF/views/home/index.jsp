<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
	<title>로그인 페이지</title>
</head>
<body>
<div class="container">
	<div class="row">
		<form name="logrinForm" action="/login.do" method="POST" onsubmit="return confirm('뭐여 이게?');">
			<div>
				<label>아이디</label>
				<input type="text" name="id" value="<c:out value='${loginVO.id}'/>">
			</div>
			<div>
				<label>비밀번호</label>
				<input type="password" name="password" value="<c:out value='${loginVO.password}'/>">
			</div>
			<div>
				<button type="submit">로그인</button>
			</div>
		</form>
	</div>
</div>
<script>
	$(function() {
		$("[name='logrinForm']").submit(function(res){
			console.log(res);
		})
	})
</script>
</body>
</html>
