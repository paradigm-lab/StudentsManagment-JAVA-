<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Student Management</title>
</head>
<body>

<h1 align="center"> Student Management System </h1>

<form action="showAddStudentPage">
    <input type="submit" value="ADD" />
</form>

<div align = "center">
    <table border="1">
        <thead>
            <tr>
                <td>id</td>
                <td>name</td>
                <td>mobile</td>
                <td>country</td>
            </tr>
        </thead>

        <!-- with each iteration I want to create a new row for my table -->
        <c:forEach var="student" items="${students}">
            <tr>
                <td>${student.id}</td>
                <td>${student.name}</td>
                <td>${student.mobile}</td>
                <td>${student.country}</td>
                <td><a href="updateStudent?userId=${student.id}">Update</a><td>
            </tr>
        </c:forEach>

    </table>
</div>

</body>
</html>