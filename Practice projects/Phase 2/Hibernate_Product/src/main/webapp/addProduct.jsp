<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Product</title>
</head>
<body>
	<h1>Add Product</h1>
	<form action="addProduct" method="post">
		<label for="name">Name:</label>
		<input type="text" id="name" name="name" required><br>
		<label for="description">Description:</label>
		<input type="text" id="description" name="description" required><br>
		<label for="price">Price:</label>
		<input type="number" id="price" name="price" step="0.01"
		required><br>
		<input type="submit" value="Add Product">
	</form>
</body>
</html>