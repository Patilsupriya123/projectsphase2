<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table>
<tr>
<h3 align="center"> --------Enter Product Details--------</h3>
<form action="save" method="get">
<h3 align="center">Product Name: <input type="text" name="name" placeholder="Enter name of product"  style=border-color:purple "/></h3>
<h3 align="center">Product Price: <input type="text" name="price" placeholder="Enter price of product" style=border-color:purple "/></h3>
<h3 align="center">Product Quantity: <input type="text" name="quantity" placeholder="Enter quantity of product" style=border-color:purple " /></h3>
<h2 align="center" >

<input type="submit" value="Add" style=border-color:red "/></h2>
</form>
</tr>
</table>

</body>
</html>