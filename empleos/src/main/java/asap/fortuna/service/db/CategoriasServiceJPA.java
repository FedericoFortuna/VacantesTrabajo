package asap.fortuna.service.db;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import asap.fortuna.model.Categoria;
import asap.fortuna.repository.CategoriasRepository;
import asap.fortuna.service.ICategoriaService;

@Primary
@Service
public class CategoriasServiceJPA implements ICategoriaService {
	
	@Autowired
	private CategoriasRepository categoriasRepository;
	
	@Override
	public void guardar(Categoria categoria) {
		categoriasRepository.save(categoria);
	}

	@Override
	public List<Categoria> buscarTodas() {
		return categoriasRepository.findAll();
	}

	@Override
	public Categoria buscarPorId(Integer idCategoria) {
		Optional<Categoria> optional = categoriasRepository.findById(idCategoria);
		if(optional.isPresent()) {
			return optional.get();
		}
		return null;
	}

	@Override
	public void eliminarPorId(Integer idCategoria) {
		categoriasRepository.deleteById(idCategoria);
		
	}

}
