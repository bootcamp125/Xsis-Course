package com.xsis.training125.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xsis.training125.dao.SesiKelasDao;
import com.xsis.training125.model.SesiKelas;

@Transactional
@Service
public class SesiKelasService {
	

	@Autowired
	SesiKelasDao sesiKelasDao;
	
	public List<SesiKelas> getAllSesiKelas() {
		// TODO Auto-generated method stub
		return sesiKelasDao.getAllSesiKelas();
		//return null;
	}

	public void save(SesiKelas sesiKelas) {
		// TODO Auto-generated method stub
		sesiKelasDao.save(sesiKelas);
	}

	public SesiKelas getSesiKelasById(int id) {
		// TODO Auto-generated method stub
		return sesiKelasDao.getSesiKelasById(id);
	}

	public void update(SesiKelas sesiKelas) {
		// TODO Auto-generated method stub
		sesiKelasDao.update(sesiKelas);
		
	}

}
