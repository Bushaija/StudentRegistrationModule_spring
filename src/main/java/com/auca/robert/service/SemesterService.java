<<<<<<< HEAD
package com.auca.robert.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.auca.robert.Repository.SemesterRepository;
import com.auca.robert.model.Semester;

@Service
public class SemesterService {

	@Autowired
    private SemesterRepository semesterRepository;

    public List<Semester> getAllSemesters() {
        return semesterRepository.findAll();
    }

    public Semester getSemesterById(Long id) {
        return semesterRepository.findById(id).orElse(null);
    }

    public String saveSemester(Semester semester) {
        semesterRepository.save(semester);
        return "Semester Saved";
    }

    public String updateSemester(Long id, Semester updatedSemester) {
        Semester semester = semesterRepository.findById(id).orElse(null);
        if (semester != null) {
            // Update properties as needed
            semester.setName(updatedSemester.getName());
            semester.setStartDate(updatedSemester.getStartDate());
            semester.setEndDate(updatedSemester.getEndDate());
            semesterRepository.save(semester);
            return "Semester Updated";
        } else {
            return "Semester not found";
        }
    }

    public String deleteSemester(Long id) {
        Semester semester = semesterRepository.findById(id).orElse(null);
        if (semester != null) {
            semesterRepository.delete(semester);
            return "Semester Deleted";
        } else {
            return "Semester not found";
        }
    }
}
=======
package com.auca.robert.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.auca.robert.Repository.SemesterRepository;
import com.auca.robert.model.Semester;

@Service
public class SemesterService {

	@Autowired
    private SemesterRepository semesterRepository;

    public List<Semester> getAllSemesters() {
        return semesterRepository.findAll();
    }

    public Semester getSemesterById(Long id) {
        return semesterRepository.findById(id).orElse(null);
    }

    public String saveSemester(Semester semester) {
        semesterRepository.save(semester);
        return "Semester Saved";
    }

    public String updateSemester(Long id, Semester updatedSemester) {
        Semester semester = semesterRepository.findById(id).orElse(null);
        if (semester != null) {
            // Update properties as needed
            semester.setName(updatedSemester.getName());
            semester.setStartDate(updatedSemester.getStartDate());
            semester.setEndDate(updatedSemester.getEndDate());
            semesterRepository.save(semester);
            return "Semester Updated";
        } else {
            return "Semester not found";
        }
    }

    public String deleteSemester(Long id) {
        Semester semester = semesterRepository.findById(id).orElse(null);
        if (semester != null) {
            semesterRepository.delete(semester);
            return "Semester Deleted";
        } else {
            return "Semester not found";
        }
    }
}
>>>>>>> 337fd21690365c157c4a1705dd023490a17c3354
