package ec.edu.ups.Modelo;

import java.sql.Date;

public class CuentaContable {
	private int id;
	private String nombre;
	private Date fecha;
	private String descripcion;
	private String debe;
	private String haber;
	private double saldo;
	
	
	
	public CuentaContable() {
		super();
	}
	
	/*
	public CuentaContable(int id, String nombre, Date fecha, String descripcion, String debe, String haber,
			double saldo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.fecha = fecha;
		this.descripcion = descripcion;
		this.debe = debe;
		this.haber = haber;
		this.saldo = saldo;
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
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getDebe() {
		return debe;
	}
	public void setDebe(String debe) {
		this.debe = debe;
	}
	public String getHaber() {
		return haber;
	}
	public void setHaber(String haber) {
		this.haber = haber;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	*/
	
	
}
