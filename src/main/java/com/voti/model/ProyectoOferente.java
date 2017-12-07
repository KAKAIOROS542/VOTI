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
@Table(name="Proyecto_Oferente")
public class ProyectoOferente implements Serializable {
	// Atributos
	@Id
	@Column(name="id_proyecto_oferente")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int iIdProyectoOferente;
	
//	private Proyecto oProyecto;
	
//	private Oferente oOferente;



	@ManyToOne
    @JoinColumn(name="id_proyecto") 
    private Proyecto oProyecto;
	@ManyToOne
    @JoinColumn(name="id_oferente") 
    private Oferente oOferente2;
	
	@Column(name="monto_financiado")
	private double dMontoFinanciado;
	
	@Column(name="monto_tributario")
	private double dMontoTributario;
	
	@Column(name="tipo_tributario")
	private String sTipoTributario;
	
	
	public ProyectoOferente() {
		super();
		// TODO Auto-generated constructor stub
	}


	public ProyectoOferente(int iIdProyectoOferente, Proyecto oProyecto, Oferente oOferente2, double dMontoFinanciado,
			double dMontoTributario, String sTipoTributario) {
		super();
		this.iIdProyectoOferente = iIdProyectoOferente;
		this.oProyecto = oProyecto;
		this.oOferente2 = oOferente2;
		this.dMontoFinanciado = dMontoFinanciado;
		this.dMontoTributario = dMontoTributario;
		this.sTipoTributario = sTipoTributario;
	}
	

	// Metodos
	public int getiIdProyectoOferente() {
		return iIdProyectoOferente;
	}

	public void setiIdProyectoOferente(int iIdProyectoOferente) {
		this.iIdProyectoOferente = iIdProyectoOferente;
	}

	public Proyecto getoProyecto() {
		return oProyecto;
	}

	public void setoProyecto(Proyecto oProyecto) {
		this.oProyecto = oProyecto;
	}

	public Oferente getoOferente2() {
		return oOferente2;
	}

	public void setoOferente2(Oferente oOferente2) {
		this.oOferente2 = oOferente2;
	}

	public double getdMontoFinanciado() {
		return dMontoFinanciado;
	}

	public void setdMontoFinanciado(double dMontoFinanciado) {
		this.dMontoFinanciado = dMontoFinanciado;
	}

	public double getdMontoTributario() {
		return dMontoTributario;
	}

	public void setdMontoTributario(double dMontoTributario) {
		this.dMontoTributario = dMontoTributario;
	}

	public String getsTipoTributario() {
		return sTipoTributario;
	}

	public void setsTipoTributario(String sTipoTributario) {
		this.sTipoTributario = sTipoTributario;
	}

}
