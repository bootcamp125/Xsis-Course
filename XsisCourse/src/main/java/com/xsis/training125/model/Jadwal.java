package com.xsis.training125.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "JADWAL")
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="@idJadwal")
public class Jadwal {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="id_jadwal", unique=true, nullable=false)
	private int idJadwal;
	
	private String hari;
	
	private String jam;
	
	@ManyToOne
	@JoinColumn(name="id_pengajar")
	private Pengajar pengajar;

	@ManyToOne
	@JoinColumn(name="id_sesi_kelas")
	private SesiKelas sesiKelas;

	@ManyToOne
	@JoinColumn(name="id_ruang")
	private Ruang ruang;

	@ManyToOne
	@JoinColumn(name="id_kursus")
	private PaketKursus paketKursus;

	public int getIdJadwal() {
		return idJadwal;
	}
	
	public void setIdJadwal(int idJadwal) {
		this.idJadwal = idJadwal;
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
