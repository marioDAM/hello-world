package hql;

import org.hibernate.Session;

import entity.TipoProducto;

public class TipoProductoDaoImpl implements TipoProductoDao {

	public int saveTipoProducto(Session session, TipoProducto tipoProducto) {
		DaoUtil du = new DaoUtil();
		// Obtiene una session e inicializa la transaccion
		session = du.getSession();
		int id = (int) session.save(tipoProducto);

		session.getTransaction().commit();

		return id;
	}

}
