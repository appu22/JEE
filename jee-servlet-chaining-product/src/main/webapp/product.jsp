<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Form</title>
</head>
<body>
	<div>
		<form action="product"  method="post">

			<div>
			Product Name : <input type="text" name="pname"/> <br> <br>
			Product Qty : <input type="text" name="pQty" /><br> <br>
			Price : <input type="text" name="price"> <br> <br>
			
			<input type="submit" value= "SUBMIT" />
			
			</div>
		</form>

	</div>


</body>
</html>