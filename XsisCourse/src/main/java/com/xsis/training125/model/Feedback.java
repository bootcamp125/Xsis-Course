package com.xsis.training125.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "Feedback")
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="@id")
public class Feedback {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id_feedback;
	@ManyToOne
	@JoinColumn(name="id_peserta")
	private int id_peserta;
	@Column(name="tanggal_feedback")
	@Temporal(TemporalType.DATE)
	private Date tanggal_feedback;
	
	
	
	public int getId_feedback() {
		return id_feedback;
	}
	public void setId_feedback(int id_feedback) {
		this.id_feedback = id_feedback;
	}
	public Date getTanggal_feedback() {
		return tanggal_feedback;
	}
	public void setTanggal_feedback(Date tanggal_feedback) {
		this.tanggal_feedback = tanggal_feedback;
	}
	public int getId_peserta() {
		return id_peserta;
	}
	public void setId_peserta(int id_peserta) {
		this.id_peserta = id_peserta;
	}
	
	

}
