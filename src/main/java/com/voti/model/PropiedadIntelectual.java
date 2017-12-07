package com.voti.model;

import java.io.Serializable;
import javax.persistence.GenerationType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity 
@Table(name="Propiedad_Intelectual")
public class PropiedadIntelectual implements Serializable {
	// Atributos
	@Id
	@Column(name="id")
	private int iId;
	
//	private Empresa oEmpresa;
	@ManyToOne
    @JoinColumn(name="id_empresa") 
    private Empresa oEmpresa6;

	
	@Column(name="nombre_registro")
	private String sNombreRegistro;
	
	@Column(name="tipo")
	private String sTipo;
	
	@Column(name="es_formal")
	private boolean es_formal;
	

	
	
	// Constructor
	public PropiedadIntelectual() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public PropiedadIntelectual(int iId, Empresa oEmpresa6, String sNombreRegistro, String sTipo, boolean es_formal) {
		super();
		this.iId = iId;
		this.oEmpresa6 = oEmpresa6;
		this.sNombreRegistro = sNombreRegistro;
		this.sTipo = sTipo;
		this.es_formal = es_formal;
	}

	// Metodos
	public int getiId() {
		return iId;
	}

	public void setiId(int iId) {
		this.iId = iId;
	}

	public Empresa getoEmpresa6() {
		return oEmpresa6;
	}

	public void setoEmpresa6(Empresa oEmpresa6) {
		this.oEmpresa6 = oEmpresa6;
	}

	public String getsNombreRegistro() {
		return sNombreRegistro;
	}

	public void setsNombreRegistro(String sNombreRegistro) {
		this.sNombreRegistro = sNombreRegistro;
	}

	public String getsTipo() {
		return sTipo;
	}

	public void setsTipo(String sTipo) {
		this.sTipo = sTipo;
	}

	public boolean isEs_formal() {
		return es_formal;
	}

	public void setEs_formal(boolean es_formal) {
		this.es_formal = es_formal;
	}
	
}
