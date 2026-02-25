package curso.hibernate.ExamenFinal.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import curso.hibernate.ExamenFinal.Models.Revision;
import curso.hibernate.ExamenFinal.Models.Tecnico;
import curso.hibernate.ExamenFinal.Models.Vehiculo;
import curso.hibernate.ExamenFinal.Repositories.RevisionRepository;
import curso.hibernate.ExamenFinal.Repositories.TecnicoRepository;
import curso.hibernate.ExamenFinal.Repositories.VehiculoRepository;

@RestController
@RequestMapping("/examen")
public class ResolverA {

    private final VehiculoRepository vehiculoRepository;
    private final TecnicoRepository tecnicoRepository;
    private final RevisionRepository revisionRepository;

    public ResolverA(VehiculoRepository vehiculoRepository, TecnicoRepository tecnicoRepository,
            RevisionRepository revisionRepository) {
        this.vehiculoRepository = vehiculoRepository;
        this.tecnicoRepository = tecnicoRepository;
        this.revisionRepository = revisionRepository;
    }

    @GetMapping("/pregunta_a")
    public List<Vehiculo> pregunta_a() {
        return vehiculoRepository.findTop3ByOrderByModeloDesc();
    }

    @GetMapping("/pregunta_b")
    public List<Tecnico> pregunta_b() {
        return tecnicoRepository.findAllByOrderByContactoDesc();
    }

    @GetMapping("/pregunta_c")
    public List<Revision> pregunta_c() {
        return revisionRepository.findAll();
    }

}
