<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Client Details</title>
</head>
<style>

body{
   background: linear-gradient(to bottom, #9933ff 0%, #cc0099 100%);
     width:100%;
   height:100vh;
   
}
.submit:hover{
   background-color:#FFCC66;
    color: black;
}
</style>
<body>
<h1>To be update: ${client.id}</h1>
 <form action="create">
            Client ID : <input type="text" name="id" required
			placeholder="Enter ID" autocomplete="off"><br> <br>
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
</body>
</html>