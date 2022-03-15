package asap.fortuna.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import asap.fortuna.model.Vacante;

public interface VacantesRepository extends JpaRepository<Vacante, Integer> {
	List<Vacante> findByEstatus(String estatus);
	List<Vacante> findByDestacadoAndEstatusOrderByIdDesc(int destacado, String estatus);
	List<Vacante> findBySalarioBetweenOrderBySalarioDesc(double salarioMinimo, double salarioMaximo);
	List<Vacante> findByEstatusIn(String[] estatus);
}
