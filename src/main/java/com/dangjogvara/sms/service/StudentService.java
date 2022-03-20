package com.dangjogvara.sms.service;

import com.dangjogvara.sms.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();

    void saveStudent(Student student);

    Student getStudentById(Long id);

    Student updateStudent(Student student);


}
