<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>     
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>show all user info</title>
</head>
<body>
	<h2>show data base result</h2>
	<h2>echo ${msg}</h2>
	<table border="1">
		<thead>
			<tr>	
				<td>ID</td>
				<td>NAME</td>
				<td>AGE</td>
				<td>GENDER</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="com" items="${coms}">
				<tr>
					<td>${com.id}</td>
					<td>${com.name}</td>
					<td>${com.age}</td>
					<td>${com.salary }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>