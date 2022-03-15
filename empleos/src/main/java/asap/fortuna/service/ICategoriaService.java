package asap.fortuna.service;

import java.util.List;

import asap.fortuna.model.Categoria;

public interface ICategoriaService {
	void guardar(Categoria categoria);

	List<Categoria> buscarTodas();

	Categoria buscarPorId(Integer idCategoria);

	void eliminarPorId(Integer idCategoria);
}
