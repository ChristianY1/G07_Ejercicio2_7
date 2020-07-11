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
	private int codigo;
	
	private String nombre;
	private String identificacion;
	
	private String diagnosticoMedico;
	private String consideracionesMedicas;
	
	@OneToOne
	@JoinColumn
	private ConsultaMedica consultaMedica;
	

	public Certificados() {
		super();
	}


	public Certificados(String nombre, String identificacion, String diagnosticoMedico, String consideracionesMedicas,
			ConsultaMedica consultaMedica) {
		super();
		this.nombre = nombre;
		this.identificacion = identificacion;
		this.diagnosticoMedico = diagnosticoMedico;
		this.consideracionesMedicas = consideracionesMedicas;
		this.consultaMedica = consultaMedica;
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getIdentificacion() {
		return identificacion;
	}


	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
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


	public ConsultaMedica getConsultaMedica() {
		return consultaMedica;
	}


	public void setConsultaMedica(ConsultaMedica consultaMedica) {
		this.consultaMedica = consultaMedica;
	}


	@Override
	public String toString() {
		return "Certificados [codigo=" + codigo + ", nombre=" + nombre + ", identificacion=" + identificacion
				+ ", diagnosticoMedico=" + diagnosticoMedico + ", consideracionesMedicas=" + consideracionesMedicas
				+ ", consultaMedica=" + consultaMedica + "]";
	}


	
	
}
