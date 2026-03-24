<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Students Information List: </h1>

<table>
    <thead>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Email</th>
            <th>Gender</th>
            <th>Phone</th>
            <th>Grade</th>
            <th>GPA</th>
            <th>Action</th>
        </tr>
    </thead>
    <tbody>
    <c:forEach var="student" items="${studentList}">
        <tr>
            <td>${student.id}</td>
            <td>${student.name}</td>
            <td>${student.email}</td>
            <td>${student.gender}</td>
            <td>${student.phone}</td>
            <td>${student.grade}</td>
            <td>${student.gpa}</td>
            <td>
                <a href="${pageContext.request.contextPath}/students/${student.id}/edit">Sửa</a>
                <a href="${pageContext.request.contextPath}/students/${student.id}/delete"
                onclick="return confirm('Xóa?')">Xóa</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
