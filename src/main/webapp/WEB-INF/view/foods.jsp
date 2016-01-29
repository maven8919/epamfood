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
	<table>
		<tr>
			<th>Name</th>
			<th>Description</th>
			<th>Order</th>
		</tr>
		<c:forEach var="food" items="${listFoodModel.foods}">
			<tr>
				<td>${food.name}</td>
				<td>${food.description}</td>
				<td><a href="<c:url value='${food.orderUrl}' />">Order</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
