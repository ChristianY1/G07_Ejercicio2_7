package ec.edu.ups.Modelo;

import java.util.List;

public class Caja extends CuentaContable{
	private List<ComprobanteDeVenta> listcv;
	private List<Sueldo> listSueldo;
	private double saldo;
	
	
	

	public Caja(List<ComprobanteDeVenta> listcv, List<Sueldo> listSueldo, double saldo) {
		super();
		this.listcv = listcv;
		this.listSueldo = listSueldo;
		this.saldo = saldo;
	}
	
	
	
	
	
}
