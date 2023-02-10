package br.com.ProgWeb.CarDataBase.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import br.com.ProgWeb.CarDataBase.Model.Owner;

@Service
public interface OwnerRepository extends CrudRepository<Owner, Long>{

}