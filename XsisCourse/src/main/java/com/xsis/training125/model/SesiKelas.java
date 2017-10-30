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
@Table(name="SESI_KELAS")
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class,property="@id")
public class SesiKelas {
	
	@Id
	@Column(name="id_sesi_kelas") 
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idSesiKelas;
	
	@Column(name="nama_kelas")
	private String namaKelas;
	
	@Column(name="tanggal_mulai")
	private String tanggalMulai;
	
	@Column(name="tanggal_selesai")
	private String tanggalSelesai;
		
}
