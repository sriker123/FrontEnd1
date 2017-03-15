<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body>

	 <form action="validate" method="post">
	<!-- 	 <div class="input-group margin-bottom-sm">
			<span class="input-group-addon"><i
				class="fa fa-envelope-o fa-fw" aria-hidden="true"></i></span> <input
				class="userID" class="form-control" type="text" placeholder="Email address">
		</div>
		<div class="input-group">
			<span class="input-group-addon"><i class="fa fa-key fa-fw"
				aria-hidden="true"></i></span> <input class="password" class="form-control"
				type="password" placeholder="Password">
		</div>  -->
		 User: <input type="text" name="userID" placeholder="UserName">
		Password: <input type="password" name="password" placeholder="Password">
		<input type="submit" value="login"> <input type="reset"
			value="reset">

	</form>

</body>
</html>