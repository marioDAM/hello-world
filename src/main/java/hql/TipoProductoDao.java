package hql;

import org.hibernate.Session;

import entity.TipoProducto;

public interface TipoProductoDao {
	public int saveTipoProducto(Session session, TipoProducto tipoProducto);
}
