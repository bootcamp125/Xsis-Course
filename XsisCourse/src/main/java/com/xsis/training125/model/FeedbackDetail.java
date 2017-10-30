package com.xsis.training125.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "Feedback_Detail")
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="@id")
public class FeedbackDetail {

	
	private int id_feedback_detail;
	private int id_pengajar;
	private int id_feedback;
	private int id_sesi_kelas;
	private String feedback_fasilitas;
	private String feedback_sesi_kelas;
	private String feedback_pengajar;
	
	
	public int getId_feedback_detail() {
		return id_feedback_detail;
	}
	public void setId_feedback_detail(int id_feedback_detail) {
		this.id_feedback_detail = id_feedback_detail;
	}
	public int getId_pengajar() {
		return id_pengajar;
	}
	public void setId_pengajar(int id_pengajar) {
		this.id_pengajar = id_pengajar;
	}
	public int getId_feedback() {
		return id_feedback;
	}
	public void setId_feedback(int id_feedback) {
		this.id_feedback = id_feedback;
	}
	public int getId_sesi_kelas() {
		return id_sesi_kelas;
	}
	public void setId_sesi_kelas(int id_sesi_kelas) {
		this.id_sesi_kelas = id_sesi_kelas;
	}
	public String getFeedback_fasilitas() {
		return feedback_fasilitas;
	}
	public void setFeedback_fasilitas(String feedback_fasilitas) {
		this.feedback_fasilitas = feedback_fasilitas;
	}
	public String getFeedback_sesi_kelas() {
		return feedback_sesi_kelas;
	}
	public void setFeedback_sesi_kelas(String feedback_sesi_kelas) {
		this.feedback_sesi_kelas = feedback_sesi_kelas;
	}
	public String getFeedback_pengajar() {
		return feedback_pengajar;
	}
	public void setFeedback_pengajar(String feedback_pengajar) {
		this.feedback_pengajar = feedback_pengajar;
	}
}
