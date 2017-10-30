package com.xsis.training125.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "Paket_Kursus")
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="@id")
public class PaketKursus {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_kursus", nullable=false)
	private int idKursus;
	@Column(name="nama_kursus")
	private String namaKursus;
	private int durasi;
	private int harga;
	
	public int getIdKursus() {
		return idKursus;
	}
	
	public void setIdKursus(int idKursus) {
		this.idKursus = idKursus;
	}
	
	public String getNamaKursus() {
		return namaKursus;
	}
	
	public void setNamaKursus(String namaKursus) {
		this.namaKursus = namaKursus;
	}
	
	public int getDurasi() {
		return durasi;
	}
	
	public void setDurasi(int durasi) {
		this.durasi = durasi;
	}
	
	public int getHarga() {
		return harga;
	}
	
	public void setHarga(int harga) {
		this.harga = harga;
	}
	
	
}
