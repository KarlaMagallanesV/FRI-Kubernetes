package pe.edu.vallegrande.karla_persona_rest.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import pe.edu.vallegrande.karla_persona_rest.model.Persona;
import reactor.core.publisher.Flux;

public interface PersonaRepository extends ReactiveCrudRepository<Persona, Long> {
}
