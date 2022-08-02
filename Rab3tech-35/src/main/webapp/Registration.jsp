
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

 <title>Tech</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>

<title>Insert title here</title>
</head>

<Style>
body { background-color: powderblue;}
input { color: red;}
h2 {color:white;}

</Style>
<body >

<div class="container">

  <h2>Registration form</h2>
  <form action="RegistrationServlet" method="get">
    <div class="form-group">
      <label for="userName">User Name:</label>
      <input type="text" class="form-control" placeholder="Enter user name" name="username">
    </div>
    <div class="form-group">
      <label for="pwd">Password:</label>
      <input type="password" class="form-control" placeholder="Enter password" name="password"  >
    </div>
      <div class="form-group">
      <label for="country">Country:</label>
      <input type="text" class="form-control" placeholder="Enter user country" name="country" >
    </div>

    <div class="form-group">
      <label for="emmaIL">Email Id:</label>
      <input type="text" class="form-control" placeholder="Enter user emailId" name="emailId" >
    </div>
    <button type="submit" class="btn btn-danger">Submit</button>
  </form>
  
</div>


</body>
</html>