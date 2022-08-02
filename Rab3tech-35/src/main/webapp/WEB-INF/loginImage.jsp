<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">


  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
</head>
 
<Style>
body {Background-color:powderblue

}
h2 {color: red
}
h3 {color: green
}
</Style>
<body>
<div class="container">
 
            
  <table class="table table-hover">
<h2> Congratulations!!!!</h2>
<h2>Successfully logged-in</h2>
 

    <thead>
      <tr>
        <th>username</th>
         <th>password</th>
        <th>country</th>
        <th>emailId</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td> ${username}</td>
       <td>  ${password}</td>
        <td> ${country} </td>
       <td>  ${emailId}   </td>
      </tr>
     
    </tbody>
  </table>
</div>
  <a href="loginImage.jsp">click here for page</a>
</body>
</html>