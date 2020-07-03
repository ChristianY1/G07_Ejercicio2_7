package ec.edu.ups.Entidades;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.*;



/**
 * Entity implementation class for Entity: Caja
 *
 */
@Entity

public class Caja implements Serializable  {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigoCaja;
	private List<ComprobanteDeVenta> cvdList;
	private List<Sueldo> sueldoList;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "caja")
	private Set<ComprobanteDeVenta> cdv = new HashSet<ComprobanteDeVenta>();
	@ManyToOne
	@JoinColumn
	private CuentaContable cuenta_contable;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "caja_diario")
	private Set<Diario> diario = new HashSet<Diario>();
	
	
	
	
	public Caja() {
		super();
	}
	
	



	public Caja(List<ComprobanteDeVenta> cvdList, List<Sueldo> sueldoList) {
		super();
		this.cvdList = cvdList;
		this.sueldoList = sueldoList;
	}




	public List<ComprobanteDeVenta> getCvdList() {
		return cvdList;
	}




	public void setCvdList(List<ComprobanteDeVenta> cvdList) {
		this.cvdList = cvdList;
	}




	public List<Sueldo> getSueldoList() {
		return sueldoList;
	}




	public void setSueldoList(List<Sueldo> sueldoList) {
		this.sueldoList = sueldoList;
	}




	public int getCodigoCaja() {
		return codigoCaja;
	}



	public void setCodigoCaja(int codigoCaja) {
		this.codigoCaja = codigoCaja;
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
		return "Caja [codigoCaja=" + codigoCaja + ", cvdList=" + cvdList + ", sueldoList=" + sueldoList + "]";
	}
	
	

	
   
}
