package com.plasticon.erp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.StudentAttendence;
import com.plasticon.erp.repository.StudentAttendenceRepository;
@Service
public class StudentAttendenceService {
@Autowired
StudentAttendenceRepository studentAttendenceRepository;


public List<StudentAttendence> getStudentAttendenceDetails(){
	return studentAttendenceRepository.findAll();
}
public void saveStudentAttendenceDetails(StudentAttendence studentAttendence) {
	studentAttendenceRepository.save(studentAttendence);
}
public void deleteStudentAttendenceDetails(int attendenceId) {
	studentAttendenceRepository.deleteById(attendenceId);
}
}
