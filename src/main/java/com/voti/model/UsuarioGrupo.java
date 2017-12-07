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
@Table(name="Usuario_Grupo")
public class UsuarioGrupo implements Serializable{
	// Atributos
	@Id
	@Column(name="id_usuario_grupo")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int iIdUsuarioGrupo;
	


//	private Usuario oUsuario;
	
//	private GrupoInvestigacion oGrupo;

	@ManyToOne
    @JoinColumn(name="id_usuario") 
    private Usuario oUsuario2;
	@ManyToOne
    @JoinColumn(name="id_grupo") 
    private GrupoInvestigacion oGrupo;
	
	@Column(name="estado")
	private String sEstado;
	
	@Column(name="fecha_vinculacion")
	private Date dFechaVinculacion;
	
	
	
	// Constructor
	public UsuarioGrupo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UsuarioGrupo(int iIdUsuarioGrupo, Usuario oUsuario2, GrupoInvestigacion oGrupo, String sEstado,
			Date dFechaVinculacion) {
		super();
		this.iIdUsuarioGrupo = iIdUsuarioGrupo;
		this.oUsuario2 = oUsuario2;
		this.oGrupo = oGrupo;
		this.sEstado = sEstado;
		this.dFechaVinculacion = dFechaVinculacion;
	}
	// Metodos
	public int getiIdUsuarioGrupo() {
		return iIdUsuarioGrupo;
	}

	public void setiIdUsuarioGrupo(int iIdUsuarioGrupo) {
		this.iIdUsuarioGrupo = iIdUsuarioGrupo;
	}

	public Usuario getoUsuario2() {
		return oUsuario2;
	}

	public void setoUsuario2(Usuario oUsuario2) {
		this.oUsuario2 = oUsuario2;
	}

	public GrupoInvestigacion getoGrupo() {
		return oGrupo;
	}

	public void setoGrupo(GrupoInvestigacion oGrupo) {
		this.oGrupo = oGrupo;
	}

	public String getsEstado() {
		return sEstado;
	}

	public void setsEstado(String sEstado) {
		this.sEstado = sEstado;
	}

	public Date getdFechaVinculacion() {
		return dFechaVinculacion;
	}

	public void setdFechaVinculacion(Date dFechaVinculacion) {
		this.dFechaVinculacion = dFechaVinculacion;
	}
	
}
