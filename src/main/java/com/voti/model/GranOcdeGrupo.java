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
@Table(name="GranOcde_Grupo")
public class GranOcdeGrupo implements Serializable{
	// Atributos
	@Id
	@Column(name="id_granocde_grupos")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int iIdGranOcdeGrupo;
	
//	private GranOcde oGranOcde;
	


	//	private GrupoInvestigacion oGrupoInvestigacion;
	@ManyToOne
    @JoinColumn(name="id_granocde") 
    private GranOcde oGranOcde2;
	@ManyToOne
    @JoinColumn(name="id_grupo_investigacion") 
    private GrupoInvestigacion oGrupoInvestigacion;
	

	// Atributos
	public GranOcdeGrupo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public GranOcdeGrupo(int iIdGranOcdeGrupo, GranOcde oGranOcde2, GrupoInvestigacion oGrupoInvestigacion) {
		super();
		this.iIdGranOcdeGrupo = iIdGranOcdeGrupo;
		this.oGranOcde2 = oGranOcde2;
		this.oGrupoInvestigacion = oGrupoInvestigacion;
	}

	// Metodos
	public int getiIdGranOcdeGrupo() {
		return iIdGranOcdeGrupo;
	}

	public void setiIdGranOcdeGrupo(int iIdGranOcdeGrupo) {
		this.iIdGranOcdeGrupo = iIdGranOcdeGrupo;
	}

	public GranOcde getoGranOcde2() {
		return oGranOcde2;
	}

	public void setoGranOcde2(GranOcde oGranOcde2) {
		this.oGranOcde2 = oGranOcde2;
	}

	public GrupoInvestigacion getoGrupoInvestigacion() {
		return oGrupoInvestigacion;
	}

	public void setoGrupoInvestigacion(GrupoInvestigacion oGrupoInvestigacion) {
		this.oGrupoInvestigacion = oGrupoInvestigacion;
	}
	
}
