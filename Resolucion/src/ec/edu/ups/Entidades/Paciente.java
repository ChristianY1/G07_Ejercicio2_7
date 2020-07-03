package ec.edu.ups.Entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Paciente
 *
 */
@Entity

public class Paciente implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy  = GenerationType.IDENTITY)
	private int codigo;
	private String tipoSangre;
	private String historialPaciente;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "paciente")
	private List<Cita> cistasList = new ArrayList<Cita>();
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "paciente")
	private List<Certificados> certificadosList = new ArrayList<Certificados>();
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "datosPaciente")
	private List<Factura> facturaList = new ArrayList<Factura>();
	
	

	public Paciente() {
		super();
	}



	public Paciente(String tipoSangre, String historialPaciente) {
		super();
		this.tipoSangre = tipoSangre;
		this.historialPaciente = historialPaciente;
	}

	public Paciente(String tipoSangre, String historialPaciente, List<Cita> cistasList,
			List<Certificados> certificadosList, List<Factura> facturaList) {
		super();
		this.tipoSangre = tipoSangre;
		this.historialPaciente = historialPaciente;
		this.cistasList = cistasList;
		this.certificadosList = certificadosList;
		this.facturaList = facturaList;
	}



	public int getCodigo() {
		return codigo;
	}



	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}



	public String getTipoSangre() {
		return tipoSangre;
	}



	public void setTipoSangre(String tipoSangre) {
		this.tipoSangre = tipoSangre;
	}



	public String getHistorialPaciente() {
		return historialPaciente;
	}



	public void setHistorialPaciente(String historialPaciente) {
		this.historialPaciente = historialPaciente;
	}



	public List<Cita> getCistasList() {
		return cistasList;
	}



	public void setCistasList(List<Cita> cistasList) {
		this.cistasList = cistasList;
	}



	public List<Certificados> getCertificadosList() {
		return certificadosList;
	}



	public void setCertificadosList(List<Certificados> certificadosList) {
		this.certificadosList = certificadosList;
	}



	public List<Factura> getFacturaList() {
		return facturaList;
	}



	public void setFacturaList(List<Factura> facturaList) {
		this.facturaList = facturaList;
	}
	
	

   
}
