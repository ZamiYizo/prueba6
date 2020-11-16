package com.example.demo.model;

public class Venta {
	private String idVenta;
	private String idUsuario;
	private String fecha;
	private String subtotal;
	private String iva;
	private String costoE;
	private String total;
	
	public Venta() {}
	
	public Venta(String idVenta,String idUsuario, String fecha,String subtotal,String iva,String costoE,String total) {
		this.idVenta = idVenta;
		this.idUsuario = idUsuario;
		this.fecha = fecha;
		this.subtotal = subtotal;
		this.iva = iva;
		this.costoE = costoE;
		this.total = total;
	}

	public String getIdVenta() {
		return idVenta;
	}

	public void setIdVenta(String idVenta) {
		this.idVenta = idVenta;
	}

	public String getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(String subtotal) {
		this.subtotal = subtotal;
	}

	public String getIva() {
		return iva;
	}

	public void setIva(String iva) {
		this.iva = iva;
	}

	public String getCostoE() {
		return costoE;
	}

	public void setCostoE(String costoE) {
		this.costoE = costoE;
	}

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}
	
}
