package ec.edu.ups.Entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Medicina
 *
 */
@Entity

public class Medicina implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idMedicina;
	private String marca;
	private String agentePrincipal;
	private Date fechaCaducidad;
	private int stock;
	private String metodoAplicacion;
	@ManyToOne
	@JoinColumn
	private FacturaDetalle detalle;
	
	public Medicina() {
		super();
	}

	public Medicina(String marca, String agentePrincipal, Date fechaCaducidad, int stock, String metodoAplicacion,
			FacturaDetalle detalle) {
		super();
		this.marca = marca;
		this.agentePrincipal = agentePrincipal;
		this.fechaCaducidad = fechaCaducidad;
		this.stock = stock;
		this.metodoAplicacion = metodoAplicacion;
		this.detalle = detalle;
	}

	public int getIdMedicina() {
		return idMedicina;
	}

	public void setIdMedicina(int idMedicina) {
		this.idMedicina = idMedicina;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getAgentePrincipal() {
		return agentePrincipal;
	}

	public void setAgentePrincipal(String agentePrincipal) {
		this.agentePrincipal = agentePrincipal;
	}

	public Date getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(Date fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getMetodoAplicacion() {
		return metodoAplicacion;
	}

	public void setMetodoAplicacion(String metodoAplicacion) {
		this.metodoAplicacion = metodoAplicacion;
	}

	public FacturaDetalle getDetalle() {
		return detalle;
	}

	public void setDetalle(FacturaDetalle detalle) {
		this.detalle = detalle;
	}
   
}
