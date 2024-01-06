<a href="add-product" >Add New product</a> 
&nbsp;&nbsp;|&nbsp;&nbsp;
<a href="list-products" >List products</a>


<a href="add-user-with-degrees-simplified-show-form">Add User (Simplified, with Edu Degrees) Form</a>

<a href="add-user-simplified-show-form">Add User (Simplified) Form</a>



<br><br>
Add  a user with Degrees:<br>
<form action="add-user-with-degrees" method="POST">
User Name: <input name="uName">
Aadhar No: <input name="aadharCardNo">
Mobile No 1: <input name="mobileNo1">
Mobile No 2: <input name="mobileNo2">
Edu Deg No 1: <input name="deg1">
Edu Deg No 2: <input name="deg2">
<input type=submit value="Add User">
</form>


<br><br>
Add  a user:<br>
<form action="add-user-simplified" method="POST">
User Name: <input name="name">
Aadhar No: <input name="aadharCard.number">
Mobile No 1: <input name="phones[0].number">
Mobile No 2: <input name="phones[1].number">
<input type=submit value="Add User">
</form>

<br><br>
Add  a user:<br>
<form action="add-user-with-mobiles" method="POST">
User Name: <input name="uName">
Aadhar No: <input name="aadharCardNo">
Mobile No 1: <input name="mobileNo1">
Mobile No 2: <input name="mobileNo2">
<input type=submit value="Add User">
</form>


<br><br>
Add  a user:<br>
<form action="add-user" method="POST">
User Name: <input name="uName">
Aadhar No: <input name="aadharCardNo">
<input type=submit value="Add User">
</form>


<br><br>
Display a user:<br>
<form action="user-details" method="GET">
User ID: <input name="id">
<input type=submit value="Display User">
</form>

