package ec.edu.ups.Controlador;

import java.util.ArrayList;


import ec.edu.ups.Modelo.Medico;
import ec.edu.ups.Modelo.Paciente;

public class ControladorCertificadoMedico {
	
	
	Paciente paciente;
	Medico medico;
	
	public boolean SolicitarConfirmacionEnvio(Paciente paciente,String estado) {
		return true;
	}
	
	public boolean EnviarCertificadoEmail(String email) {
		return true;
	}
	
	
	
	public boolean RegistrarCertificadoMedico(String listReporte) {
		return true;
	}

}
