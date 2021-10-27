package hql;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.hibernate.Session;

import util.HibernateUtil;

public class DaoUtil {

	private Session session;

	public static <T> List<T> castList(Class<? extends T> clazz, Collection<?> c) {
		List<T> r = new ArrayList<>();
		for (Object o : c) {
			r.add(clazz.cast(o));
		}
		return r;
	}

	/**
	 * Consigue una sesión e inicializa la transacción
	 * 
	 * @return
	 */
	public Session getSession() {
		if (session == null) {
			session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
		}
		return session;
	}

	/**
	 * Si la session no es nula la cierra
	 * 
	 * @param session {@link Session}
	 */
	public void closeSession(Session session) {

		if (session != null) {
			session.close();
		}
	}

	/**
	 * Si la session no es nula hace commit;
	 * 
	 * @param session {@link Session}
	 */
	public void commit(Session session) {

		if (session != null) {
			session.getTransaction().commit();
		}
	}

	/**
	 * Si la session no es nula hace rollback
	 * 
	 * @param session {@link Session}
	 */
	public void rollback(Session session) {

		if (session != null) {
			session.getTransaction().rollback();
		}
	}

}
