<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insta-Registration</title>
<link rel="stylesheet" href="style.css" />

</head>
<body>
	<div class="container">
		<form action="rs">
			<div class="user-details">
				<div border="2px">
					<div class="input-box">
						<label class="details">Name: </label> <input class="input-box"
							type="text" name="nm" required="required" />
					</div>
					<div class="input-box">
						<label class="details">LastName :</label> <input class="input-box"
							type="text" name="ln" />
					</div>
					<div class="input-box">
						<label class="details">Mobile No :</label> <input
							class="input-box" type="text" name="mn" />
					</div>
					<div class="input-box">
						<label class="details">Gender :</label> <input
							class="input-box" type="text" name="gen" />
					</div>
				<br>

					<button name="submit">Submit</button>
				</div>
			</div>
		</form>
	</div>
</body>
</html>