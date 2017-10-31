package com.xsis.training125.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xsis.training125.model.Employee;
import com.xsis.training125.model.SesiKelas;

@Repository
public class SesiKelasDaoImpl implements SesiKelasDao {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public List<SesiKelas> getAllSesiKelas() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();

		String myHql = "from SesiKelas";
		List<SesiKelas> sesiKelas = session.createQuery(myHql).list();
		if (sesiKelas.isEmpty()) {
			return null;
		}
		return sesiKelas;
	}

	@Override
	public void save(SesiKelas sesiKelas) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.save(sesiKelas);
		session.flush();
	}

	@Override
	public SesiKelas getSesiKelasById(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();

		SesiKelas sesiKelas = session.get(SesiKelas.class, id);

		return sesiKelas;
	}

	@Override
	public void update(SesiKelas sesiKelas) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.update(sesiKelas);
		session.flush();
	}

}
