<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add Employee</title>
</head>
<body>
    <h1>Add Employee</h1>
    <form action="addEmployee" method="post">
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" required><br><br>
        <label for="designation">Designation:</label>
        <input type="text" id="designation" name="designation" required><br><br>
        <label for="salary">Salary:</label>
        <input type="number" id="salary" name="salary" required><br><br>
        <input type="submit" value="Add Employee">
    </form>
</body>
</html>