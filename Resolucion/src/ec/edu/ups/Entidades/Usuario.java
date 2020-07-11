package ec.edu.ups.Entidades;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Usuario
 *
 */
@Entity

public class Usuario implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	
	private String nombre;
	private String apellido;
	private String FechaDeNacimiento;
	private int edad;
	private String sexo;
	private String telefono;
	private String cedula;
	private String email;
	private String contrasena;
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "usuario")
	private HistorialMedico historial;
	

	public Usuario() {
		super();
	}

	
	
	public Usuario(String nombre, String apellido, String fechaDeNacimiento, int edad, String sexo,
			String telefono, String cedula, String email, String contrasena) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		FechaDeNacimiento = fechaDeNacimiento;
		this.edad = edad;
		this.sexo = sexo;
		this.telefono = telefono;
		this.cedula = cedula;
		this.email = email;
		this.contrasena = contrasena;
	}
	
	
	public Usuario(String nombre, String apellido, String fechaDeNacimiento, int edad, String sexo, String telefono,
			String cedula, String email, String contrasena, HistorialMedico historial) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		FechaDeNacimiento = fechaDeNacimiento;
		this.edad = edad;
		this.sexo = sexo;
		this.telefono = telefono;
		this.cedula = cedula;
		this.email = email;
		this.contrasena = contrasena;
		this.historial = historial;
	}



	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getFechaDeNacimiento() {
		return FechaDeNacimiento;
	}


	public void setFechaDeNacimiento(String fechaDeNacimiento) {
		FechaDeNacimiento = fechaDeNacimiento;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getCedula() {
		return cedula;
	}


	public void setCedula(String cedula) {
		this.cedula = cedula;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getContrasena() {
		return contrasena;
	}


	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	
	

	public HistorialMedico getHistorial() {
		return historial;
	}



	public void setHistorial(HistorialMedico historial) {
		this.historial = historial;
	}



	@Override
	public String toString() {
		return "Usuario [codigo=" + codigo + ", nombre=" + nombre + ", apellido=" + apellido + ", FechaDeNacimiento="
				+ FechaDeNacimiento + ", edad=" + edad + ", sexo=" + sexo + ", telefono=" + telefono + ", cedula="
				+ cedula + ", email=" + email + ", contrasena=" + contrasena + "]";
	}
	
	
   
}
