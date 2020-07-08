package ec.edu.ups.JPA;

import javax.persistence.Persistence;

import ec.edu.ups.DAO.UsuarioDAO;
import ec.edu.ups.Entidades.Cita;
import ec.edu.ups.Entidades.Usuario;

public class JPAUsuarioDAO extends JPAGenericDAO<Usuario, Integer> implements UsuarioDAO{
	
	public JPAUsuarioDAO() {
		super(Usuario.class);
		this.em = Persistence.createEntityManagerFactory("jpa").createEntityManager();
	}
	
}
