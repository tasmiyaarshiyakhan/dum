<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
    href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
    integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbIo6tWS"
    crossorigin="anonymous">

<title>Customer Relationship Manager</title>
</head>
<body>

<div class="container">
<h3>Customer-List</h3>
<hr>
<a href="/customerRelationshipManagement/Customer/showFormForAdd"
class="btn btn-primary btn-sn mb-3">Add Customer</a>


<table class="table table bordered table stripped">
<thead class ="thead-dark">

<tr>
<th>FirstName</th>
<th>lastName</th>
<th>Email</th>
<th>Action</th>

</tr>
</thead>
<tbody>

     <c:forEach items="${Customers}" var="tempCustomer">
     <tr>      
     <td><c:out value="${tempCustomer.firstName }"/></td>
     <td><c:out value="${tempCustomer.lastName }"/></td>
     <td><c:out value="${tempCustomer.Email }"/></td>
     
     
     <td>
     <a href="/CustomerRelationshipManagement/customer/showFormForUpdate?id=${tempCustomer.id}"
     class="btn btn-Info btn-sn" >Update</a>
     
     <a href="/CustomerRelationshipManagement/customer/delete?id=${tempCustomer.id}"
     class="btn btn-danger btn-sn" 
      onclick="if(!(confirm('Are you Sure you want to delete'))) return false">
      Delete</a>
    
     </td>
     </tr> 

</c:forEach>

</tbody>



</table>

</div>

</body>
</html>