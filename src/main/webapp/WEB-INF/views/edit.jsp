<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/students/${student.id}/edit" method="post">

        <label>Name:</label>
        <input type="text" name="name" value="${student.name}">

        <label>Gender:</label>
        <input type="text" name="gender" value="${student.gender}">

        <label>Email:</label>
        <input type="text" name="email" value="${student.email}">

        <label>Phone Number:</label>
        <input type="text" name="phone" value="${student.phone}">

        <label>Grade:</label>
        <input type="text" name="grade" value="${student.grade}">

        <label>GPA:</label>
        <input type="number" step="0.1" name="gpa" value="${student.gpa}">

        <button type="submit">Save</button>

    </form>
</body>
</html>
