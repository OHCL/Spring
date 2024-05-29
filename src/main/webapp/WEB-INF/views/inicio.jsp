<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Inicio</title>
</head>
<body>
	<div>
		<h1>Navigation Menu</h1>
    <ul>
        <li><a href="/capacitacion">Capacitación</a></li>
        <li><a href="/contacto">Contacto</a></li>
        <li><a href="/home">Home</a></li>
        <li><a href="/homeRest">Home REST</a></li>
        <li><a href="/inicio">Inicio</a></li>
        <li><a href="/login">Login</a></li>
        <li><a href="/user">User</a></li>
    </ul>
	</div>
	<div>
		<a href="<c:url value='/contacto' />">contacto</a> |
	    <a href="<c:url value='/capacitacion' />">capacitacion</a>
	</div>
</body>
</html>