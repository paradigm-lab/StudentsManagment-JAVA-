# TODOs


## Core build
* Configure dispatcher servlet 
* Create a configuration file (Beans, Component-Scan)

## Build a webpage to display the students(db)
* Create controller (StudentController)
* Design a view (student-list.jsp)

## Get the data from database (Get all the students)
* Create a POJO or a domain class called Student
  * Student
    * -> id
    * -> name
    * -> mobile
    * -> country


* Create a DAO called `StudentDAO()` Interface
  * `List<Student> loadStudent();` method 


* Implementing a Data Source which will help us to connect to the DataBase(DB) by using the JdbcTemplate which will provides utility methods to talk to the database.
