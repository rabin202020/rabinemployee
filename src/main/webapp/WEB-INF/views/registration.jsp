<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<!-- <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" /> -->


</head>
<body>
	<h1>Registration Form</h1>

	 <form action="/postemployee" method="post">
		<table style="with: 50%">
			<tr>
				<td>First Name</td>
				<td><input type="text" name="firstName" /></td>
			</tr>
			<tr>
				<td>Last Name</td>
				<td><input type="text" name="lastName" /></td>
			</tr>
			<tr>
				<td>UserName</td>
				<td><input type="text" name="userName" /></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password" /></td>
			</tr>
			<tr>
				<td>StreetName</td>
				<td><input type="streetName" name="streetName" /></td>
			</tr>
			<tr>
				<td>Landmark</td>
				<td><input type="landmark" name="landmark" /></td>
			</tr>
			<tr>
				<td>CityName</td>
				<td><input type="cityName" name="cityName" /></td>
			</tr>
			<tr>
				<td>StateName</td>
				<td><input type="stateName" name="stateName" /></td>
				<option value="Karnataka">KARNA</option>
                <option value="Kerala">KER</option>
                <option value="Kashmir">KASH</option>
                <option value="Orissa">ORS</option>
                <option value="Bihar">BIH</option>
                <option value="Maharashtra">MAHA</option>
			</tr>
			<tr>
				<td>PinCode</td>
				<td><input type="pinCode" name="pinCode" /></td>
			</tr>
		</table>
		
		<input type="submit" value="register"/>
		<br>
	 </form>
	 
	 

</body>
</html>