package com.auca.robert.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.auca.robert.model.Semester;

@Repository
public interface SemesterRepository extends JpaRepository<Semester, Long> {

}
