package curso.hibernate.ExamenFinal.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import curso.hibernate.ExamenFinal.Models.Vehiculo;

public interface VehiculoRepository extends JpaRepository<Vehiculo, String> {

    List<Vehiculo> findTop3ByOrderByModeloDesc();

}
