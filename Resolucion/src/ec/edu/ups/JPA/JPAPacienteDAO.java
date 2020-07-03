package ec.edu.ups.JPA;

import javax.persistence.Persistence;

import ec.edu.ups.DAO.PacienteDAO;
import ec.edu.ups.Entidades.Paciente;

public class JPAPacienteDAO extends JPAGenericDAO<Paciente, String> implements PacienteDAO{

	public JPAPacienteDAO() {
		super(Paciente.class);
		this.em = Persistence.createEntityManagerFactory("jpa").createEntityManager();
	}

}
