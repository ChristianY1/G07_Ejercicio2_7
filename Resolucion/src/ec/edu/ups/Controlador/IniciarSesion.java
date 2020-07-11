package ec.edu.ups.Controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ec.edu.ups.DAO.DAOFactory;
import ec.edu.ups.DAO.UsuarioDAO;
import ec.edu.ups.Entidades.Usuario;

/**
 * Servlet implementation class IniciarSesion
 */
@WebServlet("/IniciarSesion")
public class IniciarSesion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public IniciarSesion() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession sesion = request.getSession();
		
		sesion.setAttribute("accesos", sesion.getAttribute("accesos"));
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html:charset=UTF-8");
		System.out.print("Iniciar Sesion \n");
		
		UsuarioDAO usuDAO = DAOFactory.getdaDaoFactory().getUsuarioDAO();
		String correo="";
		String contrasena ="";
		String url="";
		
		String accion = request.getParameter("resp");
		Usuario usuario = new Usuario();
		
		if(accion.equals("Login")) {
			
			correo= request.getParameter("user");
			contrasena = request.getParameter("pwd");
			System.out.println("Obteniendo datos del usuario");
			System.out.println("usuario: "+usuDAO.buscar(correo, contrasena));
			usuario = usuDAO.buscar(correo, contrasena);
		}
		
		try {
			if(usuario != null) {
				request.setAttribute("usuario", usuario);
				getServletContext().getRequestDispatcher("/JSPs/PrivadaPaciente/IndexPaciente.jsp").forward(request, response);
			}else {
				request.setAttribute("mensaje", "correo o contrasena incorrectos");
				getServletContext().getRequestDispatcher("/JSPs/LogIn.jsp").forward(request, response);
			}
		}catch(Exception e) {
			System.out.println(">>>ERROR: INICIARSESION:DOPOST "+e.getMessage());
		}
	}

}
