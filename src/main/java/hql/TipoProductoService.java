package hql;

import java.sql.Timestamp;
import java.util.Scanner;

import org.hibernate.Session;

import entity.TipoProducto;

public class TipoProductoService {

	DaoUtil daoUtil = new DaoUtil();

	public void asistenteInserccionTipoProducto() {
		Session session = null;
		try {
			session = daoUtil.getSession();
			System.out.println("Bienvenido al asistente para insertar un nuevo tipo de producto");
			asistenteInserccionTipoProducto(session);

			daoUtil.commit(session);

		} catch (Exception e) {
			daoUtil.rollback(session);
			e.printStackTrace();
		} finally {
			daoUtil.closeSession(session);
		}

	}

	private void asistenteInserccionTipoProducto(Session session) {
		try (Scanner sc = new Scanner(System.in)) {

			System.out.println("Inserte un nombre para el tipo de producto:");
			String name = sc.nextLine();
			TipoProducto tipoProducto = new TipoProducto();
			tipoProducto.setNombre(name);
			// tipoProducto.setUsuCre(Usuarios.USU_APP.getName());
			tipoProducto.setFec_cre(new Timestamp(System.currentTimeMillis()));
			TipoProductoDao tipoProductoDAO = new TipoProductoDaoImpl();
			// tipoProductoDAO.saveOrUpdateTipoProducto(session, tipoProducto);
			tipoProductoDAO.saveTipoProducto(session, tipoProducto);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
