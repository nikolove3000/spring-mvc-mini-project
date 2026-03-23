package com.example.miniproject.controller;

import com.example.miniproject.model.Student;
import com.example.miniproject.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Controller for handling CRUD operations for Student entities.
 * <p>
 * Provides endpoints to list, create, edit, and delete students.
 * Maps all requests under "/students".
 */
@Controller
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    /**
     * Constructs a StudentController with the required StudentService.
     *
     * @param studentService the student service
     */
    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    /**
     * Displays the list of all students.
     *
     * @param model the model to pass data to the view
     * @return the view name for student list
     */
    @GetMapping("")
    public String listStudents(Model model) {
        model.addAttribute("studentList", studentService.getAllStudents());
        return "students";
    }

    /**
     * Shows the form to create a new student.
     *
     * @param model the model to pass data to the view
     * @return the view name for creating a new student
     */
    @GetMapping("/new")
    public String showCreateForm(Model model) {
        model.addAttribute("student", new Student());
        return "new";
    }

    /**
     * Handles submission of the new student form.
     *
     * @param student the student object bound from the form
     * @return redirect to the student list page
     */
    @PostMapping("")
    public String createStudent(@ModelAttribute Student student) {
        studentService.saveStudent(student);
        return "redirect:/students";
    }

    /**
     * Shows the form to edit an existing student.
     *
     * @param id    the id of the student to edit
     * @param model the model to pass data to the view
     * @return the view name for editing the student
     */
    @GetMapping("/{id}/edit")
    public String showEditForm(@PathVariable long id, Model model) {
        Student student = studentService.getStudentById(id);
        model.addAttribute("student", student);
        return "edit";
    }

    /**
     * Handles submission of the edit student form.
     *
     * @param id      the id of the student being edited
     * @param student the updated student object from the form
     * @return redirect to the student list page
     */
    @PostMapping("/{id}/edit")
    public String updateStudent(@PathVariable long id, @ModelAttribute Student student) {
        student.setId(id);
        studentService.saveStudent(student);
        return "redirect:/students";
    }

    /**
     * Deletes a student by id.
     *
     * @param id the id of the student to delete
     * @return redirect to the student list page
     */
    @GetMapping("/{id}/delete")
    public String deleteStudent(@PathVariable long id) {
        studentService.deleteStudent(id);
        return "redirect:/students";
    }
}