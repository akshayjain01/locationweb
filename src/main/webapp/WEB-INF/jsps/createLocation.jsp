<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create Location</title>
</head>
<body>

<form action = "saveLoc" method = "post">
Id : <input type = "number" name = "id"><br>
Code : <input type = "text" name = "code"><br> 
Name : <input type = "text" name = "name"><br>
Type : Urban <input type = "radio" name = "type" value = "URBAN"><br>
		Rural <input type = "radio" name = "type" value = "RURAL"><br><br>
		<input type = "submit" value = "save"/>
</form>
${msg}

<a href ="displayLocations">View All </a>
<a href ="generateReport">Report </a>
</body>
</html>