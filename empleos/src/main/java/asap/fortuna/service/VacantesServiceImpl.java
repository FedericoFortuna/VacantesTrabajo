package asap.fortuna.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import asap.fortuna.model.Vacante;

@Service
public class VacantesServiceImpl implements IVacanteService {

	private List<Vacante> lista = null;

	public VacantesServiceImpl() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		this.lista = new LinkedList<>();
		try {
			Vacante v1 = new Vacante();
			v1.setId(1);
			v1.setNombre("Ingeniero Civil");
			v1.setDescr("Solicitamos Ing. Civil para diseñar puente peatonal.");
			v1.setFecha(sdf.parse("08-02-2019"));
			v1.setSalario(14000.0);
			v1.setDestacado(1);
			v1.setImagen("empresa1.png");
			v1.setEstatus("Aprobada");

			Vacante v2 = new Vacante();
			v2.setId(2);
			v2.setNombre("Contador Publico");
			v2.setDescr("Empresa importante solicita contador con 5 años de experiencia titulado.");
			v2.setFecha(sdf.parse("09-02-2019"));
			v2.setSalario(12000.0);
			v2.setDestacado(0);
			v2.setImagen("empresa2.png");
			v2.setEstatus("Creada");

			Vacante v3 = new Vacante();
			v3.setId(3);
			v3.setNombre("Ingeniero Electrico");
			v3.setDescr(
					"Empresa internacional solicita Ingeniero mecanico para mantenimiento de la instalacion electrica.");
			v3.setFecha(sdf.parse("10-02-2019"));
			v3.setSalario(10500.0);
			v3.setDestacado(0);

			Vacante v4 = new Vacante();
			v4.setId(4);
			v4.setNombre("Diseñador Grafico");
			v4.setDescr("Solicitamos Diseñador Grafico titulado para diseñar publicidad de la empresa.");
			v4.setFecha(sdf.parse("11-02-2019"));
			v4.setSalario(7500.0);
			v4.setDestacado(1);
			v4.setImagen("empresa3.png");

			lista.add(v1);
			lista.add(v2);
			lista.add(v3);
			lista.add(v4);
		} catch (ParseException e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public List<Vacante> buscarTodas() {

		return lista;
	}

	@Override
	public Vacante buscarPorId(Integer idVacante) {
		for (Vacante vacante : lista) {
			if (vacante.getId() == idVacante) {
				return vacante;
			}
		}
		return null;
	}

	@Override
	public void guardar(Vacante vacante) {
		lista.add(vacante);
		
	}

	@Override
	public List<Vacante> buscarDestacadas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminarPorId(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Vacante> buscarByExample(Example<Vacante> example) {
		// TODO Auto-generated method stub
		return null;
	}

}
