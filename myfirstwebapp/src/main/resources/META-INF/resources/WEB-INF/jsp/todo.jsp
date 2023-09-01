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
			<form method = "post">
				Description: <input type = "text" name = "description" required = "required"/>
				<input type = "submit" class = "btn btn-success"/>
			</form>
		</div>
		<!-- javascript usually add right before the closing tag of the body -->
		<script src = "webjars/bootstrap/5.3.1/js/bootstrap.min.js"></script>
		<script src = "webjars/jquery/3.7.1/jquery.min.js"></script>
	</body>
</html>