package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.StudentAttendence;
@Repository
public interface StudentAttendenceRepository extends JpaRepository<StudentAttendence,Integer>{

}
