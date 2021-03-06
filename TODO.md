# TODOs


## Core build
* Configure dispatcher servlet 
* Create a configuration file (Beans, Component-Scan)

## Build a webpage to display the students(db)
* Create controller (StudentController)
* Design a view (student-list.jsp)

## Get the data from database (Get all the students)
* Create a POJO, domain, BO, Entity, VO class called Student
  * Student (Using this class as my Data Access layer(DAO) and DTO)
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


* Controller -----> DAO ------> Database(DB)

## Fixing a Bug (POST-REDIRECT-GET (PRG) Pattern)
* When the user create a resource by POST then when we refresh the page it's going to create a new resource or object which is cost full so to fix the error we use the POST REDIRECT GET (PRG). We use this approach because loading is not costlier than creating.

## Implementing The Service Layer
* Service Layer is where we are going to write the business logic.


* Why we need the service layer ??
  * The service layer is there to provide logic to operate on the data sent to and from the DAO and the client.
 
Controllers --> Service --> DAO --> Database (DB) 

## Update a Student record
* Modify the student-list page and show a update link next to each student.


* Create a controller handler method for update (/updateStudent)


* Show the user the add-student form (add_student.jsp)


* Doing a conditional check to if a user has id then we update then if the user doesn't have the id we insert the data to the Database(DB).
