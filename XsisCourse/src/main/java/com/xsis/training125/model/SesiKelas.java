package com.xsis.training125.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "Sesi_Kelas")
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="@id")
public class SesiKelas {

	private int id_sesi_kelas;
	private String nama_kelas;
	private String tanggal_mulai;
	private String tanggal_selesai;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="sesiKelas")
	private List<Jadwal> jadwal;
	
	public int getId_sesi_kelas() {
		return id_sesi_kelas;
	}
	public void setId_sesi_kelas(int id_sesi_kelas) {
		this.id_sesi_kelas = id_sesi_kelas;
	}
	public String getNama_kelas() {
		return nama_kelas;
	}
	public void setNama_kelas(String nama_kelas) {
		this.nama_kelas = nama_kelas;
	}
	public String getTanggal_mulai() {
		return tanggal_mulai;
	}
	public void setTanggal_mulai(String tanggal_mulai) {
		this.tanggal_mulai = tanggal_mulai;
	}
	public String getTanggal_selesai() {
		return tanggal_selesai;
	}
	public void setTanggal_selesai(String tanggal_selesai) {
		this.tanggal_selesai = tanggal_selesai;
	}
	
}
