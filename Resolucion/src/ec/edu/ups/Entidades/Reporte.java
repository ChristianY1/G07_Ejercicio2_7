package ec.edu.ups.Entidades;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import ec.edu.ups.Entidades.LibroDiario;

@Entity
public class Reporte implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int report_id;
	private String Datos;
	private String Diario;
	private double balances;
	@ManyToOne
	@JoinColumn
	private LibroDiario libroDiario;
	@ManyToOne
	@JoinColumn
	private Paciente paciente;
	@ManyToOne
	@JoinColumn
	private Medico medico;
	
	public Reporte() {
		
	}
	
	public Reporte(int report_id, String datos, String diario, double balances, LibroDiario libroDiario) {
		super();
		this.report_id = report_id;
		Datos = datos;
		Diario = diario;
		this.balances = balances;
		this.libroDiario = libroDiario;
	}

	public int getReport_id() {
		return report_id;
	}

	public void setReport_id(int report_id) {
		this.report_id = report_id;
	}

	public String getDatos() {
		return Datos;
	}

	public void setDatos(String datos) {
		Datos = datos;
	}

	public String getDiario() {
		return Diario;
	}

	public void setDiario(String diario) {
		Diario = diario;
	}

	public double getBalances() {
		return balances;
	}

	public void setBalances(double balances) {
		this.balances = balances;
	}

	public LibroDiario getLibroDiario() {
		return libroDiario;
	}

	public void setLibroDiario(LibroDiario libroDiario) {
		this.libroDiario = libroDiario;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Datos == null) ? 0 : Datos.hashCode());
		result = prime * result + ((Diario == null) ? 0 : Diario.hashCode());
		long temp;
		temp = Double.doubleToLongBits(balances);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((libroDiario == null) ? 0 : libroDiario.hashCode());
		result = prime * result + report_id;
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
		Reporte other = (Reporte) obj;
		if (Datos == null) {
			if (other.Datos != null)
				return false;
		} else if (!Datos.equals(other.Datos))
			return false;
		if (Diario == null) {
			if (other.Diario != null)
				return false;
		} else if (!Diario.equals(other.Diario))
			return false;
		if (Double.doubleToLongBits(balances) != Double.doubleToLongBits(other.balances))
			return false;
		if (libroDiario == null) {
			if (other.libroDiario != null)
				return false;
		} else if (!libroDiario.equals(other.libroDiario))
			return false;
		if (report_id != other.report_id)
			return false;
		return true;
	}
	
	

}
