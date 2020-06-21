package ec.edu.ups.Controlador;

import ec.edu.ups.Modelo.Factura;
import ec.edu.ups.Modelo.Paciente;

//import ec.edu.ups.Modelo.ConsultaMedica;

public class ControladorConsultaMedica {
	
	//private ConsultaMedica consultaMedica;
	
	public boolean notificarMedico() {
		return true;
	}
	
	public boolean notificarPaciente(Paciente paciente) {
		return false;
	}
	
	public boolean solicitarDatosExtas(String descripcion) {
		return true;
	}
	
	public boolean registrarAusenciaPaciente() {
		return true;
	}
	
	public boolean generarFactura(Factura factura, Paciente paciente) {
		return true;
	}
	
	public boolean agendarRevision() {
		return true;
	}

}
