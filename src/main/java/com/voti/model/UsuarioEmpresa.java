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
@Table(name="Usuario_Empresa")
public class UsuarioEmpresa implements Serializable{
	// Atributos
	@Id
	@Column(name="id_usuario_empresa")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int iIdUsuarioEmpresa;
	
//	private Usuario oUsuario;
	
//	private Empresa oEmpresa;



	@ManyToOne
    @JoinColumn(name="id_usuario") 
    private Usuario oUsuario;
	@ManyToOne
    @JoinColumn(name="id_empresa") 
    private Empresa oEmpresa4;
	
	@Column(name="es_consultor")
	private boolean bConsultor;
	
	@Column(name="presta_servicios")
	private String sPrestaServicios;
	
	@Column(name="cargo")
	private String sCargo;
	
	
	

	
	
	// Constructor
	public UsuarioEmpresa() {
		super();
		// TODO Auto-generated constructor stub
	}






	public UsuarioEmpresa(int iIdUsuarioEmpresa, Usuario oUsuario, Empresa oEmpresa4, boolean bConsultor,
			String sPrestaServicios, String sCargo) {
		super();
		this.iIdUsuarioEmpresa = iIdUsuarioEmpresa;
		this.oUsuario = oUsuario;
		this.oEmpresa4 = oEmpresa4;
		this.bConsultor = bConsultor;
		this.sPrestaServicios = sPrestaServicios;
		this.sCargo = sCargo;
	}






	public int getiIdUsuarioEmpresa() {
		return iIdUsuarioEmpresa;
	}






	public void setiIdUsuarioEmpresa(int iIdUsuarioEmpresa) {
		this.iIdUsuarioEmpresa = iIdUsuarioEmpresa;
	}






	public Usuario getoUsuario() {
		return oUsuario;
	}






	public void setoUsuario(Usuario oUsuario) {
		this.oUsuario = oUsuario;
	}






	public Empresa getoEmpresa4() {
		return oEmpresa4;
	}






	public void setoEmpresa4(Empresa oEmpresa4) {
		this.oEmpresa4 = oEmpresa4;
	}






	public boolean isbConsultor() {
		return bConsultor;
	}






	public void setbConsultor(boolean bConsultor) {
		this.bConsultor = bConsultor;
	}






	public String getsPrestaServicios() {
		return sPrestaServicios;
	}






	public void setsPrestaServicios(String sPrestaServicios) {
		this.sPrestaServicios = sPrestaServicios;
	}






	public String getsCargo() {
		return sCargo;
	}






	public void setsCargo(String sCargo) {
		this.sCargo = sCargo;
	}
	

	
}
