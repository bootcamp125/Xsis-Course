package com.xsis.training125.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	private String status;
	private int nominal;
	
	@ManyToOne
	@JoinColumn(name="id_kursus")
	private PaketKursus paketKursus;
	
	@ManyToOne
	@JoinColumn(name="id_peserta")
	private Peserta peserta;
	
	public int getIdPembayaran() {
		return idPembayaran;
	}
	
	public void setIdPembayaran(int idPembayaran) {
		this.idPembayaran = idPembayaran;
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
