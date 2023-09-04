<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<html>
	<head>
		<!-- CSS should load first -->
		<link href = "webjars/bootstrap/5.3.1/css/bootstrap.min.css" rel = "stylesheet">
		<title> Add Todo Page</title>
	</head>
	<body>
		<div class = "container">
			<h1>Enter Todo Details</h1>
			<form:form method = "post" modelAttribute = "todo">
				<fieldset class = "mb-3">
					<form:label path = "description">Description</form:label>
					<form:input type = "text" path = "description" required = "required"/>
					<form:errors path = "description" cssClass = "text-warning"/>
				</fieldset>
				
				<fieldset class = "mb-3">
					<form:label path = "targetDate">Target Date</form:label>
					<form:input type = "text" path = "targetDate" required = "required"/>
					<form:errors path = "targetDate" cssClass = "text-warning"/>
				</fieldset>
				
				<form:input type = "hidden" path = "id"/>
				<form:input type = "hidden" path = "done"/>
				<input type = "submit" class = "btn btn-success"/>
			</form:form>
		</div>
		<!-- javascript usually add right before the closing tag of the body -->
		<script src = "webjars/bootstrap/5.3.1/js/bootstrap.min.js"></script>
		<script src = "webjars/jquery/3.7.1/jquery.min.js"></script>
	</body>
</html>