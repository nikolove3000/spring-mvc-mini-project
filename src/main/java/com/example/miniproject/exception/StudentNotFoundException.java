package com.example.miniproject.exception;

public class StudentNotFoundException extends RuntimeException{

    public StudentNotFoundException(long id) {

        super("Student not found with id: " + id);
    }
}
