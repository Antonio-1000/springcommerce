package com.demo.ecommerce.model;

public class Usuario {

	private Integer id;
	private String nombre;
	private String UserName;
	private String gmail;
	private String direccion;
	private String telefono;
	private String tipo;
	
	public Usuario() {
	}
	
	
	public Usuario(Integer id, String nombre, String userName, String gmail, String direccion, String telefono,
			String tipo) {
		super();
		this.id = id;
		this.nombre = nombre;
		UserName = userName;
		this.gmail = gmail;
		this.direccion = direccion;
		this.telefono = telefono;
		this.tipo = tipo;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getGmail() {
		return gmail;
	}
	public void setGmail(String gmail) {
		this.gmail = gmail;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", UserName=" + UserName + ", gmail=" + gmail
				+ ", direccion=" + direccion + ", telefono=" + telefono + ", tipo=" + tipo + "]";
	}




	
}
