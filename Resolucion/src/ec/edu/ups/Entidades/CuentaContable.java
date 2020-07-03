package ec.edu.ups.Entidades;

import java.io.Serializable;
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
	private int codigo;
	@ManyToOne
	@JoinColumn
	private Caja caja;

	public CuentaContable() {
		
		super();
	}

	public Caja getCaja() {
		return caja;
	}

	public void setCaja(Caja caja) {
		this.caja = caja;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo;
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
		if (codigo != other.codigo)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CuentaContable [codigo=" + codigo + ", caja=" + caja + "]";
	}
	
	
   
}
