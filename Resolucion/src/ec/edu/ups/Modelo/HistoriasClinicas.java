package ec.edu.ups.Modelo;

import java.sql.Date;

public class HistoriasClinicas {

	private int historia_id;
	private String fecha;
	private String historia;
	private String observaciones;
	
	public HistoriasClinicas() {
		super();
	}
	
	

	@Override
	public String toString() {
		return "HistoriasClinicas [historia_id=" + historia_id + ", fecha=" + fecha + ", historia=" + historia
				+ ", observaciones=" + observaciones + "]";
	}
	
}
