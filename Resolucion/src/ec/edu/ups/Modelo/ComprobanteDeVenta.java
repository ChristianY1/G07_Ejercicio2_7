package ec.edu.ups.Modelo;

import java.sql.Date;

import javax.xml.crypto.Data;

public class ComprobanteDeVenta {
	private String tipo;
	private String fecha;
	private int numero;
	
	
	
	
	public ComprobanteDeVenta(String tipo, String fecha, int numero) {
		super();
		this.tipo = tipo;
		this.fecha = fecha;
		this.numero = numero;
	}
	
	@Override
	public String toString() {
		return "ComprobanteDeVenta [tipo=" + tipo + ", fecha=" + fecha + ", numero=" + numero + "]";
	}	
	
}
