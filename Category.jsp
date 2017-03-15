<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CategoryList</title>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
</head>
<body>
	<jsp:include page="CategoryMenu1.jsp"></jsp:include>
	<h2>
		<center>Manage Categories</center>
	</h2>
	<hr>
<%-- 
	<f:form action="manage_category_create" commandName="cat">
		<input type="text" name="Cat_Id" placeholder="Cat_ID">
		<input type="text" name="Cat_Name" placeholder="Cat_Name">
		<input type="text" name="Cat_Description" placeholder="Cat_Description">
		<input type="submit" name="create">
	</f:form> --%>

	<%-- <form action="manage_category_create" method="post">
<input type="text" name="id"> 
<input type="text" name="name"> 
<input type="text" name="description"> 
<input type="submit" value="Create">

</form>
	<table border="2">

		<thead>
			<tr>
				<td>ID</td>  	<td>Name</td>	<td>Description</td> <td>Action</td>
		</tr>
		</thead>

		<c:forEach var="category" items="${categoryList}">
			<tr>

				<td>${category.id}</td>
				<td>${category.name}</td>
				<td>${category.description}</td>
				<td><a href="<c:url value='/manage_category_edit/${category.id}' />">Edit</a></td>
					
					<td><a href="<c:url value='/manage_category_delete/${category.id}' />">Delete</a></td>

			</tr>
		</c:forEach>

	</table>

 --%>
</body>
</html>
