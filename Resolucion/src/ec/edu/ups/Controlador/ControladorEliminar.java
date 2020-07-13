package ec.edu.ups.Controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ec.edu.ups.DAO.UsuarioDAO;
import ec.edu.ups.Entidades.Usuario;
import ec.edu.ups.DAO.DAOFactory;


@WebServlet("/ControladorEliminar")
public class ControladorEliminar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ControladorEliminar() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		UsuarioDAO usuarioDAO = DAOFactory.getdaDaoFactory().getUsuarioDAO(); 
		Usuario usuario = new Usuario();
		String cedula="";
		
		cedula = request.getParameter("cedula");
			
		usuario = usuarioDAO.read((Integer.parseInt(cedula)));
		
		usuarioDAO.deleteById((Integer.parseInt(cedula)));
		System.out.println("paso del eliminar");
		
		try {
			
			usuario = usuarioDAO.read((Integer.parseInt(cedula)));
			
			request.setAttribute("usuario", usuario);
			getServletContext().getRequestDispatcher("/Resolucion/PrivadaPaciente/confPaciente.jsp").forward(request, response);
			
		}catch(Exception e) {
			System.out.println("Error al eliminar " + e.getMessage());
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
