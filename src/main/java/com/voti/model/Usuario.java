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
@Table(name="Usuario")
public class Usuario implements Serializable {
	// Atributos
	
	@Column(name="tdoc")
	private int iTdoc;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="ndoc") 
    private Usuario iNdoc;
	
	@Column(name="nombres")
    private String sNombres;
	
	@Column(name="apellidos")
    private String sApellidos;
	
	@Column(name="nombre_corto")
    private String sNombreCorto;
	
	@Column(name="fecha_nacimiento")
    private Date dFechaNacimiento;
	
	@OneToMany(mappedBy = "sGenero", fetch = FetchType.EAGER)
	private Set<UsuarioOcde> sGenero = new HashSet<UsuarioOcde>();
	
	@OneToMany(mappedBy = "oLider", fetch = FetchType.EAGER)
	private Set<GrupoInvestigacion> oLider = new HashSet<GrupoInvestigacion>();
	
	@OneToMany(mappedBy = "oEncargado", fetch = FetchType.EAGER)
	private Set<Proyecto> oEncargado = new HashSet<Proyecto>();
	
	@OneToMany(mappedBy = "oUsuario", fetch = FetchType.EAGER)
	private Set<Usuario> oUsuario = new HashSet<Usuario>();
	
	@OneToMany(mappedBy = "oUsuario2", fetch = FetchType.EAGER)
	private Set<Usuario> oUsuario2 = new HashSet<Usuario>();
	
	@Column(name="empresa_labora")
    private String sEmpresaLabora;
	
    
    //Constructor
    public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Usuario(int iTdoc, Usuario iNdoc, String sNombres, String sApellidos, String sNombreCorto, Date dFechaNacimiento,
			 String sEmpresaLabora) {
		super();
		this.iTdoc = iTdoc;
		this.iNdoc = iNdoc;
		this.sNombres = sNombres;
		this.sApellidos = sApellidos;
		this.sNombreCorto = sNombreCorto;
		this.dFechaNacimiento = dFechaNacimiento;
		this.sEmpresaLabora = sEmpresaLabora;
	}
	
	//Metodos

	public int getiTdoc() {
		return iTdoc;
	}

	public void setiTdoc(int iTdoc) {
		this.iTdoc = iTdoc;
	}

	public Usuario getiNdoc() {
		return iNdoc;
	}

	public void setiNdoc(Usuario iNdoc) {
		this.iNdoc = iNdoc;
	}

	public String getsNombres() {
		return sNombres;
	}

	public void setsNombres(String sNombres) {
		this.sNombres = sNombres;
	}

	public String getsApellidos() {
		return sApellidos;
	}

	public void setsApellidos(String sApellidos) {
		this.sApellidos = sApellidos;
	}

	public String getsNombreCorto() {
		return sNombreCorto;
	}

	public void setsNombreCorto(String sNombreCorto) {
		this.sNombreCorto = sNombreCorto;
	}

	public Date getdFechaNacimiento() {
		return dFechaNacimiento;
	}

	public void setdFechaNacimiento(Date dFechaNacimiento) {
		this.dFechaNacimiento = dFechaNacimiento;
	}

	

	public String getsEmpresaLabora() {
		return sEmpresaLabora;
	}

	public void setsEmpresaLabora(String sEmpresaLabora) {
		this.sEmpresaLabora = sEmpresaLabora;
	}


	/**
	 * @return the products
	 */
	public Set<UsuarioOcde> getsGenero() {
		return sGenero;
	}


	public void setsGenero(Set<UsuarioOcde> sGenero) {
		this.sGenero = sGenero;
	}


	 
	public void addsGenero(UsuarioOcde sGenero) {
		this.sGenero.add(sGenero);
	}

	public Set<GrupoInvestigacion> getoLider() {
		return oLider;
	}

	public void setoLider(Set<GrupoInvestigacion> oLider) {
		this.oLider = oLider;
	}
	
	public void addoLider(GrupoInvestigacion oLider) {
		this.oLider.add(oLider);
	}

	public Set<Proyecto> getoEncargado() {
		return oEncargado;
	}

	public void setoEncargado(Set<Proyecto> oEncargado) {
		this.oEncargado = oEncargado;
	}
	
	public void addoEncargado(Proyecto oEncargado) {
		this.oEncargado.add(oEncargado);
	}

	public Set<Usuario> getoUsuario() {
		return oUsuario;
	}

	public void setoUsuario(Set<Usuario> oUsuario) {
		this.oUsuario = oUsuario;
	}
	
	public void addoUsuario(Usuario oUsuario) {
		this.oUsuario.add(oUsuario);
	}

	public Set<Usuario> getoUsuario2() {
		return oUsuario2;
	}

	public void setoUsuario2(Set<Usuario> oUsuario2) {
		this.oUsuario2 = oUsuario2;
	}

	public void addoUsuario2(Usuario oUsuario2) {
		this.oUsuario2.add(oUsuario2);
	}
}
