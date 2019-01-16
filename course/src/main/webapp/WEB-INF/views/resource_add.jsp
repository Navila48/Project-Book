<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Project Management</title>

<script>var ctx = "${pageContext.request.contextPath}"</script>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<link rel="stylesheet" href="<spring:url value="/resources/css/global.css"/>" type="text/css"/>
<link rel="stylesheet" href="<spring:url value="/resources/css/bootstrap-select.min.css"/>" type="text/css"/>
<script src="<spring:url value="/resources/js/bootstrap-select.min.js"/>"></script>
<script src="<spring:url value="/resources/js/resource.js"/>"></script>
</head>
<body>

<jsp:include page="../views/fragments/header.jsp"/>
<div class="container">
<div class="row">
<h1>Resource</h1>
</div>
<spring:url value="/resource/review" var="formUrl"/>
<form:form action="${formUrl }" method="POST" modelAttribute="resource">

<div class="row">
<div class="form-group">
<label for="resource-name">Name</label>
<form:input path="name" cssClass="form-control" id="resource-name"/>
</div>

<div class="form-group">
<label for="type">Type</label>
<form:select path="type" items="${ typeOptions}" cssClass="selectpicker"></form:select>
</div>

<div class="form-group">
<label for="cost">Cost</label>
<form:input path="cost" cssClass="form-control" id="cost"/>
</div>

<div class="form-group">
<label for="unit">Unit of Measure </label>
<form:radiobuttons path="unitOfMeasure"  items="${radioOptions }"></form:radiobuttons>
</div>
   
<div class="form-group">
<label for="indicators">Indicators </label>
<form:checkboxes path="indicators" id="indicators" items="${checkOptions}" />
<a id="request-link" href="<spring:url value="/resource/request"/>">Send Request</a>

</div>

<div class="form-group">
<label for="notes">Notes</label>
<form:textarea path="notes" id="notes" cssClass="form-control"/>
</div>

<button type="submit" class="btn btn-default">Submit</button>

</div>
</form:form>
</div>
</body>
</html>