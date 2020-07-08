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
	private String nombre;
	private String indentificacion;
	@OneToOne
	@JoinColumn
	private ConsultaMedica datosConsulta;
	private String diagnosticoMedico;
	private String consideracionesMedicas;

	public Certificados() {
		super();
	}

	
	
	public Certificados(String nombre, String indentificacion, ConsultaMedica datosConsulta, String diagnosticoMedico,
			String consideracionesMedicas) {
		super();
		this.nombre = nombre;
		this.indentificacion = indentificacion;
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

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getIndentificacion() {
		return indentificacion;
	}

	public void setIndentificacion(String indentificacion) {
		this.indentificacion = indentificacion;
	}



	@Override
	public String toString() {
		return "Certificados [idCertificado=" + idCertificado + ", nombre=" + nombre + ", indentificacion="
				+ indentificacion + ", datosConsulta=" + datosConsulta + ", diagnosticoMedico=" + diagnosticoMedico
				+ ", consideracionesMedicas=" + consideracionesMedicas + "]";
	}
	
}
