<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<td align="center">
<p> List of Todos </p> 
<table border=1>
	<tr style="background-color:lightgrey">
		<th>ID
		<th>USER ID
		<th>TITLE
		<th>COMPLETED
	</tr>

	<c:forEach var="todo" items="${todos}">
		<tr>
			<td>${todo.id}
			<td>${todo.userId}
			<td>${todo.title}
			<td>${todo.completed}			
		</tr>
</c:forEach>

</table>
<br><br>
<br><br>
<a href="/" > Back to HOME</a>