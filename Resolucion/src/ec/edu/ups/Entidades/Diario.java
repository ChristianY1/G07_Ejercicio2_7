package ec.edu.ups.Entidades;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Diario
 *
 */
@Entity

public class Diario implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	@ManyToOne
	@JoinColumn
	private Caja caja_diario;
	
	

	
	private static final long serialVersionUID = 1L;

	public Diario() {
		super();
	}

	public Diario(Caja caja_diario) {
		super();
		this.caja_diario = caja_diario;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Caja getCaja_diario() {
		return caja_diario;
	}

	public void setCaja_diario(Caja caja_diario) {
		this.caja_diario = caja_diario;
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
		Diario other = (Diario) obj;
		if (codigo != other.codigo)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Diario [codigo=" + codigo + ", caja_diario=" + caja_diario + "]";
	}
	
   
}
