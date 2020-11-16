package com.example.demo.model;

public class Proveedores {
	private String idProveedor;
	private String NombreCompania;
	private String NombreContacto;
	private String Email;
	private String RFC;
	private String Telefono;
	private String Direccion;
	
	public Proveedores() {}
	
	public Proveedores(String idProveedor, String NombreCompania,String NombreContacto, String Email,String Telefono,String RFC, String Direccion) {
		
		this.idProveedor = idProveedor;
		this.NombreCompania = NombreCompania;
		this.NombreContacto = NombreContacto;
		this.Email = Email;
		this.RFC = RFC;
		this.Telefono = Telefono;
		this.Direccion = Direccion;
		
	}

	public String getIdProveedor() {
		return idProveedor;
	}

	public void setIdProveedor(String idProveedor) {
		this.idProveedor = idProveedor;
	}

	public String getNombreCompania() {
		return NombreCompania;
	}

	public void setNombreCompania(String nombreCompania) {
		NombreCompania = nombreCompania;
	}

	public String getNombreContacto() {
		return NombreContacto;
	}

	public void setNombreContacto(String nombreContacto) {
		NombreContacto = nombreContacto;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getRFC() {
		return RFC;
	}

	public void setRFC(String rFC) {
		RFC = rFC;
	}

	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(String telefono) {
		Telefono = telefono;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	
}
