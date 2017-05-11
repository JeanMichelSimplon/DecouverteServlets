<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AFFICHE HELLO WORD</title>
</head>
<body>
<!-- UTILISATION de la saisie faite dans l'input de l'index.jsp -->
HELLO (paramnom : > ) ${paramnom}<br>
HELLO (param.nom : > ) ${param.nom}<br>
HELLO (param : > ) ${param["nom"]}<br>
HELLO (requestScope : > ) ${requestScope.paramnom}<br>
HELLO l'Agent header : ${header["User-Agent"]}<br>

<!-- SCRIPTLET : -->
HELLO (getParameter : > ) <%=request.getParameter("nom") %><br>
HELLO (getAttribute : > ) <%=request.getAttribute("paramnom") %><br>
HELLO l'Agent : <%=request.getHeader("User-Agent")%><br>

</body>
</html>