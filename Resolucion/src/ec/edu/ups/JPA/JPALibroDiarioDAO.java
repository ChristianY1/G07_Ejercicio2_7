package ec.edu.ups.JPA;

import javax.persistence.Persistence;

import ec.edu.ups.DAO.LibroDiarioDAO;
import ec.edu.ups.Entidades.LibroDiario;

public class JPALibroDiarioDAO extends JPAGenericDAO<LibroDiario,String> implements LibroDiarioDAO{
	
	public JPALibroDiarioDAO() {
		super(LibroDiario.class);
		this.em = Persistence.createEntityManagerFactory("jpa").createEntityManager();
	}
}
