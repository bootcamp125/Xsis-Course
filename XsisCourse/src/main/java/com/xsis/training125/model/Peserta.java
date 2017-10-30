package com.xsis.training125.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "Peserta")
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="@id")
public class Peserta {

	private int id_peserta;
	private int id_user;
	private int id_kelas;
	private String no_ktp;
	private String nama_lengkap;
	private Date tanggal_lahir;
	private String alamat;
	public int getId_peserta() {
		return id_peserta;
	}
	public void setId_peserta(int id_peserta) {
		this.id_peserta = id_peserta;
	}
	public int getId_user() {
		return id_user;
	}
	public void setId_user(int id_user) {
		this.id_user = id_user;
	}
	public int getId_kelas() {
		return id_kelas;
	}
	public void setId_kelas(int id_kelas) {
		this.id_kelas = id_kelas;
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
	public Date getTanggal_lahir() {
		return tanggal_lahir;
	}
	public void setTanggal_lahir(Date tanggal_lahir) {
		this.tanggal_lahir = tanggal_lahir;
	}
	public String getAlamat() {
		return alamat;
	}
	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}
	
	
}
