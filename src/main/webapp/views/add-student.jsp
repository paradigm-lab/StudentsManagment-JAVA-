<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Student Management</title>
</head>
<body>

<h3 align="center"> Add Student </h3>

<div align="center">
    <!-- Create a spring form where the user can enter data -->
    <form:form action="save-student" modelAttribute="student" method="POST">

        <form:hidden path="id" />

        <label>Name: </label>
        <form:input path="name" />
        <br />

        <label>Mobile: </label>
        <form:input path="mobile" />
        <br />

        <label>Country: </label>
        <form:input path="country" />
        <br />

        <input type="submit" value="Submit" />

    </form:form>
</div>

</body>
</html>