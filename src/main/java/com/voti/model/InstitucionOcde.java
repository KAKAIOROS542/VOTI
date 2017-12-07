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
@Table(name="Institucion_Ocde")
public class InstitucionOcde implements Serializable{
	// Atributos
	@Id
	@Column(name="id_inst_ocde")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int sIdInstOcde;
	
//	private Institucion oInstitucion;
	


	//	private Ocde oOcde;
	@ManyToOne
    @JoinColumn(name="id_institucion") 
    private Institucion oInstitucion;
	@ManyToOne
    @JoinColumn(name="id_ocde") 
    private Ocde oOcde3;
	
	@Column(name="alta_calidad")
	private boolean bAltaCalidad;
	
	@Column(name="departamento")
	private String sDepartamento;
	

	
	// Constructor
	public InstitucionOcde() {
		super();
		// TODO Auto-generated constructor stub
	}
	public InstitucionOcde(int sIdInstOcde, Institucion oInstitucion, Ocde oOcde3, boolean bAltaCalidad,
			String sDepartamento) {
		super();
		this.sIdInstOcde = sIdInstOcde;
		this.oInstitucion = oInstitucion;
		this.oOcde3 = oOcde3;
		this.bAltaCalidad = bAltaCalidad;
		this.sDepartamento = sDepartamento;
	}
	// Metodos
	public int getsIdInstOcde() {
		return sIdInstOcde;
	}

	public void setsIdInstOcde(int sIdInstOcde) {
		this.sIdInstOcde = sIdInstOcde;
	}

	public Institucion getoInstitucion() {
		return oInstitucion;
	}

	public void setoInstitucion(Institucion oInstitucion) {
		this.oInstitucion = oInstitucion;
	}

	public Ocde getoOcde3() {
		return oOcde3;
	}

	public void setoOcde3(Ocde oOcde3) {
		this.oOcde3 = oOcde3;
	}

	public boolean isbAltaCalidad() {
		return bAltaCalidad;
	}

	public void setbAltaCalidad(boolean bAltaCalidad) {
		this.bAltaCalidad = bAltaCalidad;
	}

	public String getsDepartamento() {
		return sDepartamento;
	}

	public void setsDepartamento(String sDepartamento) {
		this.sDepartamento = sDepartamento;
	}
	
}
