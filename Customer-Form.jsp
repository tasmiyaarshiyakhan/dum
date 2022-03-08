<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
link rel="stylesheet"
  ref="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" 
  integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbIo6tWS"
   crossorigin="anonymous">
<title>CustomerRelationshipManager</title>
</head>
<body>
<div class="container">
<h3>Save Customer</h3>
<hr>
<p class="h4 mb-4">Customer</p>

<form action="/customerRelationshipManagement/customer/save" method="post">

<input type="hidden" name="id"  value= "${Customer.id}"/>

<div class="form-inline">
<input type="text" name="firstName" value="${Customer.firstName}"
class="form-control mb-4 col-4" placeholder="firstName">
 </div>

<div class="form-inline">
<input type="text" name="lastName" value="${Customer.lastName}"
class="form-control mb-4 col-4" placeholder="lastName">
 </div>
 
 <div class="form-inline">
<input type="text" name="Email" value="${Customer.Email}"
class="form-control mb-4 col-4" placeholder="Email">
 </div>
 
 
 <button type="Submit" class="btn btn-info col-2">Save
 </button>
</form>
<hr>
<a href="/customerRelationshipManagement/Customer/list">Back to List</a>
</div>

</body>
</html>




