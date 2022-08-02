<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LoginPage</title>
</head>
<body>
${message} //re-entry again;
<h2>Login Form</h2>
<form action="LoginServlet" method="post">
  <label for="uname">User name:</label><br>
  <input type="text"  name="uname"><br>
  <label for="pass">Password:</label><br>
  <input type="password"  name="password" ><br><br>
  <input type="submit" value="Submit">
  <input type="reset" value="Reset">
</form>
</body>
</html>