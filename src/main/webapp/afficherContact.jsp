<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@     taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Nouveau contact</title>
</head>
<body>
	<h1>Votre nouveau contact :</h1>

	nom : ${contact.nom}
	<br> prenom : ${contact.prenom}
	<br> email : ${contact.email}
	<br>

    liste de hobbies : 
        <c:forEach var="monHobby" items="${ contact.hobbies }" >
            <br>- ${ monHobby.hobby }.
        </c:forEach>


</body>
</html>