<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
    <!-- CSS BOOTSTRAP -->
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
      rel="stylesheet"
     >
<meta charset="ISO-8859-1">
<title>Padel Booking App</title>
</head>
<body>
	<div class="container">
	<span class="col align-self-start"><h4>Login Form</h4></span>
		<br>
	<form action="doLogin" method="post">
		<div class="form-group">
	    	<label for="inputUsername">Username</label>
	    	<input type="text" class="form-control" name="inputUsername" placeholder="Username" required>
	  </div>
	  	<br>
	  	<div class="form-group">
	    	<label for="inputPassword1">Password</label>
	    	<input type="password" class="form-control" name="inputPassword" placeholder="Password" required>
	    </div>
	    <br>
  	<button type="submit" class="btn btn-success" value="register">Submit</button>
	</form>
   </div>
</body>
</html>