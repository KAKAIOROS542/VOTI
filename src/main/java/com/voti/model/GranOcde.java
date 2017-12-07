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
@Table(name="Gran_Ocde")
public class GranOcde implements Serializable{
	// Atributos
	@Id
	@Column(name="id")
	private int iId;
	
	@Column(name="nombre")
	private String sNombre;


	@OneToMany(mappedBy = "oGranOcde", fetch = FetchType.EAGER)
	private Set<Ocde> oGranOcde = new HashSet<Ocde>();
	
	@OneToMany(mappedBy = "oGranOcde2", fetch = FetchType.EAGER)
	private Set<GranOcdeGrupo> oGranOcde2 = new HashSet<GranOcdeGrupo>();
	
	// Constructor
	public GranOcde() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GranOcde(int iId, String sNombre) {
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

	public Set<Ocde> getoGranOcde() {
		return oGranOcde;
	}

	public void setoGranOcde(Set<Ocde> oGranOcde) {
		this.oGranOcde = oGranOcde;
	}
	
	public void addoGranOcde(Ocde oGranOcde) {
		this.oGranOcde.add(oGranOcde);
	}

	public Set<GranOcdeGrupo> getoGranOcde2() {
		return oGranOcde2;
	}

	public void setoGranOcde2(Set<GranOcdeGrupo> oGranOcde2) {
		this.oGranOcde2 = oGranOcde2;
	}
	
	public void addoGranOcde2(GranOcdeGrupo oGranOcde2) {
		this.oGranOcde2.add(oGranOcde2);
	}


}
