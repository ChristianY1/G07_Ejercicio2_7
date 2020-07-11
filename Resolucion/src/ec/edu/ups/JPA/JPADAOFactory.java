package ec.edu.ups.JPA;

import ec.edu.ups.DAO.CertificadosDAO;
import ec.edu.ups.DAO.CitaDAO;
import ec.edu.ups.DAO.ConsultaMedicaDAO;
import ec.edu.ups.DAO.DAOFactory;
import ec.edu.ups.DAO.FacturaDAO;
import ec.edu.ups.DAO.FacturaDetalleDAO;
import ec.edu.ups.DAO.HistorialMedicoDAO;
import ec.edu.ups.DAO.MedicinaDAO;
import ec.edu.ups.DAO.UsuarioDAO;

public class JPADAOFactory extends DAOFactory {

	@Override
	public CitaDAO getCitaDAO() {
		// TODO Auto-generated method stub
		return new JPACitaDAO();
	}

	@Override
	public ConsultaMedicaDAO getConsultaMedicaDAO() {
		// TODO Auto-generated method stub
		return new JPAConsultaMedicaDAO();
	}

	@Override
	public MedicinaDAO getMedicinaDAO() {
		// TODO Auto-generated method stub
		return new JPAMedicinaDAO();
	}

	@Override
	public CertificadosDAO getCertificadoDAO() {
		// TODO Auto-generated method stub
		return new JPACertificadosDAO();
	}

	@Override
	public FacturaDAO getFacturaDAO() {
		// TODO Auto-generated method stub
		return new JPAFacturaDAO();
	}

	@Override
	public FacturaDetalleDAO getFacturaDetalleDAO() {
		// TODO Auto-generated method stub
		return new JPAFacturaDetalleDAO();
	}

	@Override
	public UsuarioDAO getUsuarioDAO() {
		// TODO Auto-generated method stub
		return new JPAUsuarioDAO();
	}

	@Override
	public HistorialMedicoDAO getHistorialMedicoDAO() {
		// TODO Auto-generated method stub
		return new JPAHistorialMedicoDAO();
	}

}
