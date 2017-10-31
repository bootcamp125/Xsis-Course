package com.xsis.training125.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name="SESI_KELAS")
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class,property="@idSesiKelas")
public class SesiKelas {
	
	@Id
	@Column(name="id_sesi_kelas")
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int idSesiKelas;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="sesiKelas")
	private List<Jadwal> jadwal;
	@OneToMany(fetch=FetchType.LAZY, mappedBy="sesiKelas")
	private List<Peserta> peserta;
	@OneToMany(fetch=FetchType.LAZY, mappedBy="sesiKelas")
	private List<FeedbackDetail> feedbackDetail;
	
	@Column(name="nama_kelas")
	private String namaKelas;
	
	@Column(name="tanggal_mulai")
	private Date tanggalMulai;
	
	@Column(name="tanggal_selesai")
	private Date tanggalSelesai;

	public int getIdSesiKelas() {
		return idSesiKelas;
	}

	public void setIdSesiKelas(int idSesiKelas) {
		this.idSesiKelas = idSesiKelas;
	}

	public List<Jadwal> getJadwal() {
		return jadwal;
	}

	public void setJadwal(List<Jadwal> jadwal) {
		this.jadwal = jadwal;
	}

	public List<Peserta> getPeserta() {
		return peserta;
	}

	public void setPeserta(List<Peserta> peserta) {
		this.peserta = peserta;
	}

	public List<FeedbackDetail> getFeedbackDetail() {
		return feedbackDetail;
	}

	public void setFeedbackDetail(List<FeedbackDetail> feedbackDetail) {
		this.feedbackDetail = feedbackDetail;
	}

	public String getNamaKelas() {
		return namaKelas;
	}

	public void setNamaKelas(String namaKelas) {
		this.namaKelas = namaKelas;
	}

	public Date getTanggalMulai() {
		return tanggalMulai;
	}

	public void setTanggalMulai(Date tanggalMulai) {
		this.tanggalMulai = tanggalMulai;
	}

	public Date getTanggalSelesai() {
		return tanggalSelesai;
	}

	public void setTanggalSelesai(Date tanggalSelesai) {
		this.tanggalSelesai = tanggalSelesai;
	}

	public SesiKelas(){}
	
	public SesiKelas(int idSesiKelas, List<Jadwal> jadwal, List<Peserta> peserta, List<FeedbackDetail> feedbackDetail,
			String namaKelas, Date tanggalMulai, Date tanggalSelesai) {
		super();
		this.idSesiKelas = idSesiKelas;
		this.jadwal = jadwal;
		this.peserta = peserta;
		this.feedbackDetail = feedbackDetail;
		this.namaKelas = namaKelas;
		this.tanggalMulai = tanggalMulai;
		this.tanggalSelesai = tanggalSelesai;
	}
	
			
}
