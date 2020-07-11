package ec.edu.ups.Controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.edu.ups.DAO.DAOFactory;
import ec.edu.ups.DAO.UsuarioDAO;
import ec.edu.ups.Entidades.Usuario;

/**
 * Servlet implementation class RegistrarPaciente
 */
@WebServlet("/RegistrarUsuario")
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
		
		String accion = request.getParameter("resp");
		UsuarioDAO usuDAO = DAOFactory.getdaDaoFactory().getUsuarioDAO();
		
		if(accion.equals("Registrarse")) {
			fecha = request.getParameter("fecha");
			apellido = request.getParameter("apellido");
			cedula = request.getParameter("cdi");
			contrasena = request.getParameter("pwd");
			edad = Integer.parseInt(request.getParameter("edad"));
			email = request.getParameter("correo");
			nombre = request.getParameter("nombre");
			sexo = request.getParameter("sexo");
			telefono = request.getParameter("telfono");
			
			usuario = new Usuario(nombre, apellido, fecha, edad, sexo,  telefono,cedula, email, contrasena);
			if(usuDAO.buscarCorreo(email).size()==0) {
				usuDAO.create(usuario);
				System.out.println("Se ha creado el usuario");
				getServletContext().getRequestDispatcher("/JSPs/Exito.jsp").forward(request, response);
			}else {
				request.setAttribute("mensaje", "Correo ya registrado");
				request.setAttribute("usuario", usuario);
				getServletContext().getRequestDispatcher("/JSPs/RegistrarUsuario.jsp").forward(request, response);
			}
		}
		
	}

}
