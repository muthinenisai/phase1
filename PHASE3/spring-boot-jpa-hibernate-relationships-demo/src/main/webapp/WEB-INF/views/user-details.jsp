<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


User Details:
<center>
<li>ID:  ${user.ID}
<li>Name : ${user.name}
</center>

Aadhar Details:
${user.aadharCard.number}
<br><br> 

Mobiles:<br> 

<c:forEach var="mobile" items="${user.phones}">
		<li>${mobile.number}
</c:forEach>

<br> <br> 
DEGREES:<br> 

<c:forEach var="degree" items="${user.degrees}">
		<li>${degree.name}
</c:forEach>