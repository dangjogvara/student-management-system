package com.dangjogvara.sms.controller;

import com.dangjogvara.sms.entity.Student;
import com.dangjogvara.sms.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public String listStudents(Model model) {
        model.addAttribute("students", studentService.getAllStudents());
        return "students";
    }

    @GetMapping("/students/new")
    public String createStudentForm(Model model) {
        model.addAttribute("student", student);
        return "create_student";
    }

    Student student = new Student();

    @PostMapping("/students")
    public String saveStudent(@ModelAttribute("student") Student student) {
        studentService.saveStudent(student);
        return "redirect:/students";
    }
}
