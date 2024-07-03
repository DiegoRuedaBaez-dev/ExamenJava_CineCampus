package com.cinecampus.cinecampus_actor.application;

import com.cinecampus.cinecampus_actor.domain.models.cineCampusActor;
import com.cinecampus.cinecampus_actor.infrasctructure.cinecampusActorRepository;

import java.util.List;
import java.util.Optional;

public class cineCampusActorService {
    private final cinecampusActorRepository cineCampusActorRepository;

    public cineCampusActorService(cinecampusActorRepository cineCampusActorRepository) {
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
