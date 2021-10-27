package hql;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import entity.Cliente;
import util.HibernateUtil;

public class Probando {
	public void listar() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			session.beginTransaction();
			String nombre = "nic";
			Query q = session.createQuery("FROM Cliente c WHERE c.nombre like :patNombre")
					.setParameter("patNombre", "%" + nombre + "%").setReadOnly(true);
			List<Cliente> listaCliente = q.list();
			for (Cliente cliente : listaCliente) {
				System.out.println(cliente);
			}
		} finally {
			if (session != null) {
				session.close();
			}
		}

	}
}
