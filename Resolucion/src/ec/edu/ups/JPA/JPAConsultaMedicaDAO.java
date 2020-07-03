package ec.edu.ups.JPA;

import javax.persistence.Persistence;

import ec.edu.ups.DAO.ConsultaMedicaDAO;
import ec.edu.ups.Entidades.ConsultaMedica;

public class JPAConsultaMedicaDAO extends JPAGenericDAO<ConsultaMedica, String> implements ConsultaMedicaDAO{

	public JPAConsultaMedicaDAO() {
		super(ConsultaMedica.class);
		this.em = Persistence.createEntityManagerFactory("jpa").createEntityManager();
	}

}
