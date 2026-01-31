<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Find Doctors Online</title>
</head>
<body>
<h2>Find Doctors Online</h2>
<form:form method="post" action="checkDoctorsOnline">
    <table>
        <tr>
            <td>Doctor Name:</td>
            <td><form:input path="doctorName" /></td>
        </tr>
        <tr><td colspan="2" align="center">(or)</td></tr>
        <tr>
            <td>Registration Number:</td>
            <td><form:input path="doctorRegistrationNumber" /></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Check Doctors Online" /></td>
        </tr>
    </table>
</form:form>
</body>
</html>