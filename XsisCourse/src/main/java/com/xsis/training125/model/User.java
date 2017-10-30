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

@Entity
@Table(name = "USER")
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="@idUser")
public class User {
	
	@Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="id_user", unique=true, nullable=false)
	private int idUser;
	
	@Column(unique=true)
	private String username;
	private String password;
	private String level;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="user")
	private List<Pengajar> pengajar;
	@OneToMany(fetch=FetchType.LAZY, mappedBy="user")
	private List<Peserta> peserta;
	public int getIdUser() {
		return idUser;
	}
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public List<Pengajar> getPengajar() {
		return pengajar;
	}
	public void setPengajar(List<Pengajar> pengajar) {
		this.pengajar = pengajar;
	}
	public List<Peserta> getPeserta() {
		return peserta;
	}
	public void setPeserta(List<Peserta> peserta) {
		this.peserta = peserta;
	}
	
		
}
