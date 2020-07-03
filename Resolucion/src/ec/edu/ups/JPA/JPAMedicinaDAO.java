package ec.edu.ups.JPA;

import javax.persistence.Persistence;

import ec.edu.ups.DAO.MedicinaDAO;
import ec.edu.ups.Entidades.Medicina;

public class JPAMedicinaDAO extends JPAGenericDAO<Medicina, String> implements MedicinaDAO{

	public JPAMedicinaDAO() {
		super(Medicina.class);
		this.em = Persistence.createEntityManagerFactory("jpa").createEntityManager();
	}

}
