<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
</head>
<body>
<div class="container">
  <h2>All  list</h2>
           
  <table class="table table-dark table-hover">
    <thead>
       <tr>
        <th>username</th>
         <th>password</th>
        <th>country</th>
        <th>emailId</th>
         <th colspan=2>Action(delete/update) </th>
      </tr>
    </thead>
    <tbody>
     <c:forEach items="${userdto}" var="tempa">
      <tr>
      <tr bgcolor="pink">
          <td>${tempa.username}</td>
        <td>${tempa.password}</td>
        <td> ${tempa.country} </td>
       <td>  ${tempa.emailId}   </td>
     <td><a href="deletServlet?username=${tempa.username}"><button type="button" class="btn btn-primary"><img alt="login emage" src="image/ddddd.jpeg" style=height:30px;></button></a> </td>
       <td><a href="update.jsp?username=${tempa.username}"><button type="button" class="btn btn-primary"><img alt="login emage" src="image/edit.png" style=height:30px;> </button></a></td>
      </tr>
  
        </c:forEach> 
    </tbody>
   
  </table>
</div>

</body>
</html>