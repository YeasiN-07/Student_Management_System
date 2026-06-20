package com.yeasin.Student_management_system;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Objects;
@Entity
public class Department {
    @Id
    private int id;

    private String departmentCode;

    private String departmentName;

    private String faculty;

    private String email;

    public Department() {
    }

    public Department(int id, String departmentCode, String departmentName, String faculty, String email) {
        this.id = id;
        this.departmentCode = departmentCode;
        this.departmentName = departmentName;
        this.faculty = faculty;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return id == that.id && Objects.equals(departmentCode, that.departmentCode) && Objects.equals(departmentName, that.departmentName) && Objects.equals(faculty, that.faculty) && Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, departmentCode, departmentName, faculty, email);
    }
}
