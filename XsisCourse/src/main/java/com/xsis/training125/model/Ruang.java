package com.xsis.training125.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "RUANG")
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="@idRuang")
public class Ruang {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="id_ruang", unique=true, nullable=false)
	private int idRuang;
	
	@Column(name="nama_ruang")
	private String namaRuang;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="ruang")
	private List<Jadwal> jadwal;

	public int getIdRuang() {
		return idRuang;
	}

	public void setIdRuang(int idRuang) {
		this.idRuang = idRuang;
	}

	public String getNamaRuang() {
		return namaRuang;
	}

	public void setNamaRuang(String namaRuang) {
		this.namaRuang = namaRuang;
	}

	public List<Jadwal> getJadwal() {
		return jadwal;
	}

	public void setJadwal(List<Jadwal> jadwal) {
		this.jadwal = jadwal;
	}
	
	
}
