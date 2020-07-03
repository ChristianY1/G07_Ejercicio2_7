package ec.edu.ups.JPA;

import javax.persistence.Persistence;

import ec.edu.ups.Entidades.FacturaDetalle;

public class JPAFacturaDetalleDAO extends JPAGenericDAO<FacturaDetalle, String>{

	public JPAFacturaDetalleDAO() {
		super(FacturaDetalle.class);
		this.em = Persistence.createEntityManagerFactory("jpa").createEntityManager();
	}

}
