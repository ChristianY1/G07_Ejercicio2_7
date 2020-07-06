package ec.edu.ups.Entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: FacturaDetalle
 *
 */
@Entity

public class FacturaDetalle implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idDetalleFactura;
	private String indicacionesConsumo;
	private double totalConsulta;
	private double totalPagar;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "detalle")
	private List<Medicina> medicinaList = new ArrayList<Medicina>();
	@ManyToOne
	@JoinColumn
	private Factura factura;
	
	public FacturaDetalle() {
		super();
	}
	
	
	
	public FacturaDetalle(String indicacionesConsumo, double totalConsulta, double totalPagar,
			List<Medicina> medicinaList, Factura factura) {
		super();
		this.indicacionesConsumo = indicacionesConsumo;
		this.totalConsulta = totalConsulta;
		this.totalPagar = totalPagar;
		this.medicinaList = medicinaList;
		this.factura = factura;
	}



	public int getIdDetalleFactura() {
		return idDetalleFactura;
	}

	public void setIdDetalleFactura(int idDetalleFactura) {
		this.idDetalleFactura = idDetalleFactura;
	}

	public String getIndicacionesConsumo() {
		return indicacionesConsumo;
	}

	public void setIndicacionesConsumo(String indicacionesConsumo) {
		this.indicacionesConsumo = indicacionesConsumo;
	}

	public double getTotalConsulta() {
		return totalConsulta;
	}

	public void setTotalConsulta(double totalConsulta) {
		this.totalConsulta = totalConsulta;
	}

	public double getTotalPagar() {
		return totalPagar;
	}

	public void setTotalPagar(double totalPagar) {
		this.totalPagar = totalPagar;
	}

	public List<Medicina> getMedicinaList() {
		return medicinaList;
	}

	public void setMedicinaList(List<Medicina> medicinaList) {
		this.medicinaList = medicinaList;
	}



	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}
   
	
	
}
