package ec.edu.ups.Modelo;

import java.util.List;

public class Medico extends Usuario{
	
	private int med_id;
	private String especialidad;
	private List<Reporte> listReporte;

	public Medico() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public void setMed_id(int med_id) {
		this.med_id = med_id;
	}

	

	public void setListReporte(List<Reporte> listReporte) {
		this.listReporte = listReporte;
	}

	

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	@Override
	public String toString() {
		return "Medico [med_id=" + med_id + ", especialidad=" + especialidad + ", listReporte=" + listReporte + "]";
	}
	
}
