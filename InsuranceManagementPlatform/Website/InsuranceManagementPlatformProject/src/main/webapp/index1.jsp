<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insurance Policy</title>
<style>
body{
background: linear-gradient(to bottom, #9933ff 0%, #cc0099 100%);
width:100%;
   height:150vh;
}
.submit:hover{
   background-color:#FFCC66;
    color: black;
}


</style>
</head>
<body>
<h1 align="center">Insurance Policy CRUD Operation</h1>
<hr width="200%;"color="black">
<h1>Add Insurance details</h1>
   <form action="createInsurance">
      
            Insurance ID : <input type="number" name="id" required placeholder="Enter ID" autocomplete="off"><br> <br>
		    Policy Number: <input type="text" name="policyNumber" minlength="3"
			maxlength="20" required placeholder="Enter policy number"><br><br>
			
		    Type : <input type="text" name="type" required placeholder="Enter the type of Insurance"><br><br>
		    Coverage Amount :<input type="number"   name="coverageAmount" required 
		    placeholder="Enter coverage Amount" ><br><br>
		    Premium :<input type="number" name="premium" plceholder="Enter the premium"><br><br>
			Start Date :<input type="date" name="startDate" required ><br><br>
			End date :<input type="date" name="endDate" required ><br><br>
			
			<input type="submit" class="submit">	
			
</form><hr>
   <h1>Get Policy details By Id</h1>
  <form action="getPolicy">
     
   Enter ID : <input type="number" name="id" required
			placeholder="Enter ID" ><br> <br>
	
			<input type="submit" class="submit">
			
		
   </form>
   <hr>
   <h1>Delete Policy details By Id</h1>
  <form action="deletePolicy">
     
   Enter ID : <input type="number" name="id" required
			placeholder="Enter ID"><br> <br>
	
			<input type="submit" class="submit">
			
		
   </form>
   <hr>
    <h1>Update Policy details By Id</h1>
    <form action="updatePolicy">
     
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