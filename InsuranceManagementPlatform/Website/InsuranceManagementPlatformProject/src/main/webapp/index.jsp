<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insurance Management Platform</title>
<style>
body{
  background: linear-gradient(10.6deg, rgb(0, 37, 84) 11.2%, rgba(0, 37, 84, 0.32) 100.2%);
}
.submit:hover{
   background-color:#FFCC66;
    color: black;
}


</style>

</head>
<body>

      <h1 align="center">Welcome To Our Insurance Management Platform Website!</h1>
      <hr width="200%;"color="black">
      <h1 align="center">Client CRUD Operation</h1><hr width="200%;"color="black">
   <h1>Add New details</h1>
   <form action="create">
          
           Client ID : <input type="number"  name="id" required
			placeholder="Enter ID" ><br> <br>
		   Client Name : <input type="text" name="name" minlength="3"
			maxlength="20" required placeholder="Enter Name"><br><br>
			
		    Client DOB : <input type="date" name="dateOfBirth" 
			required ><br><br>
			Client Address : <input type="text" name="address" minlength="3"
			maxlength="20" required placeholder="Enter Address"><br><br>
			Client Contact Information : <input type="text" name="contactInformation" minlength="3"
			maxlength="20" required placeholder="Enter Contact Information"><br><br>
			
			<input type="submit" class="submit">
			
</form>
   <hr>
 <h1>Get Client details By Id</h1>
  <form action="getValue">
     
   Enter ID : <input type="number" name="id" required
			placeholder="Enter ID" ><br> <br>
	
			<input type="submit" class="submit">
		
   </form>
   <hr>
    <h1>Delete Client details By Id</h1>
     <form action="deleteValue">
     
   Enter ID : <input type="text" name="id" required
			placeholder="Enter ID" ><br> <br>
	
			<input type="submit" class="submit">
		
   </form>
   
   <hr>
       <h1>Update Client details By Id</h1>
     <form action="updateValue">
     
   Enter ID : <input type="text" name="id" required
			placeholder="Enter ID" ><br> <br>
	
			<input type="submit" class="submit">
		
   </form>
<hr>
  <form align="center" action="/welcome" style="font-size: large;">
		Goto Main Page : <input type="submit" value="Main Page" class="submit">
	</form>
</body>
</html>