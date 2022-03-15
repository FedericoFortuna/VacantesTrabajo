package asap.fortuna.service.db;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import asap.fortuna.model.Usuario;
import asap.fortuna.repository.UsuariosRepository;
import asap.fortuna.service.IUsuariosService;

@Service
public class UsuariosServiceJPA implements IUsuariosService {
	
	@Autowired
	UsuariosRepository usuariosRepository;
	
	
	public void guardar(Usuario usuario) {
		usuariosRepository.save(usuario);
	}

	public void eliminar(Integer idUsuario) {
		usuariosRepository.deleteById(idUsuario);
	}

	public List<Usuario> buscarTodos() {
		return usuariosRepository.findAll();
	}

}
