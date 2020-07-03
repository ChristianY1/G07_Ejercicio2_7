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
	private String idCita;
	private String horaAsignada;
	private Date fechaAsignada;
	private boolean estadoCita;
	@ManyToOne
	@JoinColumn
	private Paciente paciente;
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "cita")
	private ConsultaMedica consulta;

	public Cita() {
		super();
	}

	public Cita(String horaAsignada, Date fechaAsignada, boolean estadoCita, Paciente paciente,
			ConsultaMedica consulta) {
		super();
		this.horaAsignada = horaAsignada;
		this.fechaAsignada = fechaAsignada;
		this.estadoCita = estadoCita;
		this.paciente = paciente;
		this.consulta = consulta;
	}



	public String getIdCita() {
		return idCita;
	}

	public void setIdCita(String idCita) {
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

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public ConsultaMedica getConsulta() {
		return consulta;
	}

	public void setConsulta(ConsultaMedica consulta) {
		this.consulta = consulta;
	}
   
	
	
}
