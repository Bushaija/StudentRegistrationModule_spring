package com.auca.robert.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.auca.robert.model.AcademicUnit;

@Repository
public interface AcademicUnitRepository extends JpaRepository<AcademicUnit, String>{

}