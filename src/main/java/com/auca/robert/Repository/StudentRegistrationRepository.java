package com.auca.robert.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.auca.robert.model.StudentRegistration;

@Repository
public interface StudentRegistrationRepository extends JpaRepository<StudentRegistration, Integer> {

}
