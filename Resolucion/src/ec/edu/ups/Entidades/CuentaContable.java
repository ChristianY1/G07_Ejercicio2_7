package ec.edu.ups.Entidades;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: CuentaContable
 *
 */
@Entity

public class CuentaContable implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nombre;
	private String fecha;
	private String descripcion;
	private double debe;
	private double haber;
	private double saldo;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "cuenta_contable")
	private Set<Caja> cajas = new HashSet<Caja>();
	
	
	
	
	
	
	

	public CuentaContable() {
		
		super();
	}
	
	
	
	
	public CuentaContable(String nombre, String fecha, String descripcion, double debe, double haber, double saldo) {
		super();
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


	public String getFecha() {
		return fecha;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public double getDebe() {
		return debe;
	}


	public void setDebe(double debe) {
		this.debe = debe;
	}


	public double getHaber() {
		return haber;
	}


	public void setHaber(double haber) {
		this.haber = haber;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CuentaContable other = (CuentaContable) obj;
		if (id != other.id)
			return false;
		return true;
	}




	@Override
	public String toString() {
		return "CuentaContable [nombre=" + nombre + ", fecha=" + fecha + ", descripcion=" + descripcion + ", debe="
				+ debe + ", haber=" + haber + ", saldo=" + saldo + "]";
	}

	

	
	
   
}
