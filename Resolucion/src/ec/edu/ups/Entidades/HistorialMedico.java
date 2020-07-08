package ec.edu.ups.Entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: HistorialMedico
 *
 */
@Entity

public class HistorialMedico implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy  = GenerationType.IDENTITY)
	private int idHistorial;
	private String tipoSangre;
	private String historia;
	@OneToOne
	private Usuario usuario;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "historial")
	private List<Cita> listaCitas = new ArrayList<Cita>();

	public HistorialMedico() {
		super();
	}
   
	
}
