package ec.edu.ups.Entidades;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: ComprobanteDeVenta
 *
 */
@Entity

public class ComprobanteDeVenta implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	private String tipo;
	private String fecha;
	private int numero;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private Caja caja;
	
	
	public ComprobanteDeVenta() {
		super();
	}
   
}
