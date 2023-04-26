<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Client details</title>
<style>
body{
  background: linear-gradient(113.5deg, rgb(234, 234, 234) 22.3%, rgb(201, 234, 211) 56.6%, rgb(255, 180, 189) 90.9%);
  width:100%;
  height:100vh;
 
}

table, th ,td  {
	border: 4px solid grey;
	border-collapse: collapse;
	text-align: center;
	font-size: 20px;
}
.submit:hover{
   background-color:#FFCC66;
    color: black;
}

</style>
</head>
<body>
<h1 align="center" >Client Details</h1>
<table border="5px" width="700" height="300" align="center">
<tr>
<th> Client ID</th>
<th> Client Name</th>
<th> Client DOB</th>
<th> Client Adress</th>
<th> Client Contact Information</th>
</tr>
  <td>${client.id}</td>
  <td>${client.name}</td>
  <td>${client.dateOfBirth}</td>
  <td>${client.address}</td>
  <td>${client.contactInformation}</td>
  
</table><br><br>

  <form align="center" action="/index" style="font-size: large;">
		Goto Home : <input type="submit" value="Home" class="submit">
	</form>

</body>
</html>
