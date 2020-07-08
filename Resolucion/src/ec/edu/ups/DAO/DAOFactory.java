package ec.edu.ups.DAO;

import ec.edu.ups.JPA.JPADAOFactory;

public abstract class DAOFactory {
	
	protected static DAOFactory factory = new JPADAOFactory();
	
	
	public static DAOFactory getdaDaoFactory() {
		return factory;
	}
	
	public abstract UsuarioDAO getUsuarioDAO();
	public abstract HistorialMedicoDAO getHistorialMedicoDAO();
	public abstract CitaDAO getCitaDAO();
	public abstract ConsultaMedicaDAO getConsultaMedicaDAO();
	public abstract MedicinaDAO getMedicinaDAO();
	public abstract CertificadosDAO getCertificadoDAO();
	public abstract FacturaDAO getFacturaDAO();
	public abstract FacturaDetalleDAO getFacturaDetalleDAO();
	
	

}
