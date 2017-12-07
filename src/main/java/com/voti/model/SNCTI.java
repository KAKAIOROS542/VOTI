package com.voti.model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity 
@Table(name="SNCTI")
public class SNCTI implements Serializable{
	// Atributos
	@Id
	@Column(name="id")
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int iId;
	
	@Column(name="nombre")
	private String sNombre;

	@OneToMany(mappedBy = "oSNCTI", fetch = FetchType.EAGER)
	private Set<EmpresaSncti> oSNCTI = new HashSet<EmpresaSncti>();
	

	// Constructor
	public SNCTI() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SNCTI(int iId, String sNombre) {
		super();
		this.iId = iId;
		this.sNombre = sNombre;
	}
	
	// Metodos
	public int getiId() {
		return iId;
	}

	public void setiId(int iId) {
		this.iId = iId;
	}

	public String getsNombre() {
		return sNombre;
	}

	public void setsNombre(String sNombre) {
		this.sNombre = sNombre;
	}



	public Set<EmpresaSncti> getoSNCTI() {
		return oSNCTI;
	}

	public void setoSNCTI(Set<EmpresaSncti> oSNCTI) {
		this.oSNCTI = oSNCTI;
	}

	public void addoSNCTI(EmpresaSncti oSNCTI) {
		this.oSNCTI.add(oSNCTI);
	}

}
