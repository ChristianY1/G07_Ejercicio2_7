package ec.edu.ups.Modelo;

import java.util.Date;

public class Medicina {
	
	public String idMedicina;
	public String nombre;
	public String marca;
	public String agentePrincipal;
	public Date fechaCaducidad;
	public int  stock;
	public String metodoAplicacion;
	
	public Medicina() {
		super ();
	}

	

	public void setIdMedicina(String idMedicina) {
		this.idMedicina = idMedicina;
	}

	

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void setAgentePrincipal(String agentePrincipal) {
		this.agentePrincipal = agentePrincipal;
	}

	
	
	
	
	
	

}
