package ec.edu.ups.Modelo;

import java.util.ArrayList;
import java.util.Date;

public class Factura {
	
	
	private String idFactura;
	private String fechaFactura;
	private Paciente paciente;
	private Medico medico;
	//private ArrayList<FacturaDetalle> facturaDetalle;
	
	
	public Factura() {
		super();
	}

	
	public Factura(String idFactura, String fechaFactura) {
		super();
		this.idFactura = idFactura;
		this.fechaFactura = fechaFactura;
		
	}


	

	public void setIdFactura(String idFactura) {
		this.idFactura = idFactura;
	}


	


	public void setFechaFactura(String fechaFactura) {
		this.fechaFactura = fechaFactura;
	}



}
