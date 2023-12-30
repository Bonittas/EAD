<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.List" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>View Employees</title>
</head>
<body>
    <h2>Employee List</h2>
    <table>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Designation</th>
            <th>Salary</th>
        </tr>
        <%-- Retrieve the employeeList attribute from the request object --%>
        <% Object attribute = request.getAttribute("employeeList");
           if (attribute instanceof List) {
               List<Employee> employeeList = (List<Employee>) attribute; %> <!-- Update the attribute name to "employeeList" -->
               <%-- Iterate over the employee list and display each employee --%>
               <% for (Employee employee : employeeList) { %>
                   <tr>
                       <td><%= employee.getId() %></td>
                       <td><%= employee.getName() %></td>
                       <td><%= employee.getDesignation() %></td>
                       <td><%= employee.getSalary() %></td>
                   </tr>
               <% }
           } %>
    </table>
</body>
</html>