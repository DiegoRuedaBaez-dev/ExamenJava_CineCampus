package com.cinecampus.cinecampus_format.application;

import java.util.List;
import java.util.Optional;

import com.cinecampus.cinecampus_format.domain.models.cineCampusFormat;
import com.cinecampus.cinecampus_format.infrasctructure.cineCampusFormatRepository;

public class cineCampusFormatService {
    private final cineCampusFormatRepository cinecampusformatrepository;

    public cineCampusFormatService(cineCampusFormatRepository cinecampusformatrepository) {
        this.cinecampusformatrepository = cinecampusformatrepository;
    }

    public void createFormato(cineCampusFormat cinecampusformat){
        cinecampusformatrepository.save(cinecampusformat);
    }

    public void updateFormato(cineCampusFormat cinecampusformat){
        cinecampusformatrepository.update(cinecampusformat);
    }

    public Optional<cineCampusFormat> findFormat(int id_formato){
        return cinecampusformatrepository.findById(id_formato);
    }

    public void deleteFormato(int id_formato){
        cinecampusformatrepository.delete(id_formato);
    }

    public List<cineCampusFormat> findAllFormats(){
        return cinecampusformatrepository.findAll();
    }
}