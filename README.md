# 🌱 spring-mvc-mini-project

A hands-on mini project built with **Spring MVC** from scratch — no Spring Boot, no shortcuts.  
Implements a full **CRUD Student Management System** using layered architecture, JSP views, validation, interceptor, and exception handling.

---

## ✅ Features

- List all students
- Create a new student with form validation
- Edit an existing student
- Delete a student
- Global exception handling for invalid student IDs
- Request logging via interceptor

---

## 🛠️ Tech Stack

| Tool | Version       |
|---|---------------|
| Java | 17            |
| Spring MVC | 7.0.6         |
| Jakarta Servlet | 6.1.0         |
| JSTL | 3.0.1         |
| Hibernate Validator | 9.0.1.Final   |
| Tomcat | 10.1.52       |
| Build Tool | Maven         |
| IDE | IntelliJ IDEA |

---

## 📁 Project Structure
```
src/
└── main/
    ├── java/com/example/miniproject/
    │   ├── config/          ← WebAppInitializer, WebMvcConfig
    │   ├── controller/      ← StudentController
    │   ├── service/         ← StudentService
    │   ├── repository/      ← StudentRepository
    │   ├── model/           ← Student
    │   ├── exception/       ← StudentNotFoundException
    │   ├── advice/          ← GlobalExceptionHandler
    │   └── interceptor/     ← LoggingInterceptor
    └── webapp/
        └── WEB-INF/
            └── views/
                ├── students.jsp
                ├── new.jsp
                ├── edit.jsp
                └── error.jsp
```

---

## 🔍 Key Concepts Practiced

- `DispatcherServlet` configured via `WebAppInitializer` (no web.xml)
- `@Controller`, `@RequestMapping`, `@PathVariable`, `@ModelAttribute`
- `@Valid` + `BindingResult` for form validation
- `HandlerInterceptor` for request logging
- `@ControllerAdvice` + `@ExceptionHandler` for global exception handling
- JSTL `<c:forEach>` and Spring form tags `<form:form>`, `<form:errors>`
- In-memory storage with auto-increment ID (no database)

---

## 📌 Conventions Applied

- Javadoc on all public classes and methods (`@param`, `@return`, `@throws`)
- Single Responsibility Principle per class
- `camelCase` / `PascalCase` / `UPPER_SNAKE_CASE` used correctly
- `final` fields injected via constructor
- Sensitive config files excluded from version control

---

## 🗺️ Learning Roadmap

- [x] Java Core — OOP, Generics, Lambda, Stream API
- [x] Spring Core — DI, IoC, AOP
- [x] Servlet + Tomcat (traditional)
- [x] Spring MVC — DispatcherServlet, HandlerMapping, ViewResolver
- [x] Spring MVC — Mini Project CRUD (this project)
- [ ] Spring Boot
- [ ] Spring Data JPA + REST API
- [ ] Spring Security