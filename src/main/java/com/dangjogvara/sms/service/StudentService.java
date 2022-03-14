package com.dangjogvara.sms.service;

import com.dangjogvara.sms.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();

    Student saveStudent(Student student);
}
