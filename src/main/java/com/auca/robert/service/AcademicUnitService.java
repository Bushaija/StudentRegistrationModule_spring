<<<<<<< HEAD
package com.auca.robert.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.auca.robert.Repository.AcademicUnitRepository;
import com.auca.robert.model.AcademicUnit;

@Service
public class AcademicUnitService {

	@Autowired
    private AcademicUnitRepository academicUnitRepository;

    public List<AcademicUnit> getAllAcademicUnits() {
        return academicUnitRepository.findAll();
    }

    public AcademicUnit getAcademicUnitByCode(String code) {
        return academicUnitRepository.findById(code).orElse(null);
    }

    public String saveAcademicUnit(AcademicUnit academicUnit) {
        academicUnitRepository.save(academicUnit);
        return "Academic Unit Saved";
    }

    public String updateAcademicUnit(String code, AcademicUnit updatedAcademicUnit) {
        AcademicUnit academicUnit = academicUnitRepository.findById(code).orElse(null);
        if (academicUnit != null) {
            // Update properties as needed
            academicUnit.setName(updatedAcademicUnit.getName());
            academicUnit.setAcademicType(updatedAcademicUnit.getAcademicType());
            academicUnit.setParentAcademic(updatedAcademicUnit.getParentAcademic());
            academicUnitRepository.save(academicUnit);
            return "Academic Unit Updated";
        } else {
            return "Academic Unit not found";
        }
    }

    public String deleteAcademicUnit(String code) {
        AcademicUnit academicUnit = academicUnitRepository.findById(code).orElse(null);
        if (academicUnit != null) {
            academicUnitRepository.delete(academicUnit);
            return "Academic Unit Deleted";
        } else {
            return "Academic Unit not found";
        }
    }
}
=======
package com.auca.robert.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.auca.robert.Repository.AcademicUnitRepository;
import com.auca.robert.model.AcademicUnit;

@Service
public class AcademicUnitService {

	@Autowired
    private AcademicUnitRepository academicUnitRepository;

    public List<AcademicUnit> getAllAcademicUnits() {
        return academicUnitRepository.findAll();
    }

    public AcademicUnit getAcademicUnitByCode(String code) {
        return academicUnitRepository.findById(code).orElse(null);
    }

    public String saveAcademicUnit(AcademicUnit academicUnit) {
        academicUnitRepository.save(academicUnit);
        return "Academic Unit Saved";
    }

    public String updateAcademicUnit(String code, AcademicUnit updatedAcademicUnit) {
        AcademicUnit academicUnit = academicUnitRepository.findById(code).orElse(null);
        if (academicUnit != null) {
            // Update properties as needed
            academicUnit.setName(updatedAcademicUnit.getName());
            academicUnit.setAcademicType(updatedAcademicUnit.getAcademicType());
            academicUnit.setParentAcademic(updatedAcademicUnit.getParentAcademic());
            academicUnitRepository.save(academicUnit);
            return "Academic Unit Updated";
        } else {
            return "Academic Unit not found";
        }
    }

    public String deleteAcademicUnit(String code) {
        AcademicUnit academicUnit = academicUnitRepository.findById(code).orElse(null);
        if (academicUnit != null) {
            academicUnitRepository.delete(academicUnit);
            return "Academic Unit Deleted";
        } else {
            return "Academic Unit not found";
        }
    }
}
>>>>>>> 337fd21690365c157c4a1705dd023490a17c3354
