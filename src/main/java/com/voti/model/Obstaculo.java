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
@Table(name="Obstaculo")
public class Obstaculo implements Serializable{
	//Atributos
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int iId;
	
	@Column(name="descripcion")
	private String sDescripcion;


	@OneToMany(mappedBy = "oObstaculo", fetch = FetchType.EAGER)
	private Set<EmpresaObstaculo> oObstaculo = new HashSet<EmpresaObstaculo>();
	
	// Constructor
	public Obstaculo(int iId, String sDescripcion) {
		super();
		this.iId = iId;
		this.sDescripcion = sDescripcion;
	}

	public Obstaculo() {
		super();
		// TODO Auto-generated constructor stub
	}



	
	// Metodos

	public int getiId() {
		return iId;
	}

	public void setiId(int iId) {
		this.iId = iId;
	}

	public String getsDescripcion() {
		return sDescripcion;
	}

	public void setsDescripcion(String sDescripcion) {
		this.sDescripcion = sDescripcion;
	}


 
	public Set<EmpresaObstaculo> getoObstaculo() {
		return oObstaculo;
	}

	public void setoObstaculo(Set<EmpresaObstaculo> oObstaculo) {
		this.oObstaculo = oObstaculo;
	}

	public void addoObstaculo(EmpresaObstaculo oObstaculo) {
		this.oObstaculo.add(oObstaculo);
	}

}
