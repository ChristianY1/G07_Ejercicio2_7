package ec.edu.ups.Entidades;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Caja
 *
 */
@Entity

public class Caja implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigoCaja;
	private String tipo;
	private String fecha;
	private int numero;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "caja")
	private Set<CuentaContable> cContables = new HashSet<CuentaContable>();
	
	
	
	public Caja() {
		super();
	}

	


	public int getCodigoCaja() {
		return codigoCaja;
	}



	public void setCodigoCaja(int codigoCaja) {
		this.codigoCaja = codigoCaja;
	}



	public String getTipo() {
		return tipo;
	}



	public void setTipo(String tipo) {
		this.tipo = tipo;
	}



	public String getFecha() {
		return fecha;
	}



	public void setFecha(String fecha) {
		this.fecha = fecha;
	}



	public int getNumero() {
		return numero;
	}



	public void setNumero(int numero) {
		this.numero = numero;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigoCaja;
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
		Caja other = (Caja) obj;
		if (codigoCaja != other.codigoCaja)
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Caja [codigoCaja=" + codigoCaja + ", tipo=" + tipo + ", fecha=" + fecha + ", numero=" + numero + "]";
	}
	
	
   
}
