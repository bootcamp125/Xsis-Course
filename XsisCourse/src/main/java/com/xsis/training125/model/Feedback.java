package com.xsis.training125.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "FEEDBACK")
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="@idFeedback")
public class Feedback {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="id_feedback")
	private int idFeedback;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="feedback")
	private List<FeedbackDetail> feedbackDetail;
	
	@ManyToOne
	@JoinColumn(name="id_peserta")
	private Peserta peserta;
	
	@Column(name="tanggal_feedback")
	@Temporal(TemporalType.DATE)
	private Date tanggal_feedback;

	public int getIdFeedback() {
		return idFeedback;
	}

	public void setIdFeedback(int idFeedback) {
		this.idFeedback = idFeedback;
	}

	public List<FeedbackDetail> getFeedbackDetail() {
		return feedbackDetail;
	}

	public void setFeedbackDetail(List<FeedbackDetail> feedbackDetail) {
		this.feedbackDetail = feedbackDetail;
	}

	public Peserta getPeserta() {
		return peserta;
	}

	public void setPeserta(Peserta peserta) {
		this.peserta = peserta;
	}

	public Date getTanggal_feedback() {
		return tanggal_feedback;
	}

	public void setTanggal_feedback(Date tanggal_feedback) {
		this.tanggal_feedback = tanggal_feedback;
	}
	
	
	
}
