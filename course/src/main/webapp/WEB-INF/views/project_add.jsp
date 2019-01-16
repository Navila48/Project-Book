<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
<jsp:include page="../views/fragments/header.jsp"/>
<div class="container">
<div class="row">


<spring:url value="/project/add" var="formUrl"/>
<form:form action="${formUrl }" method="post"  modelAttribute="project" class="col-md-8 col-md-offset-2">
<div class="form-group">
<label for="project-name">Name</label>
<form:input path="name" id="project-name" cssClass="form-control" />
<form:errors path="name"/>
</div>

<div class="form-group">
<label for="project_type">Project Type</label>
<form:select path="type" items="${typeOptions }" cssClass="selectPicker"></form:select>
</div>

<div class="form-group">
<label for="sponsor-name">Sponsor Name</label>
<form:input id="sponsor-name" cssClass="form-control" path="sponsors.name"/>
</div>

<div class="form-group">
<label for="sponsor-phone">Sponsor Phone</label>
<form:input id="sponsor-phone" cssClass="form-control" path="sponsors.phone"/>
</div>

<div class="form-group">
<label for="sponsor-email">Sponsor Email</label>
<form:input id="sponsor-email" cssClass="form-control" path="sponsors.email"/>
</div>

<div class="form-group">
<label for="funds">Authorized Funds</label>
<form:input id="funds" cssClass="form-control" path="authorizedFunds"/>
</div>

<div class="form-group">
<label for="hours">Authorized Hours</label>
<form:input  id="hours" cssClass="form-control" path="authorizedHours"/>
</div>

<div class="form-group">
<label for="description">Description</label>
<textarea class="form-control" name="description" rows="3"></textarea>
<form:errors path="description"></form:errors>
</div>

<div class="form-group">
<label for="poc">POC</label>
<form:input id="poc" cssClass="form-control" path="pointOfContact[0]"/>
</div>

<div class="form-group">
<label for="poc2">POC2</label>
<form:input id="poc2" cssClass="form-control" path="pointOfContact[1]"/>
</div>

<div class="form-group">
<label for="poc3">POC3</label>
<form:input id="poc3" cssClass="form-control" path="pointOfContact[2]"/>
</div>

<div class="checkbox">
<label for="special"><input type="checkbox" name="special" id="special">Special</label>
</div>

<button type="submit" class="btn btn-default">Submit</button>
</form:form>
</div>
</div>
</body>
</html>