package ec.edu.ups.Entidades;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Certificados
 *
 */
@Entity

public class Certificados implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String idCertificado;
	
	@ManyToOne
	@JoinColumn
	private Paciente paciente;
	
	@OneToOne
	@JoinColumn
	private ConsultaMedica datosConsulta;
	private String diagnosticoMedico;
	private String consideracionesMedicas;

	public Certificados() {
		super();
	}

	public Certificados(Paciente paciente, ConsultaMedica datosConsulta, String diagnosticoMedico,
			String consideracionesMedicas) {
		super();
		this.paciente = paciente;
		this.datosConsulta = datosConsulta;
		this.diagnosticoMedico = diagnosticoMedico;
		this.consideracionesMedicas = consideracionesMedicas;
	}

	public String getIdCertificado() {
		return idCertificado;
	}

	public void setIdCertificado(String idCertificado) {
		this.idCertificado = idCertificado;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public ConsultaMedica getDatosConsulta() {
		return datosConsulta;
	}

	public void setDatosConsulta(ConsultaMedica datosConsulta) {
		this.datosConsulta = datosConsulta;
	}

	public String getDiagnosticoMedico() {
		return diagnosticoMedico;
	}

	public void setDiagnosticoMedico(String diagnosticoMedico) {
		this.diagnosticoMedico = diagnosticoMedico;
	}

	public String getConsideracionesMedicas() {
		return consideracionesMedicas;
	}

	public void setConsideracionesMedicas(String consideracionesMedicas) {
		this.consideracionesMedicas = consideracionesMedicas;
	}

}
