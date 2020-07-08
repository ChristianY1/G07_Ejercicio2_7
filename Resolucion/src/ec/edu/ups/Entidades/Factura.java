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
	private String nombreFacturado;
	private String indentificacion;
	@OneToOne
	@JoinColumn
	private ConsultaMedica consulta;
	//Agregar el medico que genera la factura
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "factura")
	private List<FacturaDetalle> detalles = new ArrayList<FacturaDetalle>();
	
	
	public Factura() {
		super();
	}

	public Factura(String nombreFacturado, String indentificacion, ConsultaMedica consulta,
			List<FacturaDetalle> detalles) {
		super();
		this.nombreFacturado = nombreFacturado;
		this.indentificacion = indentificacion;
		this.consulta = consulta;
		this.detalles = detalles;
	}

	public String getIdFactura() {
		return idFactura;
	}

	public void setIdFactura(String idFactura) {
		this.idFactura = idFactura;
	}

	public String getNombreFacturado() {
		return nombreFacturado;
	}

	public void setNombreFacturado(String nombreFacturado) {
		this.nombreFacturado = nombreFacturado;
	}

	public String getIndentificacion() {
		return indentificacion;
	}

	public void setIndentificacion(String indentificacion) {
		this.indentificacion = indentificacion;
	}

	public ConsultaMedica getConsulta() {
		return consulta;
	}

	public void setConsulta(ConsultaMedica consulta) {
		this.consulta = consulta;
	}

	public List<FacturaDetalle> getDetalles() {
		return detalles;
	}

	public void setDetalles(List<FacturaDetalle> detalles) {
		this.detalles = detalles;
	}

	@Override
	public String toString() {
		return "Factura [idFactura=" + idFactura + ", nombreFacturado=" + nombreFacturado + ", indentificacion="
				+ indentificacion + ", consulta=" + consulta + ", detalles=" + detalles + "]";
	}
	
	
}
