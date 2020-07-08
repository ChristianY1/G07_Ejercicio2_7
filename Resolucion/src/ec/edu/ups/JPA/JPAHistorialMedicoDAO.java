package ec.edu.ups.JPA;

import javax.persistence.Persistence;

import ec.edu.ups.Entidades.Cita;
import ec.edu.ups.Entidades.HistorialMedico;

public class JPAHistorialMedicoDAO extends JPAGenericDAO<HistorialMedico, Integer>{
	
	public JPAHistorialMedicoDAO() {
		super(HistorialMedico.class);
		this.em = Persistence.createEntityManagerFactory("jpa").createEntityManager();
	}
	
}
