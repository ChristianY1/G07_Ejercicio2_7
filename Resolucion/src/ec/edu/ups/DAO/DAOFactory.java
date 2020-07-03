package ec.edu.ups.DAO;

import ec.edu.ups.JPA.JPADAOFactory;

public abstract class DAOFactory {
	protected static DAOFactory factory = new JPADAOFactory();
	
	
	public static DAOFactory getdaDaoFactory() {
		return factory;
	}
	
	
	

}
