<a href="add-product" >Add New product</a> 
&nbsp;&nbsp;|&nbsp;&nbsp;
<a href="list-products" >List products</a>

<br><br>
Display a product:<br>
<form action="product-details" method="GET">
<input name="id">
<input type=submit value="Display">
</form>

<br><br>
Delete a product:<br>
<form action="delete-product" method="GET">
<input name="id">
<input type=submit value="Delete">
</form>


<br><br>
Edit a product:<br>
<form action="edit-product" method="GET">
<input name="id">
<input type=submit value="Edit">
</form>


<br><br>
Search products by exact Name:<br>
<form action="list-products-by-name" method="GET">
<input name="name">
<input type=submit value="SEARCH">
</form>

<br><br>
Search products by Name Like:<br>
<form action="list-products-by-name-like" method="GET">
<input name="name">
<input type=submit value="SEARCH">
</form>

<br><br>
Search products by Price:<br>
<form action="list-products-by-price" method="GET">
<input name="price">
<input type=submit value="SEARCH">
</form>