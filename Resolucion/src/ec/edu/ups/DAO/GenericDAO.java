package ec.edu.ups.DAO;

import java.util.List;

import ec.edu.ups.Entidades.Usuario;

public interface GenericDAO<T,ID> {
	
	public void create(T entity);

	public T read(ID id);
	
	public void update(T entity);

	public void delete(T entity);
	
	public List<T> find();
	
	void deleteById(ID id);
	
	public List<Usuario> buscarCorreo(String correo);
	
	Usuario buscar(String email, String contrasena);

}
