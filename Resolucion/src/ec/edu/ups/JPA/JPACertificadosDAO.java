package ec.edu.ups.JPA;

import javax.persistence.Persistence;

import ec.edu.ups.DAO.CertificadosDAO;
import ec.edu.ups.Entidades.Certificados;

public class JPACertificadosDAO extends JPAGenericDAO<Certificados, String> implements CertificadosDAO{

	public JPACertificadosDAO() {
		super(Certificados.class);
		this.em = Persistence.createEntityManagerFactory("jpa").createEntityManager();
	}

}
