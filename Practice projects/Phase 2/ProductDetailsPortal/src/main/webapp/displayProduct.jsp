<%@ page import="com.rupa.Product" %>
<%@ page import="java.util.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product Information</title>
</head>
<body>
    <h2>Product Information</h2>

    <%-- Retrieve product from the session --%>
    <% Product product = (Product)session.getAttribute("product"); %>

    <%-- Display product information --%>
    <p><strong>Name:</strong> <%= product.getName() %></p>
    <p><strong>Color:</strong> <%= product.getColor() %></p>
    <p><strong>Price:</strong> <%= product.getPrice() %></p>
    <p>Do you want to add another product?</p>
    <a href="form.html">Add Product</a>
</body>
</html>