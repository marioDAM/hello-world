package entity;

import java.io.Serializable;
import java.sql.Timestamp;

public class Direccion implements Serializable {

	private static final long serialVersionUID = 1L;
	public int id;
	public String calle;
	public String ciudad;
	public String cp;
	public Cliente clientes;
	public String pais;
	public String usuCre;
	public Timestamp fecCre;
	public String usuMod;
	public Timestamp fecMod;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return clientes;
	}

	public void setCliente(Cliente cliente) {
		this.clientes = cliente;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getCp() {
		return cp;
	}

	public void setCp(String cp) {
		this.cp = cp;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getUsuCre() {
		return usuCre;
	}

	public void setUsuCre(String usuCre) {
		this.usuCre = usuCre;
	}

	public Timestamp getFecCre() {
		return fecCre;
	}

	public void setFecCre(Timestamp fecCre) {
		this.fecCre = fecCre;
	}

	public String getUsuMod() {
		return usuMod;
	}

	public void setUsuMod(String usuMod) {
		this.usuMod = usuMod;
	}

	public Timestamp getFecMod() {
		return fecMod;
	}

	public void setFecMod(Timestamp fecMod) {
		this.fecMod = fecMod;
	}

}
