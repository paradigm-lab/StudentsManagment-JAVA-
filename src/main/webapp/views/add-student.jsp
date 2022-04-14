<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Student Management</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="/URLToReachResourcesFolder/css/my-style-sheet.css">
    <link rel="stylesheet" type="text/css" href="/URLToReachResourcesFolder/css/add-student.css" />
</head>
<body>

<h1 align="center"> Add Student </h1>

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