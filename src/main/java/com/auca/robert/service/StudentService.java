<<<<<<< HEAD
package com.auca.robert.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.auca.robert.Repository.StudentRepository;
import com.auca.robert.model.Student;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentrepository;
	
	public String SaveStudent(Student student) {
		if(student != null) {
			studentrepository.save(student);
			return "Student Saved ";
		}else {
			return null;
		}
	}
	
	public List<Student> getAllStudents() {
	    return studentrepository.findAll();
	}
	
	public Student getStudentById(String regno) {
	    return studentrepository.findById(regno).orElse(null);
	}

	public String updateStudent(String regno, Student updatedStudent) {
	    Student student = studentrepository.findById(regno).orElse(null);
	    if (student != null) {
	        student.setFullname(updatedStudent.getFullname());
	        student.setDateofbirth(updatedStudent.getDateofbirth());
	        studentrepository.save(student);
	        return "Student Updated";
	    } else {
	        return "Student not found";
	    }
	}

	public String deleteStudent(String regno) {
	    Student student = studentrepository.findById(regno).orElse(null);
	    if (student != null) {
	        studentrepository.delete(student); // Delete the student
	        return "Student Deleted";
	    } else {
	        return "Student not found";
	    }
	}

}
=======
package com.auca.robert.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.auca.robert.Repository.StudentRepository;
import com.auca.robert.model.Student;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentrepository;
	
	public String SaveStudent(Student student) {
		if(student != null) {
			studentrepository.save(student);
			return "Student Saved ";
		}else {
			return null;
		}
	}
	
	public List<Student> getAllStudents() {
	    return studentrepository.findAll();
	}
	
	public Student getStudentById(String regno) {
	    return studentrepository.findById(regno).orElse(null);
	}

	public String updateStudent(String regno, Student updatedStudent) {
	    Student student = studentrepository.findById(regno).orElse(null);
	    if (student != null) {
	        student.setFullname(updatedStudent.getFullname());
	        student.setDateofbirth(updatedStudent.getDateofbirth());
	        studentrepository.save(student);
	        return "Student Updated";
	    } else {
	        return "Student not found";
	    }
	}

	public String deleteStudent(String regno) {
	    Student student = studentrepository.findById(regno).orElse(null);
	    if (student != null) {
	        studentrepository.delete(student); // Delete the student
	        return "Student Deleted";
	    } else {
	        return "Student not found";
	    }
	}

}
>>>>>>> 337fd21690365c157c4a1705dd023490a17c3354
