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
	
	

	
	private static final long serialVersionUID = 1L;

	public Diario() {
		super();
	}
   
}
