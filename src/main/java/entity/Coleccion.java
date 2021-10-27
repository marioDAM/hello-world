package entity;

import java.io.Serializable;
import java.sql.Timestamp;

public class Coleccion implements Serializable {
	private static final long serialVersionUID = 1L;
	int id;
	String nombre;
	String usuCre;
	String usuMod;
	Timestamp fecMod;
	Timestamp fecCre;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUsu_cre() {
		return usuCre;
	}

	public void setUsu_cre(String usu_cre) {
		this.usuCre = usu_cre;
	}

	public String getUsu_mod() {
		return usuMod;
	}

	public void setUsu_mod(String usu_mod) {
		this.usuMod = usu_mod;
	}

	public Timestamp getFec_mod() {
		return fecMod;
	}

	public void setFec_mod(Timestamp fec_mod) {
		this.fecMod = fec_mod;
	}

	public Timestamp getFec_cre() {
		return fecCre;
	}

	public void setFec_cre(Timestamp fec_cre) {
		this.fecCre = fec_cre;
	}

}
