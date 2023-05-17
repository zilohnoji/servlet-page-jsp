<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
	<!DOCTYPE html>

	<html>

	<head>
		<meta charset="ISO-8859-1" />
		<title>Account</title>
		<link rel="stylesheet" href="website/Homepage/css/style_login.css" />
	</head>

	<body>
		<div class="row">
			<div class="main">
				<div class="container-form">
					<form action="ServletLog" method="post">
						<h1>Login</h1>
						<input name="name" placeholder="Username" /> <input name="password" type="password"
							placeholder="Password" />
						<a href="website/Homepage/register.jsp" class="link">Create account</a>
						<div class="unique">
							<button class="button" type="submit">Sign-in</button>
						</div>
						<h4 class="style-h4">${msg}</h4>
					</form>
				</div>
				<img src="../../../../../../Downloads/eumermo.jpg" class="image">
			</div>
		</div>
	</body>

	</html>