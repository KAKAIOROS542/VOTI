package com.voti.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity 
@Table(name="Usuario_Ocde")
public class UsuarioOcde implements Serializable{
	// Atributos
	@Id
	@Column(name="id_usuario_ocde")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int iIdUsuarioOcde;
	@Column(name="anio_inicio")
	private Date dAnioInicio;	
	@Column(name="anio_fin")
	private Date dAnioFin;	
//	private Empresa oEmpresa;
//	private Usuario oUsuario;
	
//	private Ocde oOcde;	
	@Column(name="estado")
	private int iEstado;
	
	@ManyToOne
    @JoinColumn(name="id_usuario") 
    private Usuario sGenero;
	@ManyToOne
    @JoinColumn(name="id_ocde") 
    private Ocde oOcde2;
	
	
	
	// Constructor
	public UsuarioOcde() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	
	public UsuarioOcde(int iIdUsuarioOcde, Date dAnioInicio, Date dAnioFin, int iEstado, Usuario sGenero, Ocde oOcde2) {
		super();
		this.iIdUsuarioOcde = iIdUsuarioOcde;
		this.dAnioInicio = dAnioInicio;
		this.dAnioFin = dAnioFin;
		this.iEstado = iEstado;
		this.sGenero = sGenero;
		this.oOcde2 = oOcde2;
	}




	// Metodos

	public int getiIdUsuarioOcde() {
		return iIdUsuarioOcde;
	}



	public void setiIdUsuarioOcde(int iIdUsuarioOcde) {
		this.iIdUsuarioOcde = iIdUsuarioOcde;
	}



	public Date getdAnioInicio() {
		return dAnioInicio;
	}



	public void setdAnioInicio(Date dAnioInicio) {
		this.dAnioInicio = dAnioInicio;
	}



	public Date getdAnioFin() {
		return dAnioFin;
	}



	public void setdAnioFin(Date dAnioFin) {
		this.dAnioFin = dAnioFin;
	}



	public int getiEstado() {
		return iEstado;
	}



	public void setiEstado(int iEstado) {
		this.iEstado = iEstado;
	}



	public Usuario getsGenero() {
		return sGenero;
	}



	public void setsGenero(Usuario sGenero) {
		this.sGenero = sGenero;
	}



	public Ocde getoOcde2() {
		return oOcde2;
	}



	public void setoOcde2(Ocde oOcde2) {
		this.oOcde2 = oOcde2;
	}

	
}
