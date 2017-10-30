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
@Table(name = "Pembayaran")
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="@id")
public class Pembayaran {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_pembayaran", unique=true, nullable=false)
	private int idPembayaran;
	@Column(name="id_kursus", nullable=false)
	private int idKursus;
	@Column(name="id_peserta", nullable=false)
	private int idPeserta;
	private String status;
	private int nominal;
	
	/*@OneToMany(fetch=FetchType.LAZY, mappedBy="department")
	private List<Employee> employees;
	*/
	public int getIdPembayaran() {
		return idPembayaran;
	}
	
	public void setIdPembayaran(int idPembayaran) {
		this.idPembayaran = idPembayaran;
	}
	
	public int getIdKursus() {
		return idKursus;
	}
	
	public void setIdKursus(int idKursus) {
		this.idKursus = idKursus;
	}
	
	public int getIdPeserta() {
		return idPeserta;
	}
	
	public void setIdPeserta(int idPeserta) {
		this.idPeserta = idPeserta;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public int getNominal() {
		return nominal;
	}
	
	public void setNominal(int nominal) {
		this.nominal = nominal;
	}
	
}
