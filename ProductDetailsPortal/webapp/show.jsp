<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display</title>
</head>
<body>

<h3 align="center"><hr>Product Details<hr></h3>

<h3 align="center"><%= "Product Id : " + session.getAttribute("pid") %> <br> <br>

<h3 align="center"><%= "Product Name : " + session.getAttribute("pname") %>  <br> <br>

<h3 align="center"><%= "Product Price : " + session.getAttribute("pprice") %>


</body>
</html>

