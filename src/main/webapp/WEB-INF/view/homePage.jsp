<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Epam buffet</title>
<link rel="stylesheet" href="<c:url value="assets/style.css" />"
	type="text/css" media="all">
</head>
<body>
	<a href="<c:url value='/' />">Home</a>
	<a href="<c:url value='/foods.html' />">Foods</a>
	<h1>${homepageModel.welcomeMessage}</h1>
</body>
</html>
