package com.cinecampus.cinecampus_format.infrasctructure;

import java.util.List;
import java.util.Optional;

import com.cinecampus.cinecampus_format.domain.models.cineCampusFormat;

public interface cineCampusFormatRepository {
    void save(cineCampusFormat cinecampusformat);
    void update(cineCampusFormat cinecampusformat);
    Optional<cineCampusFormat> findById(int id_formato);
    void delete(int id_formato);
    List<cineCampusFormat>findAll();
    
}