<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BSE | STOCK PRICE</title>
</head>
<body bgcolor="pink">
	<h3>GET STOCK PRICE HERE</h3>
	${msg}
	<form action="getTotalCount">
		<table>
			<tr>
				<td>COMPANY NAME</td>
				<td><input type="text" name="companyName"></td>
			</tr>
			<tr>
				<td>STOCK QUANTITY</td>
				<td><input type="text" name="quantity"></td>
			</tr>
			<tr><td><input type="submit" value="Get Cost"></td></tr>
		</table>
	</form>
</body>
</html>