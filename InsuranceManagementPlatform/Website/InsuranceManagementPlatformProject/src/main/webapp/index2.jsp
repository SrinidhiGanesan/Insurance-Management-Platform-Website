<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Claim Details</title>
<style>
body{
 background: linear-gradient(to bottom right, #00ffcc 0%, #ffff66 100%);
height:110vh;
width:100%;
}
.submit:hover{
   background-color:#FFCC66;
    color: black;
}

</style>
</head>

<body>
 
<h1 align="center">Claim CRUD Operation</h1>
<hr width="200%;"color="black">
<h1>New Claim details</h1>
<form action="createClaim">
  Claim Id :<input type="number" name="id" required placeholder="Enter Claim id"><br><br>
  Description :<input type="text" name="description" required placeholder="Enter the description">
  <br><br><input type="submit" class="submit">

</form>
<hr>
 <h1>Get Claim details By Id</h1>
  <form action="getClaim">
     
   Enter ID : <input type="number" name="id" required
			placeholder="Enter ID" ><br> <br>
	
			<input type="submit" class="submit">
			
		
   </form>
   <hr>
    <h1>Delete Claim details By Id</h1>
  <form action="deleteClaim">
     
   Enter ID : <input type="number" name="id" required
			placeholder="Enter ID" ><br> <br>
	
			<input type="submit" class="submit">
			
		
   </form>
   <hr>
    <h1>Update Claim details By Id</h1>
  <form action="updateClaim">
     
   Enter ID : <input type="number" name="id" required
			placeholder="Enter ID" ><br> <br>
	
			<input type="submit" class="submit">
			
		
   </form>
   <hr>
 <form align="center" action="/welcome" style="font-size: large;">
		Goto Main Page : <input type="submit" value="Main Page" class="submit">
	</form>
</body>
</html>