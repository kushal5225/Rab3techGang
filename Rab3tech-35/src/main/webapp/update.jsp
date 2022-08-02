<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>

<title>Insert title here</title>
</head>
<body>
 <form action="editServlet" method="get">
    <div class="form-group">
      <label for="userName">User Name:</label>
      <input type="hidden" class="form-control" placeholder="Enter user name" name="username" value= "${username}">
    </div>
    <div class="form-group">
      <label for="pwd">Password:</label>
      <input type="password" class="form-control" placeholder="Enter password" name="password" value= "${password}">
    </div>
      <div class="form-group">
      <label for="country">Country:</label>
      <input type="text" class="form-control" placeholder="Enter user country" name="country" value= "${country}">
    </div>

    <div class="form-group">
      <label for="emmaIL">Email Id:</label>
      <input type="text" class="form-control" placeholder="Enter user emailId" name="emailId" value= "${emailId}">
    </div>
    <button type="submit" class="btn btn-danger">Submit</button>
  </form>
  

</body>
</html>