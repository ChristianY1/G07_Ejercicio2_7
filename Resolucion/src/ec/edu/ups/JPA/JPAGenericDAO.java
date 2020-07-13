package ec.edu.ups.JPA;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

import ec.edu.ups.DAO.GenericDAO;
import ec.edu.ups.Entidades.Usuario;


public class JPAGenericDAO<T,ID> implements GenericDAO<T, ID> {
	
	private Class<T> persistentClass;
    protected EntityManager em;

    public JPAGenericDAO(Class<T> persistentClass) {
	this.persistentClass = persistentClass;
	this.em = Persistence.createEntityManagerFactory("jpa").createEntityManager();
    }

	@Override
	public void create(T entity) {
		em.getTransaction().begin();
		try {
		    em.persist(entity);
		    em.getTransaction().commit();
		} catch (Exception e) {
		    System.out.println(">>>> ERROR:JPAGenericDAO:create " + e);
		    if (em.getTransaction().isActive())
			em.getTransaction().rollback();
		}
		
	}

	@Override
	public T read(ID id) {
		System.out.println("Buscando...");
		return em.find(persistentClass, id);
	}

	@Override
	public void update(T entity) {
		em.getTransaction().begin();
		try {
		    em.merge(entity);
		    em.getTransaction().commit();
		} catch (Exception e) {
		    System.out.println(">>>> ERROR:JPAGenericDAO:update " + e);
		    if (em.getTransaction().isActive())
			em.getTransaction().rollback();
		}
		
	}

	@Override
	public void delete(T entity) {
		em.getTransaction().begin();
		try {
			if (!em.contains(entity)) {
				entity = em.merge(entity);
			}
		    em.remove(entity);
		    em.getTransaction().commit();
		} catch (Exception e) {
		    System.out.println(">>>> ERROR:JPAGenericDAO:delete " + e);
		    if (em.getTransaction().isActive())
			em.getTransaction().rollback();
		}
		
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<T> find() {
		em.getTransaction().begin();
		List<T> lista = null;
		try {
			javax.persistence.criteria.CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
			cq.select(cq.from(persistentClass));
			lista = em.createQuery(cq).getResultList();
			em.getTransaction().commit();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return lista;
	}

	@Override
	public void deleteById(ID id) {
		T entity = this.read(id);
		if (entity != null)
			this.delete(entity);	
	}

	@Override
	public List<Usuario> buscarCorreo(String correo) {
		Query nq = em.createNativeQuery("SELECT * FROM USUARIO where email=?", Usuario.class);
		nq.setParameter(1,  correo);
		return (List<Usuario>) nq.getResultList();
	}

	@Override
	public Usuario buscar(String email, String contrasena) {
		Query nq = em.createNativeQuery("SELECT * FROM USUARIO WHERE email=? AND contrasena=?", Usuario.class);
		nq.setParameter(1, email);
		nq.setParameter(2, contrasena);
		return (Usuario) nq.getSingleResult();
	}

}
