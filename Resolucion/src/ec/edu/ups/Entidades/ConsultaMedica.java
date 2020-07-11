package ec.edu.ups.Entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Consulta
 *
 */
@Entity

public class ConsultaMedica implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String idConsulta;
	
	private Date fechaConsulta;
	private String motivoConsulta;
	private String datosExtras;
	
	@OneToOne
	@JoinColumn
	private Cita cita;
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "consultaMedica")
	private Factura factura;
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "consultaMedica")
	private Certificados certificados;
	
	
	public ConsultaMedica() {
		super();
	}


	public ConsultaMedica(Date fechaConsulta, String motivoConsulta, String datosExtras, Cita cita, Factura factura,
			Certificados certificados) {
		super();
		this.fechaConsulta = fechaConsulta;
		this.motivoConsulta = motivoConsulta;
		this.datosExtras = datosExtras;
		this.cita = cita;
		this.factura = factura;
		this.certificados = certificados;
	}


	public String getIdConsulta() {
		return idConsulta;
	}


	public void setIdConsulta(String idConsulta) {
		this.idConsulta = idConsulta;
	}


	public Date getFechaConsulta() {
		return fechaConsulta;
	}


	public void setFechaConsulta(Date fechaConsulta) {
		this.fechaConsulta = fechaConsulta;
	}


	public String getMotivoConsulta() {
		return motivoConsulta;
	}


	public void setMotivoConsulta(String motivoConsulta) {
		this.motivoConsulta = motivoConsulta;
	}


	public String getDatosExtras() {
		return datosExtras;
	}


	public void setDatosExtras(String datosExtras) {
		this.datosExtras = datosExtras;
	}


	public Cita getCita() {
		return cita;
	}


	public void setCita(Cita cita) {
		this.cita = cita;
	}


	public Factura getFactura() {
		return factura;
	}


	public void setFactura(Factura factura) {
		this.factura = factura;
	}


	public Certificados getCertificados() {
		return certificados;
	}


	public void setCertificados(Certificados certificados) {
		this.certificados = certificados;
	}


	@Override
	public String toString() {
		return "ConsultaMedica [idConsulta=" + idConsulta + ", fechaConsulta=" + fechaConsulta + ", motivoConsulta="
				+ motivoConsulta + ", datosExtras=" + datosExtras + ", cita=" + cita + ", factura=" + factura
				+ ", certificados=" + certificados + "]";
	}

	
	
}
