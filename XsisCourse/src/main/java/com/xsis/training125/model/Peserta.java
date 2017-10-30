package com.xsis.training125.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "PESERTA")
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="@idPeserta")
public class Peserta {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.SEQUENCE) //Auto Increment
	@Column(name="id_peserta", unique=true)
	private int idPeserta;
	
	//Membuat One to Many untuk tabel ujian dan feedback
	@OneToMany(fetch=FetchType.LAZY, mappedBy="peserta")
	private List<Ujian> ujian;
	@OneToMany(fetch=FetchType.LAZY, mappedBy="peserta")
	private List<Feedback> feedback;
	@OneToMany(fetch=FetchType.LAZY, mappedBy="peserta")
	private List<Pembayaran> pembayaran;
	
	@ManyToOne
	@JoinColumn(name="id_user")
	private User user;
	
	@ManyToOne
	@JoinColumn(name="id_sesi_kelas")
	private SesiKelas sesiKelas;
	
	@Column(name="no_ktp", nullable = false)
	private String noKtp;
	
	@Column(name="nama_lengkap", nullable=false)
	private String namaLengkap;

	@Column(name="tanggal_lahir", nullable=false)
	private Date tanggalLahir;
	private String alamat;
	
	
	public int getIdPeserta() {
		return idPeserta;
	}
	public void setIdPeserta(int idPeserta) {
		this.idPeserta = idPeserta;
	}
	public List<Ujian> getUjian() {
		return ujian;
	}
	public void setUjian(List<Ujian> ujian) {
		this.ujian = ujian;
	}
	public List<Feedback> getFeedback() {
		return feedback;
	}
	public void setFeedback(List<Feedback> feedback) {
		this.feedback = feedback;
	}
	public List<Pembayaran> getPembayaran() {
		return pembayaran;
	}
	public void setPembayaran(List<Pembayaran> pembayaran) {
		this.pembayaran = pembayaran;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public SesiKelas getSesiKelas() {
		return sesiKelas;
	}
	public void setSesiKelas(SesiKelas sesiKelas) {
		this.sesiKelas = sesiKelas;
	}
	public String getNoKtp() {
		return noKtp;
	}
	public void setNoKtp(String noKtp) {
		this.noKtp = noKtp;
	}
	public String getNamaLengkap() {
		return namaLengkap;
	}
	public void setNamaLengkap(String namaLengkap) {
		this.namaLengkap = namaLengkap;
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
	
	
	
}
