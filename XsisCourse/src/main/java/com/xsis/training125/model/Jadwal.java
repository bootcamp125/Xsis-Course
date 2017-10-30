package com.xsis.training125.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "Jadwal")
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="@id")
public class Jadwal {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_jadwal", unique=true, nullable=false)
	private int idJadwal;
	@Column(name="id_pengajar", nullable=false)
	private int idPengajar;
	@Column(name="id_sesi_kelas", nullable=false)
	private int idSesiKelas;
	@Column(name="id_ruang", nullable=false)
	private int idRuang;
	@Column(name="id_kursus", nullable=false)
	private int idKursus;
	private String hari;
	private String jam;
	
	@ManyToOne
	@JoinColumn(name="id_pengajar")
	private Department department;

	@ManyToOne
	@JoinColumn(name="id_department")
	private Department department;

	@ManyToOne
	@JoinColumn(name="id_department")
	private Department department;

	@ManyToOne
	@JoinColumn(name="id_department")
	private Department department;

	public int getIdJadwal() {
		return idJadwal;
	}
	
	public void setIdJadwal(int idJadwal) {
		this.idJadwal = idJadwal;
	}
	
	public int getIdPengajar() {
		return idPengajar;
	}
	
	public void setIdPengajar(int idPengajar) {
		this.idPengajar = idPengajar;
	}
	
	public int getIdSesiKelas() {
		return idSesiKelas;
	}
	
	public void setIdSesiKelas(int idSesiKelas) {
		this.idSesiKelas = idSesiKelas;
	}
	
	public int getIdRuang() {
		return idRuang;
	}
	
	public void setIdRuang(int idRuang) {
		this.idRuang = idRuang;
	}
	
	public int getIdKursus() {
		return idKursus;
	}
	
	public void setIdKursus(int idKursus) {
		this.idKursus = idKursus;
	}
	
	public String getHari() {
		return hari;
	}
	
	public void setHari(String hari) {
		this.hari = hari;
	}
	
	public String getJam() {
		return jam;
	}
	
	public void setJam(String jam) {
		this.jam = jam;
	}
}
