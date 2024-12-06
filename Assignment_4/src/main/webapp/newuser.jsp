<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New User</title>
</head>
<body>
	<form method="post" action="register.jsp">
		<h2><b>User Registration</b></h2></br>
		First Name: <input type="text" name="firstname"/> <br/><br/>
		Last Name: <input type="text" name="lastname"/> <br/><br/>
		Email: <input type="text" name="email"/> <br/><br/>
		Password: <input type="password" name="passwd"/> <br/><br/>
		Date of Birth: <input type="date" name="dob"/> <br/><br/>
		<input type="submit" value="Sign Up"/>
		<p>
			<a href="index.jsp">Login</a>
		</p>
	</form>
</body>
</html>