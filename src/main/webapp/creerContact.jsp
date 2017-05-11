<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Formulaire de saisie des coordonées</title>
</head>
<body><h1>Saisir vos coordonnées :</h1>
	<form name="monFormulaire" method="post" action="creerContact">
			nom : <input type="text" name="nom" value="WOUTERS"/><br>
			prenom : <input type="text" name="prenom" value="Jean-Michel" /><br>
			email : <input type="text" name="email" value="jean.michel.simplon@gmail.com"/><br>
		<input type="submit" value="Validez">
	</form>
</body>
</html>