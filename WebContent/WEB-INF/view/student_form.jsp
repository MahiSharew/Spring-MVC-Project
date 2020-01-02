<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta charset="UTF-8">
<title>Student Registration Form</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="student">
First Name:<form:input path="firstName" />
		<br>
		<br>
Last Name:<form:input path="lastName" />
		<br>
		<br>
Country :
<form:select path="country" items="${student.countryoption}">
		</form:select>
		<br>
		<br>
		Favorite Language
		Java<form:radiobutton path="favoriteLanguage" value="Java"/>
		C#<form:radiobutton path="favoriteLanguage" value="C#"/>
		Python<form:radiobutton path="favoriteLanguage" value="Python"/>
		<br>
		<br>
		operating System 
		Linux<form:checkbox path="os" value="Linux"/>
		Window<form:checkbox path="os" value="Windows"/>
		Mac<form:checkbox path="os" value="Mac OS"/>
		Ubuntu<form:checkbox path="os" value="Ubuntu"/>
		<br>
		<br>
		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>