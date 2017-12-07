package com.voti.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import com.voti.HibernateUtils;

/**
 * Generic DAO to share logic between all the specific DAOs.
 * 

 *
 */
public class GenericDAO<T> {
	protected Session session;

	/**
	 * Gets the current session
	 * @return
	 */
	public Session getSession() {
		return session;
	}

	/**
	 * Starts the transactional behaviour applied to some certain operations (insert, update, delete...)
	 */
	protected void startTransaction() {
		session = HibernateUtils.getSession();
		session.getTransaction().begin();
	}

	/**
	 *  Closes the transactional behaviour applied to some certain operations
	 */
	protected void endTransaction() {
		session.getTransaction().commit();
		session.close();
	}

	/**
	 * Handles any exception thrown during a transaction ensuring a performance of rollback action
	 * in case of unsuccessful performance.
	 * @param he
	 * @throws HibernateException
	 */
	protected void handleException(HibernateException he)
			throws HibernateException {
		session.getTransaction().rollback();
		throw he;
	}

	/**
	 * Insert the specific entity.
	 * @param entity
	 * @throws HibernateException
	 */
	public void insert(T entity) throws HibernateException {
		try {
			startTransaction();
			session.persist(entity);
			session.flush();
		} catch (HibernateException he) {
			handleException(he);
		} finally {
			endTransaction();
		}
	}

	
	
	/**
	 * Save or update the specific entity.
	 * @param entity
	 * @throws HibernateException
	 */
	public void update(T entity) throws HibernateException {
		try {
			startTransaction();
			session.merge(entity);
			session.flush();
		} catch (HibernateException he) {
			handleException(he);
		} finally {
			endTransaction();
		}
	}
	
	/**
	 * Find by ID the specific entity
	 * @param id
	 * @param entityClass
	 * @return the template of the entity
	 * @throws HibernateException
	 */
	public T selectById(Serializable id, Class<T> entityClass)
			throws HibernateException {
		T obj = null;
		try {
			session = HibernateUtils.getSession();
			obj = (T) session.get(entityClass, id);
		} catch (HibernateException he) {
			handleException(he);
		} finally {
			session.close();
		}
		return obj;
	}

	/**
	 * Select all the entities of this concrete class
	 * @param entityClass
	 * @return the list of templates
	 * @throws HibernateException
	 */
	public List<T> selectAll(Class<T> entityClass) throws HibernateException {
		List<T> result = null;
		try {
			session = HibernateUtils.getSession();
			result = session.createQuery("FROM " + entityClass.getSimpleName())
					.list();
		} catch (HibernateException he) {
			handleException(he);
		} finally {
			session.close();
		}
		return result;
	}
	
	/**
	 * Delete the specific entity
	 * @param entity
	 * @throws HibernateException
	 */
	public void delete(T entity) throws HibernateException {
		try {
			startTransaction();
			getSession().delete(entity);
			getSession().flush();
		} catch (HibernateException he) {
			handleException(he);
		} finally {
			endTransaction();
		}
	}
}
		
