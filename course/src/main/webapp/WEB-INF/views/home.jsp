<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Project Management</title>

<link rel="stylesheet" href="<spring:url value="/resources/css/home.css"/>" type="text/css"/>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<jsp:include page="../views/fragments/header.jsp"/>

<div class="container">

<h1>Current Project</h1>

<ul class="list-group">
<li class="list-group-item">Project Name:<span>${currentProject.name}</span></li>
<li class="list-group-item">Project Type: <span> ${currentProject.type}</span></li>
<li class="list-group-item">Sponsors:<span>${currentProject.sponsors}</span></li>
<li class="list-group-item">Funds: <span>${currentProject.authorizedFunds }</span></li>
<li class="list-group-item">Description:<span>${currentProject.description}</span></li>
</ul>

</div>
</body>
</html> 