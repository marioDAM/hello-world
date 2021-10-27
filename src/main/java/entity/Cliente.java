package entity;

import java.io.Serializable;

import java.sql.Timestamp;

public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;

	public int id;
	public String emanil;
	private String pass;
	public Direccion direcciones;
	public int dni;
	public String nombre;
	public String primerApellido;
	public String segundoApellido;
	public int telefono;
	public String usuCre;
	public Timestamp fecCre;
	public String usuMod;
	private Timestamp fecMod;

	public Direccion getDirecciones() {
		return direcciones;
	}

	public void setDirecciones(Direccion direcciones) {
		this.direcciones = direcciones;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmanil() {
		return emanil;
	}

	public void setEmanil(String emanil) {
		this.emanil = emanil;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
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

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}



}
