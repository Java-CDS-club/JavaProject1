package com.plasticon.erp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.plasticon.erp.model.StudentAttendence;
import com.plasticon.erp.service.StudentAttendenceService;

@RestController
@RequestMapping(value="/studentattendence")
public class StudentAttendenceController {
@Autowired
StudentAttendenceService studentAttendenceService;

@GetMapping(value="/getstudentattendence")
public List<StudentAttendence> getStudentAttendenceDetails(){
	return studentAttendenceService.getStudentAttendenceDetails();
}


@PostMapping(value="/savestudentattendence",consumes="application/json")
public void saveStudentAttendenceDetails(@RequestBody StudentAttendence studentAttendence) {
	studentAttendenceService.saveStudentAttendenceDetails(studentAttendence);
}


@DeleteMapping(value="/deletestudentattendence/{attendenceId}")
public void deleteStudentAttendenceDetails(@PathVariable int attendenceId) {
	studentAttendenceService.deleteStudentAttendenceDetails(attendenceId);
}
}
