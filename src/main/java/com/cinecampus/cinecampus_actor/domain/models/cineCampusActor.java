package com.cineCampus.cinecampus_actor.domain.models;

public class cineCampusActor {
    private int id;
    private String ActorName;
    private int ActorAge;
    private String ActorNation;
    private int genreId;

    public cineCampusActor(String ActorName, int ActorAge, int idPlane, String ActorNation, int genreId) {
        this.ActorName = ActorName;
        this.ActorAge = ActorAge;
        this.idPlane = idPlane;
        this.ActorNation = ActorNation;
        this.genreId = genreId;
    }

    public cineCampusActor(int id, String ActorName, int ActorAge, int idPlane, String ActorNation, int genreId) {
        this.id = id;
        this.ActorName = ActorName;
        this.ActorAge = ActorAge;
        this.idPlane = idPlane;
        this.ActorNation = ActorNation;
        this.genreId = genreId;
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

    public int getgenreId() {
        return genreId;
    }

    public void setgenreId(int genreId) {
        this.genreId = genreId;
    }
}
