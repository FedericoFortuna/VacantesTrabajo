package asap.fortuna.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import asap.fortuna.model.Categoria;
import asap.fortuna.model.Vacante;

@Service
public class CategoriasServiceImpl implements ICategoriaService {

	private List<Categoria> lista = null;

	public CategoriasServiceImpl() {

		this.lista = new LinkedList<>();
		Categoria c1 = new Categoria();
		c1.setId(1);
		c1.setDescr("Descripcion Ventas");
		c1.setNombre("Ventas");

		Categoria c2 = new Categoria();
		c2.setId(2);
		c2.setDescr("Descripcion Contabilidad");
		c2.setNombre("Contabilidad");

		Categoria c3 = new Categoria();
		c3.setId(3);
		c3.setDescr("Descripcion Informatica");
		c3.setNombre("Informatica");

		Categoria c4 = new Categoria();
		c4.setId(4);
		c4.setDescr("Descripcion Transporte");
		c4.setNombre("Transporte");

		Categoria c5 = new Categoria();
		c5.setId(5);
		c5.setDescr("Descripcion Construccion");
		c5.setNombre("Construccion");
		
		Categoria c6 = new Categoria();
		c6.setId(6);
		c6.setDescr("Descripcion Diseño");
		c6.setNombre("Diseño");

		lista.add(c1);
		lista.add(c2);
		lista.add(c3);
		lista.add(c4);
		lista.add(c5);
		lista.add(c6);
	}

	@Override
	public void guardar(Categoria categoria) {
		lista.add(categoria);

	}

	@Override
	public List<Categoria> buscarTodas() {
		return lista;
	}

	@Override
	public Categoria buscarPorId(Integer idCategoria) {
		for (Categoria categoria : lista) {
			if (categoria.getId() == idCategoria) {
				return categoria;
			}
		}
		return null;
	}

	@Override
	public void eliminarPorId(Integer idCategoria) {
		// TODO Auto-generated method stub
		
	}

}
