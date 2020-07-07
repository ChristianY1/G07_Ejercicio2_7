package ec.edu.ups.JPA;

import javax.persistence.Persistence;

import ec.edu.ups.Entidades.Medico;
import ec.edu.ups.DAO.MedicoDAO;

public class JPAMedicoDAO extends JPAGenericDAO<Medico,String> implements MedicoDAO{
	
	public JPAMedicoDAO() {
		super(Medico.class);
		this.em = Persistence.createEntityManagerFactory("jpa").createEntityManager();
	}
}
