package com.auca.robert.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.auca.robert.model.Teacher;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, String> {

}
