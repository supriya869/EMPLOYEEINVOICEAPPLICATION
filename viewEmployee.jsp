<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<h1 style="color:blue">Employee Details</h1>
<table border="1">
  <tr>
    <th>EMPLOYEE NO</th>
    <th>EMPLOYEE NAME</th>
    <th>EMPLOYEE SALARY</th>
    <th>TA</th>
    <th>DA</th>
    <th>HRA</th>
    <th>PF</th>
    <th>GROSS</th>
    <th>NET</th>
    <th>DELETE</th>
    <th>UPDATE</th>
   </tr>
  
  <c:forEach var="emp" items="${emps }">
  <tr>
    <td>${emp.eid }</td>
    <td>${emp.name }</td>
    <td>${emp.salary }</td>
    <td>${emp.ta }</td>
    <td>${emp.da }</td>
    <td>${emp.hra }</td>
    <td>${emp.pf }</td>
    <td>${emp.gross }</td>
    <td>${emp.net }</td>
    <td><a href="/update/${emp.eid }">Update</a></td>
    <td><a href="/delete/${emp.eid }">Delete</a></td>
  </tr>
  </c:forEach>
</table>

