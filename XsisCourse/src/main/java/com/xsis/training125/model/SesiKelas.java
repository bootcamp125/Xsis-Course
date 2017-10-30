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
@Table(name="SESI_KELAS")
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class,property="@id")
public class SesiKelas {
	
	@Id
	@Column(name="id_sesi_kelas")
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int idSesiKelas;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="sesiKelas")
	private List<Jadwal> jadwal;
	
	
	@Column(name="nama_kelas")
	private String namaKelas;
	
	@Column(name="tanggal_mulai")
	private String tanggalMulai;
	
	@Column(name="tanggal_selesai")
	private String tanggalSelesai;

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

	public String getNamaKelas() {
		return namaKelas;
	}

	public void setNamaKelas(String namaKelas) {
		this.namaKelas = namaKelas;
	}

	public String getTanggalMulai() {
		return tanggalMulai;
	}

	public void setTanggalMulai(String tanggalMulai) {
		this.tanggalMulai = tanggalMulai;
	}

	public String getTanggalSelesai() {
		return tanggalSelesai;
	}

	public void setTanggalSelesai(String tanggalSelesai) {
		this.tanggalSelesai = tanggalSelesai;
	}
		
}
