<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Project Management</title>


<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>

<body>

<jsp:include page="../views/fragments/header.jsp"></jsp:include>

<div class="container">
<h2>Projects</h2>
<table class="table table-hover">
<tbody>
<tr>
<th>Name</th><th>Resource Type</th><th>Cost</th>
</tr>

<c:forEach items="${resources}" var="resource">
<tr>
<td>${resource.name }</td><td>${resource.type }</td><td>${resource.cost }</td>
</tr>
</c:forEach>
</tbody>
</table>
</div>
</body>
</html>