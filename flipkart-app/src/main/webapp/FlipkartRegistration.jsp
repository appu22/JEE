<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Flipkart-Registration page</title>
</head>
<style>
body{
background-color: skyblue;
}
*{
color: black;
}
input{
width:50%;
  padding: 12px 20px;
  margin: 8px 0;
  box-sizing: border-box;
  border: 1px solid #555;
  outline: none;
}

input[type=text] {
  background-color: BLACK;
  color: white;
  border-radius: 3px;
  border: 2px solid red;
}
input[type=text]:focus {
  background-color: lightblue;
}
</style>
<body>
<h1><center>Registration page</center></h1>

<form action="rs" for=form>
	<div>
	
	<label for="input-1">Name:</label>
	<input name="nm" placeholder="enter name" type="text"/> <br><br>
	
	<label for="input-2">LastName: </label>
	<input name="ln" placeholder="enter lasname" type= "text"/><br><br>
	
	<label for="input-3">Mobil No :</label>
	<input type="text" placeholder="enter mobile no" name="mobileno" ></input><br><br>
	
	
	
	<label for="input-4">Email-ID :</label>
	<input type="text" placeholder="enter Email-id" name="email" ></input>
	
	<br><br>
	<input type="submit" value="Submit" name="button-1"/ >
	
	</div>

</form>



</body>
</html>