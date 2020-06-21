package ec.edu.ups.Controlador;

import java.util.List;

import ec.edu.ups.Modelo.Cita;
import ec.edu.ups.Modelo.HistoriasClinicas;
import ec.edu.ups.Modelo.Paciente;

public class ControladorPaciente {

	private Paciente paciente;
	/*
	int[] coeficienteValidacionCedula = { 2, 1, 2, 1, 2, 1, 2, 1, 2 };
	int verificador = 0;
	int tercerDigito = 0;
	int suma = 0;
	int digito = 0;
	*/
	public boolean validarCedula(String cedula) {
		/*boolean validacion = false;
			if (cedula.length() == 10) {
				tercerDigito = Integer.parseInt(cedula.substring(2, 3));
				if (tercerDigito < 6) {

					verificador = Integer.parseInt(cedula.substring(9, 10));

					for (int i = 0; i < (cedula.length() - 1); i++) {
						digito = Integer.parseInt(cedula.substring(i, i + 1)) * coeficienteValidacionCedula[i];
						suma += ((digito % 10) + (digito / 10));
					}
					if ((suma % 10 == 0) && (suma % 10 == verificador)) {
						validacion = true;
					} else if ((10 - (suma % 10)) == verificador) {
						validacion = true;
					} else {
						validacion = false;
					}
				}
			}*/
		return false;
	}

	/*public List<Cita> obtenerCitas(String cedula) {
		return paciente.getCitasList();
	}*/
	
	

	/*public List<HistoriasClinicas> obtenerHistorialMedico(String cedula) {
		return paciente.getHistoriasClinicas();
	}*/
	
	public boolean obtenerHistorialMedico(String cedula) {
		return false;
	}

	public boolean agendarCita() {
		return true;
	}
	
	public boolean agregarPaciente(String nombre, String apellido, 
			int edad, String sexo, String telefono, String cedula, String email, String contrasena) {
		
		paciente = new Paciente(nombre, apellido, edad, sexo, telefono, cedula, email, contrasena);
		paciente.getApellido();
		paciente.getCedula();
		paciente.getEdad();
		paciente.getNombre();
		paciente.getTelefono();
		
		return false;
	}

}
