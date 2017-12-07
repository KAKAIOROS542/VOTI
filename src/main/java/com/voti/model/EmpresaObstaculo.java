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
@Table(name="Empresa_Obstaculo")
public class EmpresaObstaculo implements Serializable {
	// Atributos
	@Id
	@Column(name="id_empresa_obstaculo")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int iIdEmpresaObstaculo;
	
//	private Empresa oEmpresa;
	
//	private Obstaculo oObstaculo;

	@ManyToOne
    @JoinColumn(name="id_empresa") 
    private Empresa oEmpresa2;
	@ManyToOne
    @JoinColumn(name="id_obstaculo") 
    private Obstaculo oObstaculo;
	
	@Column(name="grado_importancia")
	private float fGradoImportancia;
	
	

	// Constructor
	public EmpresaObstaculo() {
		super();
		// TODO Auto-generated constructor stub
	}



	public EmpresaObstaculo(int iIdEmpresaObstaculo, Empresa oEmpresa2, Obstaculo oObstaculo, float fGradoImportancia) {
		super();
		this.iIdEmpresaObstaculo = iIdEmpresaObstaculo;
		this.oEmpresa2 = oEmpresa2;
		this.oObstaculo = oObstaculo;
		this.fGradoImportancia = fGradoImportancia;
	}



	public int getiIdEmpresaObstaculo() {
		return iIdEmpresaObstaculo;
	}



	public void setiIdEmpresaObstaculo(int iIdEmpresaObstaculo) {
		this.iIdEmpresaObstaculo = iIdEmpresaObstaculo;
	}



	public Empresa getoEmpresa2() {
		return oEmpresa2;
	}



	public void setoEmpresa2(Empresa oEmpresa2) {
		this.oEmpresa2 = oEmpresa2;
	}



	public Obstaculo getoObstaculo() {
		return oObstaculo;
	}



	public void setoObstaculo(Obstaculo oObstaculo) {
		this.oObstaculo = oObstaculo;
	}



	public float getfGradoImportancia() {
		return fGradoImportancia;
	}



	public void setfGradoImportancia(float fGradoImportancia) {
		this.fGradoImportancia = fGradoImportancia;
	}

	
	
}
