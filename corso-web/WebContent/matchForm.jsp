<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div class="container-fluid">
	<div class="row">
    <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12" style="height: 35px; background-color:#DBDBDB;">
     
	<div align="center">
	<h1>New Match</h1>
	<form action="doMatch" method="get">
	<table style="with 80%">
	<tr>
	<td>Data</td>
	<td><input type="date" name="data" required/></td>
	</tr>
	<tr>
	<td>Campo</td>
							<td><select name="campo" id="campo">
								<option value="Garden center">Garden Center</option>
								<option value="Padel Palermo">Padel Palermo</option>
								<option value="Leoni">Leoni</option>
								<option value="TC Club>">TC Club</option>
							</select></td>
	</tr>
	</table>
	<input type="submit" value="matchForm" />
	</form>
	</div>
	<a href="index.jsp"><input type="submit" value="Torna ad index" /></a>
	</div>
	</div>
	</div>
</body>
</html>