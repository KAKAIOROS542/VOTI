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
@Table(name="Oferente_Ocde")
public class OferenteOcde implements Serializable{
	// Atributos
	@Id
	@Column(name="id_oferente_ocde")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int iIdOferenteOcde;
	
//	private Oferente oOferente;
	
//	private Ocde oOcde;



	@ManyToOne
    @JoinColumn(name="id_oferente") 
    private Oferente oOferente;
	@ManyToOne
    @JoinColumn(name="id_ocde") 
    private Ocde  oOcde;
	
	@Column(name="lugar_estudios")
	private String sLugarEstudios;


	
	// Constructor
	public OferenteOcde() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public OferenteOcde(int iIdOferenteOcde, Oferente oOferente, Ocde oOcde, String sLugarEstudios) {
		super();
		this.iIdOferenteOcde = iIdOferenteOcde;
		this.oOferente = oOferente;
		this.oOcde = oOcde;
		this.sLugarEstudios = sLugarEstudios;
	}
	
	// Metodos
	public int getiIdOferenteOcde() {
		return iIdOferenteOcde;
	}

	public void setiIdOferenteOcde(int iIdOferenteOcde) {
		this.iIdOferenteOcde = iIdOferenteOcde;
	}

	public Oferente getoOferente() {
		return oOferente;
	}

	public void setoOferente(Oferente oOferente) {
		this.oOferente = oOferente;
	}

	public Ocde getoOcde() {
		return oOcde;
	}

	public void setoOcde2(Ocde oOcde) {
		this.oOcde = oOcde;
	}

	public String getsLugarEstudios() {
		return sLugarEstudios;
	}

	public void setsLugarEstudios(String sLugarEstudios) {
		this.sLugarEstudios = sLugarEstudios;
	}

}
