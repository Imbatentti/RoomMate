<%@page contentType="text/html; charset=UTF-8"%>
<%@page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta name="description" content="Imuroinnit">
<meta name="author" content="Rainer Uppala / Imbatentti">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta charset=UTF-8>
<title>Imuroinnit</title>
</head>
<body>
	<form action="TulostusServlet" method="get">
		<h1>Imuroinnit</h1>
		<table>
			<tr>
				<th>Imuroitu alue</th>
				<th>Päivämäärä</th>
				<th>Imuroija</th>
			<tr>
			<c:forEach items="${imurointi}" var="imurointi">
				<td><c:out value="${imurointi.alue}"/></td>
				<td><c:out value="${imurointi.paivamaara}"/></td>
				<td><c:out value="${imurointi.kayttajatunnus}"/></td>	
			</c:forEach>
			
			
		</table>


	</form>
</body>
</html>