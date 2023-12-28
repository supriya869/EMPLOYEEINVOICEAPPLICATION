<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<body>
<h1>Edit User Data</h1>
<form:form method="GET" action="/edite">
<table>
	<tr>
		<td></td>
		<td><form:input path="eid"/></td>
	</tr>
	<tr>
		<td>Employee Name:</td>
		<td><form:input path="name"/></td>
	</tr>
	<tr>
		<td>Salary:</td>
		<td><form:input path="salary"/></td>
	</tr>
	
	
	<tr>
		<td></td>
		<td><input type="submit" value="saveEdit"/></td>
	</tr>
</table>
</form:form>
<a href="/view">View All product Details</a><p></p>
<a href="/">Add New product Here</a>
</body>