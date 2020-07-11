package ec.edu.ups.JPA;

import javax.persistence.Persistence;

import ec.edu.ups.DAO.HistorialMedicoDAO;
import ec.edu.ups.Entidades.Cita;
import ec.edu.ups.Entidades.HistorialMedico;

public class JPAHistorialMedicoDAO extends JPAGenericDAO<HistorialMedico, Integer> implements HistorialMedicoDAO{
	
	public JPAHistorialMedicoDAO() {
		super(HistorialMedico.class);
		this.em = Persistence.createEntityManagerFactory("jpa").createEntityManager();
	}
	
}
