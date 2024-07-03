package com.cinecampus.cinecampus_actor.domain.models;

public class cineCampusActor {
    private int id;
    private String ActorName;
    private int ActorAge;
    private String ActorNation;
    private int GenreId;

    public cineCampusActor(String ActorName, int ActorAge, String ActorNation, int GenreId) {
        this.ActorName = ActorName;
        this.ActorAge = ActorAge;
        this.ActorNation = ActorNation;
        this.GenreId = GenreId;
    }

    public cineCampusActor(int id, String ActorName, int ActorAge, String ActorNation, int GenreId) {
        this.id = id;
        this.ActorName = ActorName;
        this.ActorAge = ActorAge;
        this.ActorNation = ActorNation;
        this.GenreId = GenreId;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getActorName() {
        return ActorName;
    }

    public void setActorName(String ActorName) {
        this.ActorName = ActorName;
    }

    public int getActorAge() {
        return ActorAge;
    }

    public void setActorAge(int ActorAge) {
        this.ActorAge = ActorAge;
    }

    public String getActorNation() {
        return ActorNation;
    }

    public void setActorNation(String ActorNation) {
        this.ActorNation = ActorNation;
    }

    public int getGenreId() {
        return GenreId;
    }

    public void setGenreId(int GenreId) {
        this.GenreId = GenreId;
    }
}
