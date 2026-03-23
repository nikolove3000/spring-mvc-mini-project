package com.example.miniproject.service;

import com.example.miniproject.model.Student;
import com.example.miniproject.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service layer responsible for handling business logic
 * related to Student operations.
 * <p>
 * This class acts as an intermediary between the Controller
 * and Repository layers.
 */
@Service
public class StudentService {

    private final StudentRepository studentRepository;

    /**
     * Constructs a StudentService with the required repository dependency.
     *
     * @param studentRepository the student repository
     */
    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    /**
     * Retrieves all students.
     *
     * @return list of all students
     */
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    /**
     * Retrieves a student by id.
     *
     * @param id the student id
     * @return the found student
     */
    public Student getStudentById(long id) {
        return studentRepository.findById(id);
    }

    /**
     * Saves a new student or updates an existing one.
     *
     * @param student the student to save
     */
    public void saveStudent(Student student) {
        studentRepository.save(student);
    }

    /**
     * Deletes a student by id.
     *
     * @param id the id of the student to delete
     */
    public void deleteStudent(long id) {
        studentRepository.deleteById(id);
    }
}