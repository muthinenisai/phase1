<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<div align="center">
    Edit Product ( id = ${prod.ID} ):<br>

	<form:form action="edit-product" method="POST" modelAttribute="prod">
		<form:input path="ID" value="${prod.ID}" hidden="true"/>

		<form:label path="name" >Product name:</form:label>
		<form:input path="name" value="${prod.name}" />
		<br />
		<form:label path="price">Product Price:</form:label>
		<form:input path="price" value="${prod.price}"/>
		<br />	
		

		<form:button>Edit and Save</form:button>

	</form:form>
	
	<br>
	<a href="/" > Cancel and Go Back to HOME</a>