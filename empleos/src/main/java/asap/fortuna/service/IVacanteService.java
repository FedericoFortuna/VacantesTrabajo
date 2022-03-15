package asap.fortuna.service;

import java.util.List;

import org.springframework.data.domain.Example;

import asap.fortuna.model.Vacante;

public interface IVacanteService {
	List<Vacante> buscarTodas();
	
	Vacante buscarPorId(Integer id);
	
	void guardar(Vacante vacante);
	
	List<Vacante> buscarDestacadas();
	
	void eliminarPorId(Integer id);
	
	List<Vacante> buscarByExample(Example<Vacante> example);
	
	
}
