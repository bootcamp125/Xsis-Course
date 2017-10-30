package com.xsis.training125.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "Peserta")
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="@id")
public class Peserta {

	private int id_peserta;
	private String no_ktp;
	private String nama_lengkap;
	private Date tanggal_lahir;
	private String alamat;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="peserta")
	private List<Feedback> feedback;
	private List<Ujian> ujian;
	private List<Pembayaran> pembayaran;

	@ManyToOne
	@JoinColumn(name="id_user")
	private User user;
	
	@ManyToOne
	@JoinColumn(name="id_sesi_kelas")
	private SesiKelas sesiKelas;

	public int getId_peserta() {
		return id_peserta;
	}
	
	public void setId_peserta(int id_peserta) {
		this.id_peserta = id_peserta;
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

	public List<Ujian> getUjian() {
		return ujian;
	}

	public void setUjian(List<Ujian> ujian) {
		this.ujian = ujian;
	}

	public List<Pembayaran> getPembayaran() {
		return pembayaran;
	}

	public void setPembayaran(List<Pembayaran> pembayaran) {
		this.pembayaran = pembayaran;
	}
	
}
