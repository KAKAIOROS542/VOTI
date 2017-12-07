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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity 
@Table(name="Ocde")
public class Ocde implements Serializable {
	// Atributos
	@Id
	@Column(name="id")
	private int iId;
	
	@ManyToOne	
	@JoinColumn(name="id_granocde") 
    private GranOcde oGranOcde;
    
	
	@Column(name="nombre")
	private String sNombre;
	
	@OneToMany(mappedBy = "oOcde2", fetch = FetchType.EAGER)
	private Set<UsuarioOcde> oOcde2 = new HashSet<UsuarioOcde>();
	
	@OneToMany(mappedBy = "oOcde", fetch = FetchType.EAGER)
	private Set<OferenteOcde> oOcde = new HashSet<OferenteOcde>();

	@OneToMany(mappedBy = "oOcde3", fetch = FetchType.EAGER)
	private Set<InstitucionOcde> oOcde3 = new HashSet<InstitucionOcde>();
	
	
	// Constructor
	public Ocde() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Ocde(int iId, GranOcde oGranOcde, String sNombre) {
		super();
		this.iId = iId;
		this.oGranOcde = oGranOcde;
		this.sNombre = sNombre;
		
			}
	
	// Metodos
	public int getiId() {
		return iId;
	}

	public void setiId(int iId) {
		this.iId = iId;
	}
	
	public GranOcde getoGranOcde() {
		return oGranOcde;
	}

	public void setoGranOcde(GranOcde oGranOcde) {
		this.oGranOcde = oGranOcde;
	}


	public String getsNombre() {
		return sNombre;
	}

	public void setsNombre(String sNombre) {
		this.sNombre = sNombre;
	}

	public Set<UsuarioOcde> getoOcde2() {
		return oOcde2;
	}

	public void setoOcde2(Set<UsuarioOcde> oOcde2) {
		this.oOcde2 = oOcde2;
	}

	
	public void addoOcde2(UsuarioOcde oOcde2) {
		this.oOcde2.add(oOcde2);
	}
	
	
	public Set<OferenteOcde> getoOcde() {
		return oOcde;
	}

	public void setoOcde(Set<OferenteOcde> oOcde) {
		this.oOcde = oOcde;
	}

	public void addooOcde(OferenteOcde oOcde) {
		this.oOcde.add(oOcde);
	}

	public Set<InstitucionOcde> getoOcde3() {
		return oOcde3;
	}

	public void setoOcde3(Set<InstitucionOcde> oOcde3) {
		this.oOcde3 = oOcde3;
	}
	public void addoOcde3(InstitucionOcde oOcde3) {
		this.oOcde3.add(oOcde3);
	}

	
	
}
