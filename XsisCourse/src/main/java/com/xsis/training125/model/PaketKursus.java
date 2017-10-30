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

@Entity //untuk menjadikan kelas menjadi sebuah tabel secara otomatis
@Table(name = "PAKET_KURSUS")
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="@id")
public class PaketKursus {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="id_kursus", nullable=false)
	private int idKursus;
	@Column(name="nama_kursus")
	private String namaKursus;
	private int durasi;
	private int harga;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="paketKursus")
	private List<Jadwal> jadwal;
	private List<Pembayaran> pembayaran;
	
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

	public List<Pembayaran> getPembayaran() {
		return pembayaran;
	}

	public void setPembayaran(List<Pembayaran> pembayaran) {
		this.pembayaran = pembayaran;
	}
	
	
}
