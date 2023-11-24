package com.auca.robert.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.auca.robert.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, String>{
}
