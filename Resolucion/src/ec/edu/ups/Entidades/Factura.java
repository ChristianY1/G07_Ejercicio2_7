package ec.edu.ups.Entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Factura
 *
 */
@Entity

public class Factura implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String idFactura;
	@OneToOne
	@JoinColumn
	private ConsultaMedica consulta;
	
	@ManyToOne
	@JoinColumn
	private Paciente datosPaciente;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "factura")
	private List<FacturaDetalle> detalles = new ArrayList<FacturaDetalle>();
	
	
	public Factura() {
		super();
	}


	public Factura(ConsultaMedica consulta, Paciente datosPaciente, List<FacturaDetalle> detalles) {
		super();
		this.consulta = consulta;
		this.datosPaciente = datosPaciente;
		this.detalles = detalles;
	}


	public String getIdFactura() {
		return idFactura;
	}


	public void setIdFactura(String idFactura) {
		this.idFactura = idFactura;
	}


	public ConsultaMedica getConsulta() {
		return consulta;
	}


	public void setConsulta(ConsultaMedica consulta) {
		this.consulta = consulta;
	}


	public Paciente getDatosPaciente() {
		return datosPaciente;
	}


	public void setDatosPaciente(Paciente datosPaciente) {
		this.datosPaciente = datosPaciente;
	}


	public List<FacturaDetalle> getDetalles() {
		return detalles;
	}


	public void setDetalles(List<FacturaDetalle> detalles) {
		this.detalles = detalles;
	}
	
	
	
   
}
