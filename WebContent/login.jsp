<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${msg }
<form action="loginServlet" method="post">
<table>
<tr>
<tr>
<td>Uesr Name</td>
<td><input type="text" name="uname"></td>
</tr>
<tr>
<td>PassWord</td>
<td><input type="password" name="pass"></td>
</tr>
<tr>
<td><input type="submit" value="submit"></td>
</tr>
</table>
</form>
</body>
</html>