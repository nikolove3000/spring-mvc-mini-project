<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/students" method="post">
        <label>Name:</label>
        <input type="text" name="name">

        <label>Gender:</label>
        <select name="gender">
            <option value="Male">Male</option>
            <option value="Female">Female</option>
            <option value="Other">Other</option>
        </select>

        <label>Email:</label>
        <input type="text" name="email">

        <label>Phone Number:</label>
        <input type="text" name="phone">

        <label>Grade:</label>
        <input type="text" name="grade">

        <label>GPA:</label>
        <input type="number" step="0.1" name="gpa">

        <button type="submit">Save</button>

    </form>
</body>
</html>
