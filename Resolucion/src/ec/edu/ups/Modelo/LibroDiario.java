package ec.edu.ups.Modelo;

import java.sql.Date;

public class LibroDiario {
	
	private int libroD_id;
	private String debe;
	private String haber;
	private String fecha;
	
	public LibroDiario() {
		super();
	}
	
	

	public void setLibroD_id(int libroD_id) {
		this.libroD_id = libroD_id;
	}

	
	public void setDebe(String debe) {
		this.debe = debe;
	}

	

	public void setHaber(String haber) {
		this.haber = haber;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "LibroDiario [libroD_id=" + libroD_id + ", debe=" + debe + ", haber=" + haber + ", fecha=" + fecha + "]";
	}
}
