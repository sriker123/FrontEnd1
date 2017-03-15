<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Category</title>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>	
<!-- Add 3 links  -->
<!-- http://localhost:7070/SCFE1/validate -->
<a href= "manage_categories">Manage Categories </a>

<a href="manage_suppliers">Manage Suppliers</a>

<a href="manage_products">Manage Products</a>

<c:if test="${isUserClickedCategory==true }">
<jsp:include page="Category.jsp"></jsp:include>
</c:if>

<c:if test="${isUserClickedProducts==true }">
<jsp:include page="Product.jsp"></jsp:include>
</c:if>

<c:if test="${isUserClickedSuppliers==true }">
<jsp:include page="Supplier.jsp"></jsp:include>
</c:if>

</body>
</html>