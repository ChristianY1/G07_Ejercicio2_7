package ec.edu.ups.Entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Medico implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int med_id;
	private String especialidad;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "medico")
	private List<Reporte> reporteList = new ArrayList<Reporte>();
	
	public Medico() {
		
	}
	
	public Medico(int med_id, String especialidad, List<Reporte> reporteList) {
		super();
		this.med_id = med_id;
		this.especialidad = especialidad;
		this.reporteList = reporteList;
	}

	public int getMed_id() {
		return med_id;
	}

	public void setMed_id(int med_id) {
		this.med_id = med_id;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public List<Reporte> getReporteList() {
		return reporteList;
	}

	public void setReporteList(List<Reporte> reporteList) {
		this.reporteList = reporteList;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((especialidad == null) ? 0 : especialidad.hashCode());
		result = prime * result + med_id;
		result = prime * result + ((reporteList == null) ? 0 : reporteList.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Medico other = (Medico) obj;
		if (especialidad == null) {
			if (other.especialidad != null)
				return false;
		} else if (!especialidad.equals(other.especialidad))
			return false;
		if (med_id != other.med_id)
			return false;
		if (reporteList == null) {
			if (other.reporteList != null)
				return false;
		} else if (!reporteList.equals(other.reporteList))
			return false;
		return true;
	}
	
	
}
