<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<div class="row">

<h2>Please Review the resource you added</h2>
<div class="form-group">
<label for="project-name">Name</label>

<span>${resource.name }</span>
</div>

<div class="form-group">
<label for="project-type">Type</label>
<span>${resource.type }</span>
</div>

<div class="form-group">
<label for="cost">Cost</label>
<span>${resource.cost }</span>
</div>

<div class="form-group">
<label>Unit of Measure</label>
<span>${resource.unitOfMeasure }</span>
</div>

<div class="form-group">
<label >Indicators</label>
<c:forEach var="indicator" items="${resource.indicators }">
<span>${ indicator}</span>
</c:forEach>

<a href="<spring:url value="/resource/add"/>" class="btn btn-default">Edit</a>
<a href="<spring:url value="/resource/save"/>" 
class="btn btn-default">Save</a>
</div>
</div>
</div>
</body>
</html>