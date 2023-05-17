<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
	<!DOCTYPE html>

	<html>

	<head>
		<meta charset="ISO-8859-1" />
		<title>JSProject</title>
		<link rel="stylesheet" href="css/style.css" />
	</head>

	<body>
		<div class="row">
			<div class="container-form">
				<form action="ServletForm" method="post">
					<h1>Register</h1>
					<input name="name" placeholder="Username" /> <input name="email" placeholder="E-mail" /> <input
						name="password" type="password" placeholder="Password" />
					<div class="unique">
						<button class="button" type="submit">Sign-in</button>
					</div>
					<h4 class="style-h4">${msg}</h4>
				</form>
			</div>

		</div>
	</body>

	</html>