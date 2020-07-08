package ec.edu.ups.JPA;

import javax.persistence.Persistence;

import ec.edu.ups.DAO.ReporteDAO;
import ec.edu.ups.Entidades.Reporte;

public class JPAReporteDAO extends JPAGenericDAO<Reporte,String> implements ReporteDAO{
	
	public JPAReporteDAO() {
		super(Reporte.class);
		this.em = Persistence.createEntityManagerFactory("jpa").createEntityManager();
	}
}
