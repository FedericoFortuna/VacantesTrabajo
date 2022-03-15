package asap.fortuna.service.db;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import asap.fortuna.model.Vacante;
import asap.fortuna.repository.VacantesRepository;
import asap.fortuna.service.IVacanteService;

@Primary
@Service
public class VacantesServiceJPA implements IVacanteService {

	@Autowired
	private VacantesRepository vacantesRepository;

	@Override
	public List<Vacante> buscarTodas() {
		return vacantesRepository.findAll();
	}

	@Override
	public Vacante buscarPorId(Integer id) {
		Optional<Vacante> optional = vacantesRepository.findById(id);
		if (optional.isPresent()) {
			return optional.get();
		}
		return null;
	}

	@Override
	public void guardar(Vacante vacante) {
		vacantesRepository.save(vacante);

	}

	@Override
	public List<Vacante> buscarDestacadas() {
		return vacantesRepository.findByDestacadoAndEstatusOrderByIdDesc(1, "Aprobada");
	}

	@Override
	public void eliminarPorId(Integer id) {
		vacantesRepository.deleteById(id);
		
	}

	@Override
	public List<Vacante> buscarByExample(Example<Vacante> example) {
		
		return vacantesRepository.findAll(example);
	}

}
