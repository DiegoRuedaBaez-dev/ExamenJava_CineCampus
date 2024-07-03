package com.cinecampus.cinecampus_actor.infrasctructure;

import com.cinecampus.cinecampus_actor.domain.models.cineCampusActor;
import java.util.List;
import java.util.Optional;

public interface cinecampusActorRepository {
    void save(cineCampusActor cinecampusActor);
    void update(cineCampusActor cinecampusActor);
    Optional<cineCampusActor> findById(int id);
    void delete(int id);
    List<cineCampusActor> findAll();
}
