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
@Table(name = "UJIAN")
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="@idUjian")
public class Ujian {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="id_ujian")
	private int idUjian;

	@ManyToOne
	@JoinColumn(name="id_peserta")
	private Peserta peserta;
	
	@Column(name="nama_ujian")
	private String namaUjian;
	
	@Column(name="hasil_ujian")
	private String hasilUjian;

	
	public int getIdUjian() {
		return idUjian;
	}

	public void setIdUjian(int idUjian) {
		this.idUjian = idUjian;
	}

	public Peserta getPeserta() {
		return peserta;
	}

	public void setPeserta(Peserta peserta) {
		this.peserta = peserta;
	}

	public String getNamaUjian() {
		return namaUjian;
	}

	public void setNamaUjian(String namaUjian) {
		this.namaUjian = namaUjian;
	}

	public String getHasilUjian() {
		return hasilUjian;
	}

	public void setHasilUjian(String hasilUjian) {
		this.hasilUjian = hasilUjian;
	}
	
}
