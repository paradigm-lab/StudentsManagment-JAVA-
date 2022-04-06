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


* Designing a Dynamic HTML Table which will select all the student from the Database table to my model and sending the model into my view in a tabular format.

 
## Insert a student record to the student table
* Create a controller handler method to display the add-student.jsp

* Create a form(jsp) [add-student.jsp]

