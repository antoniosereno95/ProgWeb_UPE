package com.PROGWEB.PROVA2.REPOSITORY;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.PROGWEB.PROVA2.MODEL.Motocicleta;


@Repository
public interface MotocicletaRepository extends CrudRepository<Motocicleta, Long> {

}
