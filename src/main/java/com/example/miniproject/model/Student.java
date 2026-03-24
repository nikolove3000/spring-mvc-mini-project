package com.example.miniproject.model;

import jakarta.validation.constraints.*;

/**
 * Represents a student entity containing personal and academic information.
 */
public class Student {

    private long id;

    @NotBlank(message = "Name can not be empty!")
    private String name;

    @Email(message = "Email must be the right format!")
    @NotBlank(message = "Email can not be empty!")
    private String email;

    @NotBlank(message = "Phone number can not be empty!")
    @Pattern(regexp = "^[0-9]+$", message = "Phone number must contain digits only!")
    private String phone;

    @NotBlank(message = "Grade can not be empty!")
    @Pattern(regexp = "^(10|11|12)[A-Z][0-9]+$", message = "Grade must be in format like 10A1, 11B2, 12C3!")
    private String grade;

    @DecimalMin(value = "0.0", message = "GPA must be at least 0.0!")
    @DecimalMax(value = "4.0", message = "GPA must be at most 4.0!")
    @NotNull(message = "GPA can not be empty!")
    private Double gpa;

    private String gender;

    /**
     * Constructs an empty Student object with default values.
     */
    public Student() {
    }

    /**
     * Constructs a Student with all required attributes.
     *
     * @param id     the unique identifier of the student
     * @param name   the student's full name
     * @param email  the student's email address
     * @param phone  the student's phone number
     * @param grade  the student's grade or class level
     * @param gpa    the student's grade point average
     * @param gender the student's gender
     */
    public Student(long id, String name, String email, String phone,
                   String grade, Double gpa, String gender) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.grade = grade;
        this.gpa = gpa;
        this.gender = gender;
    }

    /**
     * Returns the student ID.
     *
     * @return the student ID
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the student ID.
     *
     * @param id the student ID to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Returns the student's name.
     *
     * @return the student's name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the student's name.
     *
     * @param name the student's name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the student's email address.
     *
     * @return the student's email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the student's email address.
     *
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Returns the student's phone number.
     *
     * @return the phone number
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the student's phone number.
     *
     * @param phone the phone number to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Returns the student's grade or class level.
     *
     * @return the grade
     */
    public String getGrade() {
        return grade;
    }

    /**
     * Sets the student's grade or class level.
     *
     * @param grade the grade to set
     */
    public void setGrade(String grade) {
        this.grade = grade;
    }

    /**
     * Returns the student's GPA.
     *
     * @return the GPA value
     */
    public Double getGpa() {
        return gpa;
    }

    /**
     * Sets the student's GPA.
     *
     * @param gpa the GPA value to set
     */
    public void setGpa(Double gpa) {
        this.gpa = gpa;
    }

    /**
     * Returns the student's gender.
     *
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the student's gender.
     *
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }
}