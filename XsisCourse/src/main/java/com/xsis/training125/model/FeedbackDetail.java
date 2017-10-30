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
@Table(name = "FEEDBACK_DETAIL")
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="@idFeedbackDetail")
public class FeedbackDetail {

	@Id
	@Column(name="id_feedback_detail")
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int idFeedbackDetail;
	
	@ManyToOne
	@JoinColumn(name="id_pengajar")
	private Pengajar pengajar;
	
	@ManyToOne
	@JoinColumn(name="id_feedback")
	private Feedback feedback;

	@ManyToOne
	@JoinColumn(name="id_sesi_kelas")
	private SesiKelas sesiKelas;
	
	@Column(name="feedback_fasilitas")
	private String feedbackFasilitas;

	@Column(name="feedback_sesi_kelas")
	private String feedbackSesiKelas;

	@Column(name="feedback_pengajar")
	private String feedbackPengajar;

	public int getIdFeedbackDetail() {
		return idFeedbackDetail;
	}

	public void setIdFeedbackDetail(int idFeedbackDetail) {
		this.idFeedbackDetail = idFeedbackDetail;
	}

	public Pengajar getPengajar() {
		return pengajar;
	}

	public void setPengajar(Pengajar pengajar) {
		this.pengajar = pengajar;
	}

	public Feedback getFeedback() {
		return feedback;
	}

	public void setFeedback(Feedback feedback) {
		this.feedback = feedback;
	}

	public SesiKelas getSesiKelas() {
		return sesiKelas;
	}

	public void setSesiKelas(SesiKelas sesiKelas) {
		this.sesiKelas = sesiKelas;
	}

	public String getFeedbackFasilitas() {
		return feedbackFasilitas;
	}

	public void setFeedbackFasilitas(String feedbackFasilitas) {
		this.feedbackFasilitas = feedbackFasilitas;
	}

	public String getFeedbackSesiKelas() {
		return feedbackSesiKelas;
	}

	public void setFeedbackSesiKelas(String feedbackSesiKelas) {
		this.feedbackSesiKelas = feedbackSesiKelas;
	}

	public String getFeedbackPengajar() {
		return feedbackPengajar;
	}

	public void setFeedbackPengajar(String feedbackPengajar) {
		this.feedbackPengajar = feedbackPengajar;
	}


}
