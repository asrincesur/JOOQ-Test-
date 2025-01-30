package org.test.jooq.entities;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;


public class EmployeeDTO implements Serializable {

    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String department;
    private String jobTitle;
    private String salary;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate hireDate;

    public EmployeeDTO() {
    }

    public EmployeeDTO(String lastName, String phoneNumber, String department, String salary) {
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.department = department;
        this.salary = salary;
    }

    public EmployeeDTO(String firstName, String lastName, String email, String phoneNumber, String department, String jobTitle, String salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.department = department;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.hireDate = LocalDate.now();
    }

    public EmployeeDTO(String firstName, String lastName, String email, String phoneNumber, String department, String jobTitle, String salary, LocalDate hireDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.department = department;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }
}

