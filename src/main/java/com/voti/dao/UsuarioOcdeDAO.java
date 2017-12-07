package com.voti.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import com.voti.HibernateUtils;
import com.voti.model.UsuarioOcde;

/**
 * implementation of UsuarioOcdeDAO
 * 

 *
 */
public class UsuarioOcdeDAO extends GenericDAO<UsuarioOcde> {


	/**
	 * Selects all UsuarioOcdes of given name HQL style
	 * 
	 * @return List of UsuarioOcdes
	 */
	public ArrayList<UsuarioOcde> selectName() {
		session = HibernateUtils.getSession();

		Query query = session.createQuery("SELECT DISTINCT (pt.sNombre)\n" +
				"FROM Ocde pt INNER JOIN pt.oOcde2 p\n" +
				"WHERE p  IN  (SELECT p FROM  UsuarioOcde p WHERE p.iIdUsuarioOcde=1)");



		ArrayList<UsuarioOcde> UsuarioOcdes = (ArrayList<UsuarioOcde>) query.list();

		session.close();
		
		return UsuarioOcdes;
	}

	

}
