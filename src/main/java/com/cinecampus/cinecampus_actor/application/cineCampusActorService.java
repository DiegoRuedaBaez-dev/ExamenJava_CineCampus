package com.cineCampus.cinecampus_actor.infrasctructure;

import com.cineCampus.cinecampus_actor.domain.models.cineCampusActor;
import com.cineCampus.cinecampus_actor.infrasctructure.cineCampusActorRepository;

import java.util.List;
import java.util.Optional;

public class cineCampusActorService {
    private final cineCampusActorRepository cineCampusActorRepository;

    public cineCampusActorService(cineCampusActorRepository cineCampusActorRepository) {
        this.cineCampusActorRepository = cineCampusActorRepository;
    }

    public void createcineCampusActor(cineCampusActor cineCampusActor) {
        cineCampusActorRepository.save(cineCampusActor);
    }

    public void updatecineCampusActor(cineCampusActor cineCampusActor) {
        cineCampusActorRepository.update(cineCampusActor);
    }

    public Optional<cineCampusActor> getcineCampusActorById(int id) {
        return cineCampusActorRepository.findById(id);
    }

    public void deletecineCampusActor(int id) {
        cineCampusActorRepository.delete(id);
    }

    public List<cineCampusActor> getAllcineCampusActors() {
        return cineCampusActorRepository.findAll();
    }
}
