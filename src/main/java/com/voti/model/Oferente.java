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
@Table(name="Oferente")
public class Oferente implements Serializable{
	// Atributos
	@Id
	@Column(name="id")
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int iId;
	
	@Column(name="nombre")
	private String sNombre;

	@OneToMany(mappedBy = "oOferente2", fetch = FetchType.EAGER)
	private Set<ProyectoOferente> oOferente2 = new HashSet<ProyectoOferente>();
	
	@OneToMany(mappedBy = "oOferente", fetch = FetchType.EAGER)
	private Set<OferenteOcde> oOferente = new HashSet<OferenteOcde>();
	
	@OneToMany(mappedBy = "oOferente3", fetch = FetchType.EAGER)
	private Set<GrupoInvestigacion> oOferente3 = new HashSet<GrupoInvestigacion>();
	
	// Constructor
	public Oferente(int iId, String sNombre) {
		super();
		this.iId = iId;
		this.sNombre = sNombre;
	}

	public Oferente() {
		super();
		// TODO Auto-generated constructor stub
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


	public Set<ProyectoOferente> getoOferente2() {
		return oOferente2;
	}

	public void setoOferente2(Set<ProyectoOferente> oOferente2) {
		this.oOferente2 = oOferente2;
	}

	public void addoOferente2(ProyectoOferente oOferente2) {
		this.oOferente2.add(oOferente2);
	}

	public Set<OferenteOcde> getoOferente() {
		return oOferente;
	}

	public void setoOferente(Set<OferenteOcde> oOferente) {
		this.oOferente = oOferente;
	}
	
	public void addoOferente(OferenteOcde oOferente) {
		this.oOferente.add(oOferente);
	}

	public Set<GrupoInvestigacion> getoOferente3() {
		return oOferente3;
	}

	public void setoOferente3(Set<GrupoInvestigacion> oOferente3) {
		this.oOferente3 = oOferente3;
	}
	
	public void addoOferente3(GrupoInvestigacion oOferente3) {
		this.oOferente3.add(oOferente3);
	}
	
}
