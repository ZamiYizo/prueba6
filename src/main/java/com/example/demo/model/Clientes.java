package com.example.demo.model;

public class Clientes {
	private String idCliente;
	private String Nombre;
	private String Apellidos;
	private String Telefono;
	private String Email;
	private String Direccion;
	
	public Clientes() {}
	
	public Clientes(String idCliente, String Nombre,String Apellidos,String Telefono, String Email, String Direccion) {
		
		this.idCliente = idCliente;
		this.Nombre = Nombre;
		this.Apellidos = Apellidos;
		this.Telefono = Telefono;
		this.Email = Email;
		this.Direccion = Direccion;
		
	}

	public String getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellidos() {
		return Apellidos;
	}

	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}

	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(String telefono) {
		Telefono = telefono;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	
}
