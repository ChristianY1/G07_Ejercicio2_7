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


@WebServlet("/ControladorEditar")
public class ControladorEditar extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Usuario usu =null;
	String cedula = "";

    public ControladorEditar() {
        super();
        usu = new Usuario();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		HttpSession sesion = request.getSession();
		
		sesion.setAttribute("accesos", sesion.getAttribute("accesos"));
		
		UsuarioDAO usuarioDao = DAOFactory.getdaDaoFactory().getUsuarioDAO();
		Usuario usuario = new Usuario();
		
		String id =request.getParameter("cedula");
		
		usu = usuarioDao.read(Integer.parseInt(request.getParameter("id")));
		cedula = usu.getCedula();
		System.out.print(usu.getCedula());
		
		usuario=usuarioDao.read((Integer.parseInt(cedula)));
		
		request.setAttribute("usuario", usuario);
		getServletContext().getRequestDispatcher("/PrivadaPaciente/confPaciente.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String nombre="";
		String apellido = "";
		String correo="";
		String telefono="";
		String sexo = "";
		String contrasena="";
		

		String accion = request.getParameter("editar");
		UsuarioDAO usuarioDao = DAOFactory.getdaDaoFactory().getUsuarioDAO();
		Usuario usuario = new Usuario();

		if (accion.equals("editar")) {
			nombre = request.getParameter("nombre");
			apellido = request.getParameter("apellido");
			correo = request.getParameter("correo");
			telefono = request.getParameter("telefono");
			sexo = request.getParameter("sexo");
			contrasena = request.getParameter("contrasena");
			
			usuario=usuarioDao.read((Integer.parseInt(cedula)));
			
			usu.setNombre(nombre);
			usu.setApellido(apellido);
			usu.setEmail(correo);
			usu.setTelefono(telefono);
			usu.setSexo(sexo);
			usu.setContrasena(contrasena);
			
			usuarioDao.update(usu);

		}
		
		try {
			request.setAttribute("usuario", usuario);
			getServletContext().getRequestDispatcher("/PrivadaPaciente/IndexPaciente.jsp").forward(request, response);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}

