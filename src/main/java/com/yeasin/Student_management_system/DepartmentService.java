package com.yeasin.Student_management_system;


import org.springframework.stereotype.Service;



import java.util.List;


@Service
public class DepartmentService {

    private DepartmentRepository departmentRepository;

    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public Department createDepartment(Department department) {
        return departmentRepository.save(department);
    }

    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    public Department getDepartmentById(Integer id) {
        return departmentRepository.findById(id).orElse(null);
    }

    public Department updateDepartment(Integer id, Department department) {

        Department existingDepartment =
                departmentRepository.findById(id).orElse(null);

        if (existingDepartment == null) {
            return null;
        }

        existingDepartment.setDepartmentCode(
                department.getDepartmentCode());

        existingDepartment.setDepartmentName(
                department.getDepartmentName());

        existingDepartment.setFaculty(
                department.getFaculty());

        existingDepartment.setEmail(
                department.getEmail());

        return departmentRepository.save(existingDepartment);
    }

    public void deleteDepartment(Integer id) {
        departmentRepository.deleteById(id);
    }
}