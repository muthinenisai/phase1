<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<td align="center">
<p> List of Products </p> 
<table border=1>
	<tr>
		<th>ID
		<th>NAME
		<th>PRICE
		<th>DATE ADDED
		<th>EDIT
		<th>DELETE
	</tr>

	<c:forEach var="product" items="${prodlist}">
		<tr>
			<td>${product.ID}
			<td>${product.name}
			<td>${product.price}
			<td>${product.dateAdded}
			<td><a href="edit-product?id=${product.ID}" > EDIT </a>	
			<td><a href="delete-product?id=${product.ID}" > DELETE </a>			
		</tr>
</c:forEach>

</table>
<br><br>
<a href="add-product" >Add New product</a> 

<br><br>
<a href="/" > Back to HOME</a>
