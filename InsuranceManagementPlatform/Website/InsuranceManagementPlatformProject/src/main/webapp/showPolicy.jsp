<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Policy Detail</title>
<style >
body{
   background: linear-gradient(to bottom, #ffcc66 0%, #cc0099 100%);
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

<h1 align="center" >Insurance Policy Details</h1>
<table border="5px" width="800" height="300" align="center">
<tr>
<th> Policy ID</th>
<th> Policy Number</th>
<th> Policy Type</th>
<th> Coverage Amount</th>
<th> Premium</th>
<th> Start Date</th>
<th> End Date</th>
</tr>
  <td>${insurancePolicy.id}</td>
  <td>${insurancePolicy.policyNumber}</td>
  <td>${insurancePolicy.type}</td>
  <td>${insurancePolicy.coverageAmount}</td>
  <td>${insurancePolicy.premium}</td>
  <td>${insurancePolicy.startDate}</td>
  <td>${insurancePolicy.endDate}</td>
  
</table><br><br>


<form align="center" action="/index1" style="font-size: large;">
		Goto Home : <input type="submit" value="Home" class="submit">
	</form>
</html>