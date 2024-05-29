<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Edit User</h2>
    <form action="/users/update/${user.id}" method="post">
        <input type="hidden" name="_method" value="put"/>
        <p>ID: ${user.id}</p>
        <p>
            Username: <input type="text" name="username" value="${user.username}"/>
        </p>
        <p>
            Email: <input type="text" name="email" value="${user.email}"/>
        </p>
        <p>
            Role: <input type="text" name="role" value="${user.role}"/>
        </p>
        <p>
            Password: <input type="password" name="password" value="${user.password}"/>
        </p>
        <p>
            <input type="submit" value="Update"/>
        </p>
    </form>
</body>
</html>