package asap.fortuna.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import asap.fortuna.model.Usuario;

public interface UsuariosRepository extends JpaRepository<Usuario, Integer> {
	
}
