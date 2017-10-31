package com.xsis.training125.dao;

import java.util.List;

import com.xsis.training125.model.SesiKelas;


public interface SesiKelasDao {

	public List<SesiKelas> getAllSesiKelas();

	public void save(SesiKelas sesiKelas);

	public SesiKelas getSesiKelasById(int id);

	public void update(SesiKelas sesiKelas);
}
