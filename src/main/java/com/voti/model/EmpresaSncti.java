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
@Table(name="Empresa_SNCTI")
public class EmpresaSncti implements Serializable{
	// Atributos
	@Id
	@Column(name="id_empresa_sncti")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int iIdEmpresaSncti;
	
//	private Empresa oEmpresa;
	
//	private SNCTI oSNCTI;


	@ManyToOne
    @JoinColumn(name="id_empresa") 
    private Empresa oEmpresa3;
	@ManyToOne
    @JoinColumn(name="id_sncti") 
    private SNCTI oSNCTI;
	
	@Column(name="actividad")
	private String sActividad;
	
	@Column(name="objetivo_cooperacion")
	private String sObjetivoCooperacion;
	
	
	
	// Constructor
	public EmpresaSncti() {
		super();
		// TODO Auto-generated constructor stub
	}



	public EmpresaSncti(int iIdEmpresaSncti, Empresa oEmpresa3, SNCTI oSNCTI, String sActividad,
			String sObjetivoCooperacion) {
		super();
		this.iIdEmpresaSncti = iIdEmpresaSncti;
		this.oEmpresa3 = oEmpresa3;
		this.oSNCTI = oSNCTI;
		this.sActividad = sActividad;
		this.sObjetivoCooperacion = sObjetivoCooperacion;
	}



	public int getiIdEmpresaSncti() {
		return iIdEmpresaSncti;
	}



	public void setiIdEmpresaSncti(int iIdEmpresaSncti) {
		this.iIdEmpresaSncti = iIdEmpresaSncti;
	}



	public Empresa getoEmpresa3() {
		return oEmpresa3;
	}



	public void setoEmpresa3(Empresa oEmpresa3) {
		this.oEmpresa3 = oEmpresa3;
	}



	public SNCTI getoSNCTI() {
		return oSNCTI;
	}



	public void setoSNCTI(SNCTI oSNCTI) {
		this.oSNCTI = oSNCTI;
	}



	public String getsActividad() {
		return sActividad;
	}



	public void setsActividad(String sActividad) {
		this.sActividad = sActividad;
	}



	public String getsObjetivoCooperacion() {
		return sObjetivoCooperacion;
	}



	public void setsObjetivoCooperacion(String sObjetivoCooperacion) {
		this.sObjetivoCooperacion = sObjetivoCooperacion;
	}
	
}
