package ec.edu.ups.Controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.edu.ups.Entidades.Usuario;

/**
 * Servlet implementation class RegistrarPaciente
 */
@WebServlet("/RegistrarPaciente")
public class RegistrarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public RegistrarUsuario() {
        super();
        
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String fecha="";
		String apellido="";
		String cedula="";
		String contrasena="";
		int edad=0;
		String email = "";
		String nombre ="";
		String sexo="";
		String telefono="";
		
		Usuario usuario = new Usuario();
		
	}

}
