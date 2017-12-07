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
@Table(name="Institucion")
public class Institucion implements Serializable {
	// Atributos
	@Id
	@Column(name="id")
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int sId;
	
	@Column(name="nombre")
	private String sNombre;
	
	@Column(name="caracter")
	private String sCaracter;
	
	@Column(name="tipo_ies")
	private String sTipoIes;


	@OneToMany(mappedBy = "oInstitucion", fetch = FetchType.EAGER)
	private Set<InstitucionOcde> oInstitucion = new HashSet<InstitucionOcde>();
	
	@OneToMany(mappedBy = "oInstitucion2", fetch = FetchType.EAGER)
	private Set<GrupoInvestigacion> oInstitucion2 = new HashSet<GrupoInvestigacion>();
	
	// Constructor
	public Institucion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Institucion(int sId, String sNombre, String sCaracter, String sTipoIes) {
		super();
		this.sId = sId;
		this.sNombre = sNombre;
		this.sCaracter = sCaracter;
		this.sTipoIes = sTipoIes;
	}
	
	// Metodo
	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getsNombre() {
		return sNombre;
	}

	public void setsNombre(String sNombre) {
		this.sNombre = sNombre;
	}

	public String getsCaracter() {
		return sCaracter;
	}

	public void setsCaracter(String sCaracter) {
		this.sCaracter = sCaracter;
	}

	public String getsTipoIes() {
		return sTipoIes;
	}

	public void setsTipoIes(String sTipoIes) {
		this.sTipoIes = sTipoIes;
	}

	public Set<InstitucionOcde> getoInstitucion() {
		return oInstitucion;
	}

	public void setoInstitucion(Set<InstitucionOcde> oInstitucion) {
		this.oInstitucion = oInstitucion;
	}
	
	public void addoInstitucion(InstitucionOcde oInstitucion) {
		this.oInstitucion.add(oInstitucion);
	}

	public Set<GrupoInvestigacion> getoInstitucion2() {
		return oInstitucion2;
	}

	public void setoInstitucion2(Set<GrupoInvestigacion> oInstitucion2) {
		this.oInstitucion2 = oInstitucion2;
	}
	
	public void addoInstitucion2(GrupoInvestigacion oInstitucion2) {
		this.oInstitucion2.add(oInstitucion2);
	}
	

}
