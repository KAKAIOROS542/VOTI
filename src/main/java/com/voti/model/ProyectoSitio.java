package com.voti.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.GenerationType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity 
@Table(name="Proyecto_Sitio")
public class ProyectoSitio implements Serializable{
	// Atributos
	@Id
	@Column(name="id_empresa_sncti")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int iIdProyectoSitio;
	
//	private Proyecto oProyecto;
	
//	private SitioDocumentos oSitio;

	

	@ManyToOne
    @JoinColumn(name="id_proyecto") 
    private Proyecto oProyecto;
	@ManyToOne
    @JoinColumn(name="id_sitio") 
    private SitioDocumentos oSitio2;
	
	@Column(name="nombre_documento")
	private String sNombreDocumento;
	
	@Column(name="fecha_publicacion")
	private Date dFechaPublicacion;
	
	@Column(name="tipo_colaboracion")
	private String sTipoColaboracion;
	
	@Column(name="tipo_documento")
	private String sTipoDocumento;

	

		
	public ProyectoSitio() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProyectoSitio(int iIdProyectoSitio, Proyecto oProyecto, SitioDocumentos oSitio2, String sNombreDocumento,
			Date dFechaPublicacion, String sTipoColaboracion, String sTipoDocumento) {
		super();
		this.iIdProyectoSitio = iIdProyectoSitio;
		this.oProyecto = oProyecto;
		this.oSitio2 = oSitio2;
		this.sNombreDocumento = sNombreDocumento;
		this.dFechaPublicacion = dFechaPublicacion;
		this.sTipoColaboracion = sTipoColaboracion;
		this.sTipoDocumento = sTipoDocumento;
	}
	public int getiIdProyectoSitio() {
		return iIdProyectoSitio;
	}

	public void setiIdProyectoSitio(int iIdProyectoSitio) {
		this.iIdProyectoSitio = iIdProyectoSitio;
	}

	public Proyecto getoProyecto() {
		return oProyecto;
	}

	public void setoProyecto(Proyecto oProyecto) {
		this.oProyecto = oProyecto;
	}

	public SitioDocumentos getoSitio2() {
		return oSitio2;
	}

	public void setoSitio2(SitioDocumentos oSitio2) {
		this.oSitio2 = oSitio2;
	}

	public String getsNombreDocumento() {
		return sNombreDocumento;
	}

	public void setsNombreDocumento(String sNombreDocumento) {
		this.sNombreDocumento = sNombreDocumento;
	}

	public Date getdFechaPublicacion() {
		return dFechaPublicacion;
	}

	public void setdFechaPublicacion(Date dFechaPublicacion) {
		this.dFechaPublicacion = dFechaPublicacion;
	}

	public String getsTipoColaboracion() {
		return sTipoColaboracion;
	}

	public void setsTipoColaboracion(String sTipoColaboracion) {
		this.sTipoColaboracion = sTipoColaboracion;
	}

	public String getsTipoDocumento() {
		return sTipoDocumento;
	}

	public void setsTipoDocumento(String sTipoDocumento) {
		this.sTipoDocumento = sTipoDocumento;
	}

}
