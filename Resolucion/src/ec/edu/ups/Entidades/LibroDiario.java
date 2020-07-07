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
public class LibroDiario implements Serializable{

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int libroD_id;
	private String debe;
	private String haber;
	private String fecha;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "libroDiario")
	private List<Reporte> reporteList = new ArrayList<Reporte>();
	
	public LibroDiario() {
		
	}
	
	public LibroDiario(int libroD_id, String debe, String haber, String fecha, List<Reporte> reporteList) {
		super();
		this.libroD_id = libroD_id;
		this.debe = debe;
		this.haber = haber;
		this.fecha = fecha;
		this.reporteList = reporteList;
	}

	public int getLibroD_id() {
		return libroD_id;
	}

	public void setLibroD_id(int libroD_id) {
		this.libroD_id = libroD_id;
	}

	public String getDebe() {
		return debe;
	}

	public void setDebe(String debe) {
		this.debe = debe;
	}

	public String getHaber() {
		return haber;
	}

	public void setHaber(String haber) {
		this.haber = haber;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
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
		result = prime * result + ((debe == null) ? 0 : debe.hashCode());
		result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
		result = prime * result + ((haber == null) ? 0 : haber.hashCode());
		result = prime * result + libroD_id;
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
		LibroDiario other = (LibroDiario) obj;
		if (debe == null) {
			if (other.debe != null)
				return false;
		} else if (!debe.equals(other.debe))
			return false;
		if (fecha == null) {
			if (other.fecha != null)
				return false;
		} else if (!fecha.equals(other.fecha))
			return false;
		if (haber == null) {
			if (other.haber != null)
				return false;
		} else if (!haber.equals(other.haber))
			return false;
		if (libroD_id != other.libroD_id)
			return false;
		if (reporteList == null) {
			if (other.reporteList != null)
				return false;
		} else if (!reporteList.equals(other.reporteList))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "LibroDiario [libroD_id=" + libroD_id + ", debe=" + debe + ", haber=" + haber + ", fecha=" + fecha
				+ ", reporteList=" + reporteList + "]";
	}
	
}
