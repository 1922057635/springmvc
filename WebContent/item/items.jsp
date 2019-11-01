<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
	<tr>
		<td>id</td>
		<td>name</td>
	</tr>
	<c:forEach items="${items }" var="item">
		<tr>
			<td>${item.id}</td>
			<td>${item.name}</td>
			<td></td>
		</tr>
	</c:forEach>
</table>
</body>
</html>