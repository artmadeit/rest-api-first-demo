package pe.edu.cibertec.boletas;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface BoletaRepository extends CrudRepository<Boleta, Long> {

    List<Boleta> findAll();
}
