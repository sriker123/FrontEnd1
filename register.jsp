<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Page</title>
</head>
<body>

	<form action ="validate">
	<div class="input-group margin-bottom-sm">
		<span class="input-group-addon">
			<i  class="fa fa-envelope-o"aria-hidden="true"></i></span>
		<input class="form-control" type ="text" name= "UserID" placeholder="USERID"><br>
	</div>
	<div class="input-group">
			<span class="input-group-addon"><i class="fa fa-key fa-fw"
				aria-hidden="true"></i></span> <input class="form-control" type="password"
				placeholder="Password"> 
	</div>
	<div class="input-group">
		<span class="input-group-addon"><i class="fa-fa-key fa-fw" aria-hidden="true"></i></span>
<input class="form-control" type="text" placeholder="PhoneNumber"><br>
	</div>
	<div class="input-group">
	<span class="input-group-addon"><i class="fa-fa-key fa-fw" aria-hidden="true"></i></span>
<input class="form-control" type="text" placeholder="Email"><br>
	</div>
	<div class="input-group">
	<span class="input-group-addon"><i class="fa-fa-key fa-fw" aria-hidden="true"></i></span>
<input class="form-control" type="text" placeholder="Address"><br>
	</div>
</form>

</body>
</html>