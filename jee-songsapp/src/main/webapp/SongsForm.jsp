<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Songs-Search</title>
<link rel="stylesheet" href="style.css" />

</head>
<body>
	<!--  <marquee>WelCome To Songs Application</marquee> -->
	<div class="container">
		<form action="songsform">
			<div class="user-details">
				<div border="2px">
					<div class="input-box">
					
						<label class="details">Songs Name: </label> <input class="input-box"
							type="text" name="songsname" required="required" />
					</div>
					<div class="input-box">
						<label class="details">Featuring :</label> <input class="input-box"
							type="text" name="featuring" required="required" />
					</div>
					<div class="input-box">
						<label class="details">Singer :</label> <input
							class="input-box" type="text" name="singer" required="required" />
					</div>
					<div class="input-box">
						<label class="details">Duration :</label> <input
							class="input-box" type="text" name="duration" required="required"  />
					</div>
				<br>
				<div class="input-box">
						<label class="details">Language :</label> <input
							class="input-box" type="text" name="lang" required="required"  />
					</div>
				<div class="input-box">
						<label class="details">Lyricist :</label> <input
							class="input-box" type="text" name="lyricist" required="required"  />
					</div>

					<button name="submit" value="SUBMIT" >Submit</button>
				</div>
			</div>
		</form>
	</div>
</body>
</html>