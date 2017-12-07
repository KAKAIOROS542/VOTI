package com.voti.model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity 
@Table(name="Empresa")
public class Empresa implements Serializable{
	//Atributos
	@Id
	@Column(name="id")
	private int iId;
	
	@Column(name="nombre")
	private String sNombre;
	
	@Column(name="sector")
	private String sSector;
	
	@Column(name="fecha_creacion")
	private Date dFechaCreacion;
	
	@Column(name="actividad")
	private String sActividad;
	
	@Column(name="area")
	private String sArea;
	
	@Column(name="tipo")
	private String sTipo;
	
	@Column(name="tamanio")
	private String sTamanio;
	
	@Column(name="sector_ciiu")
	private String sSectorCiiu;


	@OneToMany(mappedBy = "oEmpresa", fetch = FetchType.EAGER)
	private Set<EmpresaFuente> oEmpresa = new HashSet<EmpresaFuente>();
	
	@OneToMany(mappedBy = "oEmpresa2", fetch = FetchType.EAGER)
	private Set<EmpresaObstaculo> oEmpresa2 = new HashSet<EmpresaObstaculo>();
	
	@OneToMany(mappedBy = "oEmpresa3", fetch = FetchType.EAGER)
	private Set<EmpresaSncti> oEmpresa3 = new HashSet<EmpresaSncti>();
	
	@OneToMany(mappedBy = "oEmpresa4", fetch = FetchType.EAGER)
	private Set<UsuarioEmpresa> oEmpresa4 = new HashSet<UsuarioEmpresa>();
	
	@OneToMany(mappedBy = "oEmpresa5", fetch = FetchType.EAGER)
	private Set<GrupoInvestigacion> oEmpresa5 = new HashSet<GrupoInvestigacion>();
	
	@OneToMany(mappedBy = "oEmpresa6", fetch = FetchType.EAGER)
	private Set<PropiedadIntelectual> oEmpresa6 = new HashSet<PropiedadIntelectual>();
	// Constructor
	public Empresa() {
		super();
	}

	public Empresa(int iId, String sNombre, String sSector, Date dFechaCreacion, String sActividad, String sArea,
			String sTipo, String sTamanio, String sSectorCiiu) {
		super();
		this.iId = iId;
		this.sNombre = sNombre;
		this.sSector = sSector;
		this.dFechaCreacion = dFechaCreacion;
		this.sActividad = sActividad;
		this.sArea = sArea;
		this.sTipo = sTipo;
		this.sTamanio = sTamanio;
		this.sSectorCiiu = sSectorCiiu;
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

	public String getsSector() {
		return sSector;
	}

	public void setsSector(String sSector) {
		this.sSector = sSector;
	}

	public Date getdFechaCreacion() {
		return dFechaCreacion;
	}

	public void setdFechaCreacion(Date dFechaCreacion) {
		this.dFechaCreacion = dFechaCreacion;
	}

	public String getsActividad() {
		return sActividad;
	}

	public void setsActividad(String sActividad) {
		this.sActividad = sActividad;
	}

	public String getsArea() {
		return sArea;
	}

	public void setsArea(String sArea) {
		this.sArea = sArea;
	}

	public String getsTipo() {
		return sTipo;
	}

	public void setsTipo(String sTipo) {
		this.sTipo = sTipo;
	}

	public String getsTamanio() {
		return sTamanio;
	}

	public void setsTamanio(String sTamanio) {
		this.sTamanio = sTamanio;
	}

	public String getsSectorCiiu() {
		return sSectorCiiu;
	}

	public void setsSectorCiiu(String sSectorCiiu) {
		this.sSectorCiiu = sSectorCiiu;
	}

	public Set<EmpresaFuente> getoEmpresa() {
		return oEmpresa;
	}

	public void setoEmpresa(Set<EmpresaFuente> oEmpresa) {
		this.oEmpresa = oEmpresa;
	}
	
	public void addoEmpresa(EmpresaFuente oEmpresa) {
		this.oEmpresa.add(oEmpresa);
	}


	public Set<EmpresaObstaculo> getoEmpresa2() {
		return oEmpresa2;
	}

	public void setoEmpresa2(Set<EmpresaObstaculo> oEmpresa2) {
		this.oEmpresa2 = oEmpresa2;
	}
	
	public void addooEmpresa2(EmpresaObstaculo oEmpresa2) {
		this.oEmpresa2.add(oEmpresa2);
	}


	public Set<EmpresaSncti> getoEmpresa3() {
		return oEmpresa3;
	}

	public void setoEmpresa3(Set<EmpresaSncti> oEmpresa3) {
		this.oEmpresa3 = oEmpresa3;
		
	}
	
	public void addoEmpresa3(EmpresaSncti oEmpresa3) {
		this.oEmpresa3.add(oEmpresa3);
	}


	public Set<UsuarioEmpresa> getoEmpresa4() {
		return oEmpresa4;
	}

	public void setoEmpresa4(Set<UsuarioEmpresa> oEmpresa4) {
		this.oEmpresa4 = oEmpresa4;
	}


	public void addoEmpresa4(UsuarioEmpresa oEmpresa4) {
		this.oEmpresa4.add(oEmpresa4);
	}

	public Set<GrupoInvestigacion> getoEmpresa5() {
		return oEmpresa5;
	}

	public void setoEmpresa5(Set<GrupoInvestigacion> oEmpresa5) {
		this.oEmpresa5 = oEmpresa5;
	}
	
	public void addoEmpresa5(GrupoInvestigacion oEmpresa5) {
		this.oEmpresa5.add(oEmpresa5);
		
	}

	public Set<PropiedadIntelectual> getoEmpresa6() {
		return oEmpresa6;
	}

	public void setoEmpresa6(Set<PropiedadIntelectual> oEmpresa6) {
		this.oEmpresa6 = oEmpresa6;
	}

	
}
