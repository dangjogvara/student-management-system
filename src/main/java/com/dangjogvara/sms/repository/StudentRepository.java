package com.dangjogvara.sms.repository;

import com.dangjogvara.sms.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<Student, Long> {
}
