package ec.edu.ups.Controlador;

import org.junit.jupiter.params.aggregator.AggregateWith;

import ec.edu.ups.Modelo.Cita;
import ec.edu.ups.Modelo.Medico;

public class ControladorCitas {
	
	private Cita cita;
	
	
	public boolean verificarEstadoCita(String idCita) {
		return true;
	}
	
	public boolean seleccionarMedico() {
		return true;
	}
	
	public boolean enviarMensajeConfirmacion() {
		return true;
	}
	
	public boolean notificarMedico(Medico medico) {
		return true;
	}
	
	public boolean consultarAgendaMedico(Medico medico, Cita cita) {
		return true;
	}
	
	
	
}
