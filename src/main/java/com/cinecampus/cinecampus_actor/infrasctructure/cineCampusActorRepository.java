package com.cineCampus.cinecampus_actor.infrasctructure;

import com.cineCampus.cinecampus_actor.domain.models.cineCampusActor;
import java.util.List;
import java.util.Optional;

public interface cineCampusActorRepository {
    void save(cineCampusActor cineCampusActor);
    void update(cineCampusActor cineCampusActor);
    Optional<cineCampusActor> findById(int id);
    void delete(int id);
    List<cineCampusActor> findAll();
}
