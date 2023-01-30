package rw.ac.rca.smis.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.rca.smis.util.SmisSessionFactory;

public class DAO {
	​
	protected DAO() {
	}​

	/**
	 * 
	 * @return session
	 */
	public static Session getSession() {
		return SmisSessionFactory.getSession();
	}​

	/**
	 * begins transaction
	 */
	protected void begin() {
		getSession().beginTransaction();
	}​

	/**
	 * saves changes to the database
	 */
	protected void commit() {
		getSession().getTransaction().commit();
	}​

	/**
	 * rolls back for failed transaction closes databases connection
	 * 
	 * @throws HibernateException
	 * 
	 */
	protected void rollback() {
		try {
			getSession().getTransaction().rollback();
		} catch (HibernateException e) {
			System.out.println("Cannot rollback: " + e.toString());
		} finally {
			close();
		}
	}

	protected void close() {
		try {
			getSession().close();
		} catch (HibernateException e) {
			System.out.println("Cannot close: " + e.toString());
		}
	}

	public void clear() {
		getSession().clear();
	}​

}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
