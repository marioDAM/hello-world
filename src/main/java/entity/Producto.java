package entity;

import java.io.Serializable;
import java.sql.Timestamp;

public class Producto implements Serializable {
	private static final long serialVersionUID = 1L;

	private int id;
	private int precio;
	private int descuento;
	private String codigoBarras;
	private String nombre;
	private String tipo;
	private String talla;
	private String color;
	private String estado;
	private String usuCre;
	private String usuMod;
	private Timestamp fecMod;
	private Timestamp fecCre;
	private Coleccion coleccion;
	private TipoProducto tipoProducto;

	public String getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	public TipoProducto getTipoProducto() {
		return tipoProducto;
	}

	public void setTipoProducto(TipoProducto tipoProducto) {
		this.tipoProducto = tipoProducto;
	}

	public Coleccion getColeccion() {
		return coleccion;
	}

	public void setColeccion(Coleccion coleccion) {
		this.coleccion = coleccion;
	}

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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getDescuento() {
		return descuento;
	}

	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getUsu_Cre() {
		return usuCre;
	}

	public void setUsu_Cre(String usu_Cre) {
		this.usuCre = usu_Cre;
	}

	public String getUsu_Mod() {
		return usuMod;
	}

	public void setUsu_Mod(String usu_Mod) {
		this.usuMod = usu_Mod;
	}

	public Timestamp getFec_Mod() {
		return fecMod;
	}

	public void setFec_Mod(Timestamp fec_Mod) {
		this.fecMod = fec_Mod;
	}

	public Timestamp getFec_Cre() {
		return fecCre;
	}

	public void setFec_Cre(Timestamp fec_Cre) {
		this.fecCre = fec_Cre;
	}

}
