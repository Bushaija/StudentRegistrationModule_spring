package com.auca.robert.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.auca.robert.model.CourseDefinition;

@Repository
public interface CourseDefinitionRepository extends JpaRepository<CourseDefinition, String> {

}
