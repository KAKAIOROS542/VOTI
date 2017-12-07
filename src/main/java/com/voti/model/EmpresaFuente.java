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
@Table(name="Empresa_Fuente")
public class EmpresaFuente implements Serializable {
	// Atributos
	@Id
	@Column(name="id_empresa_fuente")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int iIdEmpresaFuente;
	
//	private Empresa oEmpresa;
	
//	private FuenteInformacion oFuente;



	@ManyToOne
    @JoinColumn(name="id_empresa") 
    private Empresa oEmpresa;
	@ManyToOne
    @JoinColumn(name="id_fuente") 
    private FuenteInformacion oFuente;
	
	// Constructor
	public EmpresaFuente() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public EmpresaFuente(int iIdEmpresaFuente, Empresa oEmpresa, FuenteInformacion oFuente) {
		super();
		this.iIdEmpresaFuente = iIdEmpresaFuente;
		this.oEmpresa = oEmpresa;
		this.oFuente = oFuente;
	}
	
	// Metodos
	public int getiIdEmpresaFuente() {
		return iIdEmpresaFuente;
	}

	public void setiIdEmpresaFuente(int iIdEmpresaFuente) {
		this.iIdEmpresaFuente = iIdEmpresaFuente;
	}

	public Empresa getoEmpresa() {
		return oEmpresa;
	}

	public void setoEmpresa(Empresa oEmpresa) {
		this.oEmpresa = oEmpresa;
	}

	public FuenteInformacion getoFuente() {
		return oFuente;
	}

	public void setoFuente(FuenteInformacion oFuente) {
		this.oFuente = oFuente;
	}
	
}
