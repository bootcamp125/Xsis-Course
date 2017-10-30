package com.xsis.training125.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "Pengajar")
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="@id")
public class Pengajar {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_pengajar", unique=true, nullable=false)
	private int idPengajar;
	@Column(name="id_user", nullable=false)
	private int idUser;
	@Column(name="no_ktp")
	private String no_ktp;
	@Column(name="nama_lengkap")
	private String nama_lengkap;
	@Column(name="tanggal_lahir")
	@Temporal(TemporalType.DATE)
	private Date tanggalLahir;
	private String alamat;
	private String keahlian;
	
	public int getIdPengajar() {
		return idPengajar;
	}
	
	public void setIdPengajar(int idPengajar) {
		this.idPengajar = idPengajar;
	}
	
	public int getIdUser() {
		return idUser;
	}
	
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	
	public String getNo_ktp() {
		return no_ktp;
	}
	
	public void setNo_ktp(String no_ktp) {
		this.no_ktp = no_ktp;
	}
	
	public String getNama_lengkap() {
		return nama_lengkap;
	}
	
	public void setNama_lengkap(String nama_lengkap) {
		this.nama_lengkap = nama_lengkap;
	}
	
	public Date getTanggalLahir() {
		return tanggalLahir;
	}
	
	public void setTanggalLahir(Date tanggalLahir) {
		this.tanggalLahir = tanggalLahir;
	}
	
	public String getAlamat() {
		return alamat;
	}
	
	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}
	
	public String getKeahlian() {
		return keahlian;
	}
	
	public void setKeahlian(String keahlian) {
		this.keahlian = keahlian;
	}

}
