<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Example</title>
</head>
<body>
	<form method="post" action="/home/login">
		<tr>
			<br /><td>UserName</td>
			<td><input type="text" name="userName" value="" /></td><br />
		</tr>

		<tr>
			<br /><td>password</td>
			<td><input type="password" name="password" value=""></td><br />
		</tr>
		<tr>
			<br /><td><input type="submit" value="Login"></td><br />
		</tr>

		<tr>
			<br /><td colspan="2">if forgot password!! <a href="/home/forgotLogin">forgotpassword</a></td><br />

		</tr>
		
		
		<tr>
			<td colspan="2">if not registeryet!! <a href="/newregister">new employee</a></td>

		</tr>
	</form>
</body>
</html>