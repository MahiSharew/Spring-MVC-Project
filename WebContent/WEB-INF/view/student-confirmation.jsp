<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta charset="UTF-8">
<title>Student Confirmation Form</title>
</head>
<body>
First Name:${student.firstName}<br><br>
Last Name:${student.lastName}<br><br>
Country :${student.country}	<br><br>
Favorite Language:${student.favoriteLanguage}
	<br><br>	
operating System:
<ul>
<c:forEach var="temp" items="${student.os}">
<li>${temp}</li>
</c:forEach>
</ul>

</body>
</html>