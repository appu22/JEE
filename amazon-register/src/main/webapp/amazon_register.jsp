<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Amazon Register Page</title>
<style> 
input {
  width: 50%;
}
form{

margin-left:20%;
margin-right:20%;
margin-top:5%;
background-color: skyblue;
padding: 0;
}button:hover {
  opacity: 0.5;
}
submit{
text-align: center;}
</style>
</head>
<body bgcolor="clack" >
<h1>Register Form </h1>
<form action="register" >
Your name : <input type="text" name="nm"></input><br><br>
Mobile No : <input type="text" name="mobileno"></input><br><br>
Email-ID : <input type="text" name="email"></input><br><br>
Password : <input type="text" name="pwd"></input><br><br>
<input type="submit" value="Submit">
</form>

</body>
</html>