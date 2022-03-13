package com.dangjogvara.sms.service.impl;

import com.dangjogvara.sms.entity.Student;
import com.dangjogvara.sms.repository.StudentRepository;
import com.dangjogvara.sms.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
