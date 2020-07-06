package ec.edu.ups.JPA;

import javax.persistence.Persistence;

import ec.edu.ups.DAO.CitaDAO;
import ec.edu.ups.Entidades.Cita;


public class JPACitaDAO extends JPAGenericDAO<Cita, String> implements CitaDAO{

	public JPACitaDAO() {
		super(Cita.class);
		this.em = Persistence.createEntityManagerFactory("jpa").createEntityManager();
	}
}
