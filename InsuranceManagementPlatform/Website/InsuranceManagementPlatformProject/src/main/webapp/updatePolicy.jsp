<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Policy </title>
<style>
body{
      background: linear-gradient(to bottom, #ff66cc 0%, #ffcc66 100%);
      width:100%;
      height:100vh;
  
}
.submit:hover{
   background-color:#FFCC66;
    color: black;
}

</style>
</head>
<body>
<h1>To be update:${insurancePolicy.id}</h1>
   <form action="createInsurance">
      
            Insurance ID : <input type="number" name="id" required placeholder="Enter ID" autocomplete="off"><br> <br>
		    Policy Number: <input type="text" name="policyNumber" minlength="3"
			maxlength="20" required placeholder="Enter policy number"><br><br>
			
		    Type : <input type="text" name="type" required placeholder="Enter the type of Insurance"><br><br>
		    Coverage Amount:<input type="number"   name="coverageAmount" required 
		    placeholder="Enter coverage Amount" ><br><br>
		    Premium :<input type="number" name="premium" plceholder="Enter the premium"><br><br>
			Start Date :<input type="date" name="startDate" required ><br><br>
			End date :<input type="date" name="endDate" required ><br><br>
			
			<input type="submit" class="submit">	
			
</form><hr>
</body>
</html>