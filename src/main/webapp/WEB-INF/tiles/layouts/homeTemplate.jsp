<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<script src="/resources/jquery/jquery-3.3.1.js"></script>
		<script src="/resources/bootstrap-4.2.1/js/bootstrap.bundle.js"></script>
		<script src="/resources/bootstrap-4.2.1/js/bootstrap.js"></script>
		<link rel="stylesheet" type="text/css" href="/resources/bootstrap-4.2.1/css/bootstrap-grid.css">
		<link rel="stylesheet" type="text/css" href="/resources/bootstrap-4.2.1/css/bootstrap-reboot.css">
		<link rel="stylesheet" type="text/css" href="/resources/bootstrap-4.2.1/css/bootstrap.css">
		<title>Insert title here</title>
	</head>
	<body>
		<div class="container" style="border: #C1C1C1 solid 1px; border-radius:10px;">
			<!-- Header -->
			<tiles:insertAttribute name="header" />
			<!-- Menu Page -->
			<div class="span-5  border" style="height:400px;background-color:#FCFCFC;">
			<tiles:insertAttribute name="menu" />
			</div>
			<!-- Body Page -->
			<div class="span-19 last">
			<tiles:insertAttribute name="body" />
			</div>
			<!-- Footer Page -->
			<tiles:insertAttribute name="footer" />
		</div>
	</body>
</html>