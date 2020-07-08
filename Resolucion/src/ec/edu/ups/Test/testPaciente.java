package ec.edu.ups.Test;

import ec.edu.ups.DAO.DAOFactory;
import ec.edu.ups.DAO.UsuarioDAO;
import ec.edu.ups.Entidades.Usuario;

public class testPaciente {

	public static void main(String[] args) {
		
		
		UsuarioDAO usuDAO = DAOFactory.getdaDaoFactory().getUsuarioDAO();
		Usuario u = new Usuario("Pablo", "Calle", "1998/12/31",
				21,"masculino","1212526582","125","test@gmail.com","123");
		 //Paciente p = new Paciente("B+","No hay");
		 usuDAO.create(u);
		 System.out.println("usuario creado: "+usuDAO.find());
		 
		 
	}

}
