package com.voti.model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.GenerationType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity 
@Table(name="Grupo_Investigacion")
public class GrupoInvestigacion implements Serializable {
	// Atributos
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int iId;
	
//	private Usuario oLider;
	
//	private Institucion oInstitucion;
	
//	private Empresa oEmpresa;
	

	//	private Oferente oOferente;
	@ManyToOne
    @JoinColumn(name="id_lider") 
    private Usuario oLider;
	@ManyToOne
    @JoinColumn(name="id_institucion") 
    private Institucion oInstitucion2;
	@ManyToOne
    @JoinColumn(name="id_empresa") 
    private Empresa oEmpresa5;
	@ManyToOne
    @JoinColumn(name="id_oferente") 
    private Oferente oOferente3;
	
	@Column(name="nombre")
	private String sNombre;
	
	@Column(name="estado")
	private String sEstado;
	
	@Column(name="departamento")
	private String sDepartamento;
	
	@Column(name="fecha_creacion")
	private Date dFechaCreacion;
	
	
	@OneToMany(mappedBy = "oGrupoInvestigacion", fetch = FetchType.EAGER)
	private Set<GranOcdeGrupo> oGrupoInvestigacion = new HashSet<GranOcdeGrupo>();
	
	@OneToMany(mappedBy = "oGrupoInvestigacion2", fetch = FetchType.EAGER)
	private Set<Proyecto> oGrupoInvestigacion2 = new HashSet<Proyecto>();
	
	

	// Constructor
	public GrupoInvestigacion() {
		super();
		// TODO Auto-generated constructor stub
	}



	public GrupoInvestigacion(int iId, Usuario oLider, Institucion oInstitucion2, Empresa oEmpresa5,
			Oferente oOferente3, String sNombre, String sEstado, String sDepartamento, Date dFechaCreacion) {
		super();
		this.iId = iId;
		this.oLider = oLider;
		this.oInstitucion2 = oInstitucion2;
		this.oEmpresa5 = oEmpresa5;
		this.oOferente3 = oOferente3;
		this.sNombre = sNombre;
		this.sEstado = sEstado;
		this.sDepartamento = sDepartamento;
		this.dFechaCreacion = dFechaCreacion;
	}



	public int getiId() {
		return iId;
	}



	public void setiId(int iId) {
		this.iId = iId;
	}



	public Usuario getoLider() {
		return oLider;
	}



	public void setoLider(Usuario oLider) {
		this.oLider = oLider;
	}



	public Institucion getoInstitucion2() {
		return oInstitucion2;
	}



	public void setoInstitucion2(Institucion oInstitucion2) {
		this.oInstitucion2 = oInstitucion2;
	}



	public Empresa getoEmpresa5() {
		return oEmpresa5;
	}



	public void setoEmpresa5(Empresa oEmpresa5) {
		this.oEmpresa5 = oEmpresa5;
	}



	public Oferente getoOferente3() {
		return oOferente3;
	}



	public void setoOferente3(Oferente oOferente3) {
		this.oOferente3 = oOferente3;
	}



	public String getsNombre() {
		return sNombre;
	}



	public void setsNombre(String sNombre) {
		this.sNombre = sNombre;
	}



	public String getsEstado() {
		return sEstado;
	}



	public void setsEstado(String sEstado) {
		this.sEstado = sEstado;
	}



	public String getsDepartamento() {
		return sDepartamento;
	}



	public void setsDepartamento(String sDepartamento) {
		this.sDepartamento = sDepartamento;
	}



	public Date getdFechaCreacion() {
		return dFechaCreacion;
	}



	public void setdFechaCreacion(Date dFechaCreacion) {
		this.dFechaCreacion = dFechaCreacion;
	}



	public Set<GranOcdeGrupo> getoGrupoInvestigacion() {
		return oGrupoInvestigacion;
	}



	public void setoGrupoInvestigacion(Set<GranOcdeGrupo> oGrupoInvestigacion) {
		this.oGrupoInvestigacion = oGrupoInvestigacion;
	}
	
	public void addoGrupoInvestigacion(GranOcdeGrupo oGrupoInvestigacion) {
		this.oGrupoInvestigacion.add(oGrupoInvestigacion);
	}



	public Set<Proyecto> getoGrupoInvestigacion2() {
		return oGrupoInvestigacion2;
	}



	public void setoGrupoInvestigacion2(Set<Proyecto> oGrupoInvestigacion2) {
		this.oGrupoInvestigacion2 = oGrupoInvestigacion2;
	}
	
	public void addoGrupoInvestigacion2(Proyecto oGrupoInvestigacion2) {
		this.oGrupoInvestigacion2.add(oGrupoInvestigacion2);
	}

}
