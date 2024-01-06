<br><br>
Add  a user (with Aadhar, Mobile and Edu Degrees):<br>
<form action="add-user-with-degrees-simplified-save" method="POST" >
User Name: <input name="name">
Aadhar No: <input name="aadharCard.number">
Mobile No 1: <input name="phones[0].number">
Mobile No 2: <input name="phones[1].number">
Edu Degree No 1: <input name="degrees[0].name">
Edu Degree No 2: <input name="degrees[1].name">
<input type=submit value="Add User">
</form>