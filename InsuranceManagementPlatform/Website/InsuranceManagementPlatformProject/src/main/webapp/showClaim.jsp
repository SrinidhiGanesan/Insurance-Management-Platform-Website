<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Claim Details</title>
<style >
body{
  background: linear-gradient(to top left, #006699 0%, #99ff99 100%);
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
 <h1 align="center" >Claim Details</h1>
<table border="5px" width="400" height="300" align="center">
<tr>
<th>Claim Id</th>
<th>Description</th>
</tr>

<td>${claim.id }</td>
<td>${claim.description }</td>


</table>
<br><br>

<form align="center" action="/index2" style="font-size: large;">
		Goto Home : <input type="submit" value="Home" class="submit" >
	</form>
</body>
</html>