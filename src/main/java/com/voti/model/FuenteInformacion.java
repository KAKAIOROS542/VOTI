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
@Table(name="Fuente_Informacion")
public class FuenteInformacion implements Serializable{
	// Atributos
	@Id
	@Column(name="id")
	private int sId;
	
	@Column(name="nombre")
	private String sNombre;
	
	@Column(name="tipo")
	private String sTipo;
	
	@Column(name="procedencia")
	private String sProcedencia;

	@OneToMany(mappedBy = "oFuente", fetch = FetchType.EAGER)
	private Set<EmpresaFuente> oFuente = new HashSet<EmpresaFuente>();
	
	// Constructor
	public FuenteInformacion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FuenteInformacion(int sId, String sNombre, String sTipo, String sProcedencia) {
		super();
		this.sId = sId;
		this.sNombre = sNombre;
		this.sTipo = sTipo;
		this.sProcedencia = sProcedencia;
	}
	
	// Metodos
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

	public String getsTipo() {
		return sTipo;
	}

	public void setsTipo(String sTipo) {
		this.sTipo = sTipo;
	}

	public String getsProcedencia() {
		return sProcedencia;
	}

	public void setsProcedencia(String sProcedencia) {
		this.sProcedencia = sProcedencia;
	}
	

	public Set<EmpresaFuente> getOfFuente() {
		return oFuente;
	}

	public void setOFuente(Set<EmpresaFuente> oFuente) {
		this.oFuente = oFuente;
	}

	public void addoFuente(EmpresaFuente oFuente) {
		this.oFuente.add(oFuente);
	}
}
