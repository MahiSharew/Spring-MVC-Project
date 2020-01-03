<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta charset="UTF-8">
<title>Student Registration Form</title>
<style>
.error{
color:red
}
</style>
</head>
<body>
	<form:form action="processForm" modelAttribute="customer">
	Customer Form <br><br>
	(*) Required Field 
First Name:<form:input path="firstName" />
<form:errors path="firstName" cssClass="error"/>
		<br>
		<br>
Last Name(*):<form:input path="lastName" />
<form:errors path="lastName" cssClass="error"/>
		<br>
		<br>
		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>