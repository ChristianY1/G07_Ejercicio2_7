package ec.edu.ups.JPA;

import javax.persistence.Persistence;

import ec.edu.ups.DAO.FacturaDAO;
import ec.edu.ups.Entidades.Factura;

public class JPAFacturaDAO extends JPAGenericDAO<Factura, String> implements FacturaDAO{

	public JPAFacturaDAO() {
		super(Factura.class);
		this.em = Persistence.createEntityManagerFactory("jpa").createEntityManager();
	}

}
