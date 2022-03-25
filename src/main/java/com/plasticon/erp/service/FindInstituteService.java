package com.plasticon.erp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.FindInstitute;
import com.plasticon.erp.repository.FindInstituteRepository;

@Service
public class FindInstituteService {

	@Autowired
	FindInstituteRepository findInstituteRepository;
	
	public List<FindInstitute> getFindInstitute() {
		return findInstituteRepository.findAll();
	}
	
	public void saveFindInstitute(FindInstitute findinstitute) {
		findInstituteRepository.save(findinstitute);
	}
	
	public void removeFindInstitute(int id) {
		findInstituteRepository.deleteById(id);
	}
}
