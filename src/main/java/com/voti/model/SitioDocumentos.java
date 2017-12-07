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
@Table(name="Sitio_Documentos")
public class SitioDocumentos implements Serializable {
	// Atributos
	@Id
	@Column(name="id")
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int iId;
	
	@Column(name="nombre")
	private String sNombre;
	
	@Column(name="url")
	private String sUrl;
	
	@Column(name="descripcion")
	private String sDescripcion;


	@OneToMany(mappedBy = "oSitio2", fetch = FetchType.EAGER)
	private Set<ProyectoSitio> oSitio2 = new HashSet<ProyectoSitio>();
	
	// Constructor
	public SitioDocumentos() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SitioDocumentos(int iId, String sNombre, String sUrl, String sDescripcion) {
		super();
		this.iId = iId;
		this.sNombre = sNombre;
		this.sUrl = sUrl;
		this.sDescripcion = sDescripcion;
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

	public String getsUrl() {
		return sUrl;
	}

	public void setsUrl(String sUrl) {
		this.sUrl = sUrl;
	}

	public String getsDescripcion() {
		return sDescripcion;
	}

	public void setsDescripcion(String sDescripcion) {
		this.sDescripcion = sDescripcion;
	}

	public Set<ProyectoSitio> getoSitio2() {
		return oSitio2;
	}

	public void setoSitio2(Set<ProyectoSitio> oSitio2) {
		this.oSitio2 = oSitio2;
	}

	public void addoSitio2(ProyectoSitio oSitio2) {
		this.oSitio2.add(oSitio2);
	}
	

}
