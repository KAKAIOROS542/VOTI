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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity 
@Table(name="Proyecto")
public class Proyecto implements Serializable {
	// Atributos
	@Id
	@Column(name="id")
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int iId;
	@ManyToOne
    @JoinColumn(name="id_encargado") 
	private Usuario oEncargado;
	@ManyToOne
    @JoinColumn(name="id_grupo") 
	private GrupoInvestigacion oGrupoInvestigacion2;
	
	@Column(name="nombre")
	private String sNombre;
	
	@Column(name="fecha_inicio")
	private Date dFechaInicio;
	
	@Column(name="fecha_fin")
	private Date dFechaFin;
	
	@Column(name="estado")
	private String sEstado;
	
	@Column(name="tipo")
	private String sTipo;
	
	@Column(name="impacto")
	private String sImpacto;
	
	@Column(name="grado_impacto")
	private String sGradoImpacto;
	
	@Column(name="tipo_innovacion")
	private String sTipoInnovacion;
	
	@Column(name="destino_venta")
	private String sDestinoVenta;
	
	@Column(name="monto_venta")
	private double dMontoVenta;

	@OneToMany(mappedBy = "oSitio2", fetch = FetchType.EAGER)
	private Set<ProyectoSitio> oSitio2 = new HashSet<ProyectoSitio>();
	
	@OneToMany(mappedBy = "oProyecto", fetch = FetchType.EAGER)
	private Set<Proyecto> oProyecto = new HashSet<Proyecto>();
	
	
	
	
	
	// Constructor
	public Proyecto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Proyecto(int iId, Usuario oEncargado, GrupoInvestigacion oGrupoInvestigacion2, String sNombre,
			Date dFechaInicio, Date dFechaFin, String sEstado, String sTipo, String sImpacto, String sGradoImpacto,
			String sTipoInnovacion, String sDestinoVenta, double dMontoVenta) {
		super();
		this.iId = iId;
		this.oEncargado = oEncargado;
		this.oGrupoInvestigacion2 = oGrupoInvestigacion2;
		this.sNombre = sNombre;
		this.dFechaInicio = dFechaInicio;
		this.dFechaFin = dFechaFin;
		this.sEstado = sEstado;
		this.sTipo = sTipo;
		this.sImpacto = sImpacto;
		this.sGradoImpacto = sGradoImpacto;
		this.sTipoInnovacion = sTipoInnovacion;
		this.sDestinoVenta = sDestinoVenta;
		this.dMontoVenta = dMontoVenta;

	}



	// Metodos
	public int getiId() {
		return iId;
	}

	public void setiId(int iId) {
		this.iId = iId;
	}

	public Usuario getoEncargado() {
		return oEncargado;
	}

	public void setoEncargado(Usuario oEncargado) {
		this.oEncargado = oEncargado;
	}

	public GrupoInvestigacion getoGrupoInvestigacion2() {
		return oGrupoInvestigacion2;
	}

	public void setoGrupoInvestigacion2(GrupoInvestigacion oGrupoInvestigacion2) {
		this.oGrupoInvestigacion2 = oGrupoInvestigacion2;
	}

	public String getsNombre() {
		return sNombre;
	}

	public void setsNombre(String sNombre) {
		this.sNombre = sNombre;
	}

	public Date getdFechaInicio() {
		return dFechaInicio;
	}

	public void setdFechaInicio(Date dFechaInicio) {
		this.dFechaInicio = dFechaInicio;
	}

	public Date getdFechaFin() {
		return dFechaFin;
	}

	public void setdFechaFin(Date dFechaFin) {
		this.dFechaFin = dFechaFin;
	}

	public String getsEstado() {
		return sEstado;
	}

	public void setsEstado(String sEstado) {
		this.sEstado = sEstado;
	}

	public String getsTipo() {
		return sTipo;
	}

	public void setsTipo(String sTipo) {
		this.sTipo = sTipo;
	}

	public String getsImpacto() {
		return sImpacto;
	}

	public void setsImpacto(String sImpacto) {
		this.sImpacto = sImpacto;
	}

	public String getsGradoImpacto() {
		return sGradoImpacto;
	}

	public void setsGradoImpacto(String sGradoImpacto) {
		this.sGradoImpacto = sGradoImpacto;
	}

	public String getsTipoInnovacion() {
		return sTipoInnovacion;
	}

	public void setsTipoInnovacion(String sTipoInnovacion) {
		this.sTipoInnovacion = sTipoInnovacion;
	}

	public String getsDestinoVenta() {
		return sDestinoVenta;
	}

	public void setsDestinoVenta(String sDestinoVenta) {
		this.sDestinoVenta = sDestinoVenta;
	}

	public double getdMontoVenta() {
		return dMontoVenta;
	}

	public void setdMontoVenta(double dMontoVenta) {
		this.dMontoVenta = dMontoVenta;
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



	public Set<Proyecto> getoProyecto() {
		return oProyecto;
	}



	public void setoProyecto(Set<Proyecto> oProyecto) {
		this.oProyecto = oProyecto;
	}
	
	public void addoProyecto(Proyecto oProyecto) {
		this.oProyecto.add(oProyecto);
	}
	
}
