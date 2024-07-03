package com.cinecampus.cinecampus_format.domain.models;

public class cineCampusFormat {

    private int id_formato;
    private String descripcion;

    public cineCampusFormat() {
    }
    
    public cineCampusFormat(int id_formato, String descripcion) {
        this.id_formato = id_formato;
        this.descripcion = descripcion;
    }
    public cineCampusFormat(String descripcion) {
        this.descripcion = descripcion;
    }
    public int getId_formato() {
        return id_formato;
    }
    public void setId_formato(int id_formato) {
        this.id_formato = id_formato;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}