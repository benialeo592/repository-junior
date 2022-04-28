
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
<title>Insert title here</title>
</head>
<body>
	<!-- As a heading -->
	<nav class="navbar navbar-light bg-light">
  		<div class="container-fluid">
    		<span class="navbar-brand mb-0 h1">Padel Booking App</span>
    		  <span class="navbar-text">
 					<%
        if (session.getAttribute("username") == null) {
    %>
        <a href="login.jsp">Login</a>
        <a href="subscription.jsp">Subscribe</a>  
    <%
        } 
        else {
    %>
       <a href="${pageContext.request.contextPath}/doLogout"><p>Logout</p></a>
       <p>Username: ${username}</p>
    <%
        }
    %>
    	 
     		  </span>

  		</div>
</nav>
</body>
</html>