<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form:form action="${pageContext.request.contextPath}/students/${student.id}/edit"
               method="post" modelAttribute="student">

        <label>Name:</label>
        <form:input path="name" />
        <form:errors path="name" cssStyle="color:red" />

        <label>Gender:</label>
        <form:input path="gender" />
        <form:errors path="gender" cssStyle="color: red" />

        <label>Email:</label>
        <form:input path="email" />
        <form:errors path="email" cssStyle="color:red" />

        <label>Phone Number:</label>
        <form:input path="phone" />
        <form:errors path="phone" cssStyle="color:red" />

        <label>Grade:</label>
        <form:input path="grade" />
        <form:errors path="grade" cssStyle="color:red" />

        <label>GPA:</label>
        <input type="number" step="0.1" name="gpa" value="${student.gpa}" />
        <form:errors path="gpa" cssStyle="color:red" />

        <button type="submit">Save</button>

    </form:form>
</body>
</html>
