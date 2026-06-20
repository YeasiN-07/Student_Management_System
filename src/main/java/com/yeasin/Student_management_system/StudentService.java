package com.yeasin.Student_management_system;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student getStudentById(Integer studentId) {
        return studentRepository.findById(studentId).orElse(null);
    }

    public Student updateStudent(Integer studentId, Student student) {

        Student existingStudent =
                studentRepository.findById(studentId).orElse(null);

        if (existingStudent == null) {
            return null;
        }

        existingStudent.setFirstName(student.getFirstName());
        existingStudent.setLastName(student.getLastName());
        existingStudent.setEmail(student.getEmail());
        existingStudent.setDepartmentName(student.getDepartmentName());
        existingStudent.setCgpa(student.getCgpa());
        existingStudent.setAdmissionSemester(student.getAdmissionSemester());
        existingStudent.setSemester(student.getSemester());
        existingStudent.setPhoneNumber(student.getPhoneNumber());

        return studentRepository.save(existingStudent);
    }

    public void deleteStudent(Integer studentId) {
        studentRepository.deleteById(studentId);
    }

}
