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
	@JoinColumn
	private Usuario usuario;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "historial")
	private List<Cita> listaCitas = new ArrayList<Cita>();

	public HistorialMedico() {
		super();
	}
	
	public HistorialMedico(String tipoSangre, String historia, Usuario usuario, List<Cita> listaCitas) {
		super();
		this.tipoSangre = tipoSangre;
		this.historia = historia;
		this.usuario = usuario;
		this.listaCitas = listaCitas;
	}



	public int getIdHistorial() {
		return idHistorial;
	}

	public void setIdHistorial(int idHistorial) {
		this.idHistorial = idHistorial;
	}

	public String getTipoSangre() {
		return tipoSangre;
	}

	public void setTipoSangre(String tipoSangre) {
		this.tipoSangre = tipoSangre;
	}

	public String getHistoria() {
		return historia;
	}

	public void setHistoria(String historia) {
		this.historia = historia;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Cita> getListaCitas() {
		return listaCitas;
	}

	public void setListaCitas(List<Cita> listaCitas) {
		this.listaCitas = listaCitas;
	}
   
	
}
