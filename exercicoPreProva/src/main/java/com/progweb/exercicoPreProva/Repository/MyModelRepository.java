package com.progweb.exercicoPreProva.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.progweb.exercicoPreProva.Model.MyModel;

public interface MyModelRepository extends JpaRepository<MyModel, Long> {


}
