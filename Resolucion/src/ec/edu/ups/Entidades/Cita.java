package ec.edu.ups.Entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Cita
 *
 */
@Entity

public class Cita implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idCita;
	private String horaAsignada;
	private Date fechaAsignada;
	private boolean estadoCita;
	@ManyToOne
	@JoinColumn
	private HistorialMedico historial;
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "cita")
	private ConsultaMedica consultaMedica;

	public Cita() {
		super();
	}

	public Cita(String horaAsignada, Date fechaAsignada, boolean estadoCita, HistorialMedico historial) {
		super();
		this.horaAsignada = horaAsignada;
		this.fechaAsignada = fechaAsignada;
		this.estadoCita = estadoCita;
		this.historial = historial;
	}

	public int getIdCita() {
		return idCita;
	}

	public void setIdCita(int idCita) {
		this.idCita = idCita;
	}

	public String getHoraAsignada() {
		return horaAsignada;
	}

	public void setHoraAsignada(String horaAsignada) {
		this.horaAsignada = horaAsignada;
	}

	public Date getFechaAsignada() {
		return fechaAsignada;
	}

	public void setFechaAsignada(Date fechaAsignada) {
		this.fechaAsignada = fechaAsignada;
	}

	public boolean isEstadoCita() {
		return estadoCita;
	}

	public void setEstadoCita(boolean estadoCita) {
		this.estadoCita = estadoCita;
	}

	public HistorialMedico getHistorial() {
		return historial;
	}

	public void setHistorial(HistorialMedico historial) {
		this.historial = historial;
	}

	public ConsultaMedica getConsultaMedica() {
		return consultaMedica;
	}

	public void setConsultaMedica(ConsultaMedica consultaMedica) {
		this.consultaMedica = consultaMedica;
	}

	@Override
	public String toString() {
		return "Cita [idCita=" + idCita + ", horaAsignada=" + horaAsignada + ", fechaAsignada=" + fechaAsignada
				+ ", estadoCita=" + estadoCita + ", historial=" + historial + ", consultaMedica=" + consultaMedica
				+ "]";
	}

	
}
