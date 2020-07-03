package ec.edu.ups.JPA;

import ec.edu.ups.DAO.CertificadosDAO;
import ec.edu.ups.DAO.CitaDAO;
import ec.edu.ups.DAO.ConsultaMedicaDAO;
import ec.edu.ups.DAO.DAOFactory;
import ec.edu.ups.DAO.MedicinaDAO;
import ec.edu.ups.DAO.PacienteDAO;

public class JPADAOFactory extends DAOFactory {

	@Override
	public PacienteDAO getPacienteDAO() {
		// TODO Auto-generated method stub
		return new JPAPacienteDAO();
	}

	@Override
	public CitaDAO getCitaDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ConsultaMedicaDAO getConsultaMedicaDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MedicinaDAO getMedicinaDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CertificadosDAO getCertificadoDAO() {
		// TODO Auto-generated method stub
		return null;
	}

}
