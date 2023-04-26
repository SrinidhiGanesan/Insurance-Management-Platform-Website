<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Claim</title>
<style >
body{
background: linear-gradient(to bottom right, #00ffcc 0%, #ffcc99 100%);
width:100%;
 height:100vh;

}


</style>
</head>
<body>
<h1>To be Update:${claim.id}</h1>
<form action="createClaim">
  Claim Id :<input type="number" name="id" required placeholder="Enter Claim Id"><br><br>
  Description :<input type="text" name="description" required placeholder="Enter the description">
  <br><br><input type="submit">

</form>
<hr>
</body>
</html>