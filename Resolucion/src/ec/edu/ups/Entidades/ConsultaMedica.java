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
	private String idConsulta;
	private Date fechaConsulta;
	private String motivoConsulta;
	private String datosExtras;
	@OneToOne
	@JoinColumn
	private Cita cita;
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "consulta")
	private Factura factura;
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "datosConsulta")
	private Certificados certificado;
	
	
	public ConsultaMedica() {
		super();
	}


	public ConsultaMedica(Date fechaConsulta, String motivoConsulta, String datosExtras, Cita cita,
			Factura factura, Certificados certificado) {
		super();
		this.fechaConsulta = fechaConsulta;
		this.motivoConsulta = motivoConsulta;
		this.datosExtras = datosExtras;
		this.cita = cita;
		this.factura = factura;
		this.certificado = certificado;
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


	public Certificados getCertificado() {
		return certificado;
	}


	public void setCertificado(Certificados certificado) {
		this.certificado = certificado;
	}


	
}
