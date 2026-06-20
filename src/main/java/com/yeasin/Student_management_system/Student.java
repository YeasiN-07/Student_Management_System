package com.yeasin.Student_management_system;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.security.PrivateKey;
import java.util.Objects;

@Entity
public class Student {

    @Id
    private int studentId;
    private String firstName;
    private String lastName;
    private String email;
    private String departmentName;
    private Double cgpa;
    private String admissionSemester;
    private String semester;
    private String phoneNumber;

    public Student() {
    }

    public Student(String semester, String admissionSemester, Double cgpa, String departmentName, String email, String lastName, String firstName, int studentId, String phoneNumber) {
        this.semester = semester;
        this.admissionSemester = admissionSemester;
        this.cgpa = cgpa;
        this.departmentName = departmentName;
        this.email = email;
        this.lastName = lastName;
        this.firstName = firstName;
        this.studentId = studentId;
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getAdmissionSemester() {
        return admissionSemester;
    }

    public void setAdmissionSemester(String admissionSemester) {
        this.admissionSemester = admissionSemester;
    }

    public Double getCgpa() {
        return cgpa;
    }

    public void setCgpa(Double cgpa) {
        this.cgpa = cgpa;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId == student.studentId && Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName) && Objects.equals(email, student.email) && Objects.equals(departmentName, student.departmentName) && Objects.equals(cgpa, student.cgpa) && Objects.equals(admissionSemester, student.admissionSemester) && Objects.equals(semester, student.semester) && Objects.equals(phoneNumber, student.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId, firstName, lastName, email, departmentName, cgpa, admissionSemester, semester, phoneNumber);
    }
}
