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
@Table(name = "User")
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="@id")
public class User {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private int id_user;
	@Column(unique=true)
	private String username;
	private String password;
	private String level;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="user")
	private List<Pengajar> pengajar;
	private List<Peserta> peserta;
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	public int getId_user() {
		return id_user;
	}

	public void setId_user(int id_user) {
		this.id_user = id_user;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public List<Peserta> getPeserta() {
		return peserta;
	}

	public void setPeserta(List<Peserta> peserta) {
		this.peserta = peserta;
	}
	
	
}
