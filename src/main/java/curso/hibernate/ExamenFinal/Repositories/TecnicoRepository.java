package curso.hibernate.ExamenFinal.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import curso.hibernate.ExamenFinal.Models.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer> {

    List<Tecnico> findAllByOrderByContactoDesc();

}
