<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Details</title>
</head>
<body>
	<table cellpadding="3" cellspacing="3" border="1">
		<tr>
			<th>id</th>
			<th>firstName</th>
			<th>lastName</th>
			<th>userName</th>
		</tr>
		<logic:iterate id="data" name="ExcelForm" property="userList">
			<tr>
				<td><bean:write name="data" property="id" /></td>
				<td><bean:write name="data" property="firstName" /></td>
				<td><bean:write name="data" property="lastName" /></td>
				<td><bean:write name="data" property="username" /></td>
			</tr>
		</logic:iterate>
	</table>
</body>
</html>