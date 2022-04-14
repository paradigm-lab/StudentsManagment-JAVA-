<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Student Management</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="/URLToReachResourcesFolder/css/my-style-sheet.css">
</head>

<body class="myFonts">

<div class="container">
<h1 align="center"> Student Management System </h1>

<!-- This is my add button -->
<form action="showAddStudentPage">
    <input type="submit" value="ADD"  class="btn btn-outline-success" />
</form>

    <br/>

    <table border="1" class="table table-striped">
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
                <td><a href="deleteStudent?userId=${student.id}" onclick="if (! (confirm('Are you sure you want to delete this Student') ) ) return false">Delete</a><td>
            </tr>
        </c:forEach>

    </table>

    <!-- This is my image -->
    <center><img alt="Student Photo" src="/URLToReachImagesFolder/studentTwo.jpeg" /></center>

</div>

</body>
</html>