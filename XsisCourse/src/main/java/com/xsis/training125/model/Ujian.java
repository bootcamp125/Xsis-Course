package com.xsis.training125.model;

public class Ujian {
	
	private int id_ujian;
	private int id_peserta;
	private String nama_ujian;
	private String hasil_ujian;
	
	
	
	public int getId_ujian() {
		return id_ujian;
	}
	public void setId_ujian(int id_ujian) {
		this.id_ujian = id_ujian;
	}
	public int getId_peserta() {
		return id_peserta;
	}
	public void setId_peserta(int id_peserta) {
		this.id_peserta = id_peserta;
	}
	public String getNama_ujian() {
		return nama_ujian;
	}
	public void setNama_ujian(String nama_ujian) {
		this.nama_ujian = nama_ujian;
	}
	public String getHasil_ujian() {
		return hasil_ujian;
	}
	public void setHasil_ujian(String hasil_ujian) {
		this.hasil_ujian = hasil_ujian;
	}

}
