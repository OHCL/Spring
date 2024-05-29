<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Contacto</title>
<script>
function validarFormulario() {
    var nombre = document.forms["contactoForm"]["nombre"].value;
    var email = document.forms["contactoForm"]["email"].value;
    if (nombre == "" || email == "") {
        alert("Todos los campos deben ser completados");
        return false;
    }
}
</script>
</head>
<body>
	<div class="container">
        <h1>Contacto</h1>
        <form name="contactoForm" onsubmit="return validarFormulario()">
            <label for="nombre">Nombre:</label>
            <input type="text" id="nombre" name="nombre"><br>
            <label for="email">Email:</label>
            <input type="email" id="email" name="email"><br>
            <input type="submit" value="Enviar">
        </form>
    </div>
</body>
</html>