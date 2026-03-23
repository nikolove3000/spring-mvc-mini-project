package com.example.miniproject.repository;

import com.example.miniproject.exception.StudentNotFoundException;
import com.example.miniproject.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Repository class responsible for managing Student data.
 * This implementation stores students in an in-memory list
 * and provides basic CRUD operations.
 */
@Repository
public class StudentRepository {

    private List<Student> studentList = new ArrayList<>();

    private long nextId = 1;

    /**
     * Returns all students stored in the repository.
     * @return list of all students
     */
    public List<Student> findAll() {
        return studentList;
    }

    /**
     * Finds a student by its id.
     * @param id the id of the student to find
     * @return the matching Student
     * @throws StudentNotFoundException if no student with the given id exists
     */
    public Student findById(long id) {

        for (Student student : studentList) {
            if (student.getId() == id) {
                return student;
            }
        }
        throw new StudentNotFoundException(id);
    }

    /**
     * Saves a student to the repository.
     * <p>
     * If the student id is 0, a new student is created and assigned
     * an auto-generated id. Otherwise, the existing student data is updated.
     * @param student the student to save or update
     */
    public void save(Student student) {

        // Create new student
        if (student.getId() == 0) {

            student.setId(nextId);
            nextId++;

            studentList.add(student);
        }
        // Update existing student
        else {

            for (Student s : studentList) {

                if (s.getId() == student.getId()) {

                    s.setEmail(student.getEmail());
                    s.setGender(student.getGender());
                    s.setGpa(student.getGpa());
                    s.setName(student.getName());
                    s.setPhone(student.getPhone());
                    s.setGrade(student.getGrade());
                    break;
                }
            }
        }
    }

    /**
     * Deletes a student by its id.
     * @param id the id of the student to delete
     */
    public void deleteById(long id) {
        studentList.removeIf(s -> s.getId() == id);
    }
}