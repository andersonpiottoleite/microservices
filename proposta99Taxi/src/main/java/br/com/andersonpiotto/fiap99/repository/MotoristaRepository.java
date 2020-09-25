package br.com.andersonpiotto.fiap99.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.andersonpiotto.fiap99.model.Motorista;

@Repository
public interface MotoristaRepository extends CrudRepository<Motorista, Long>{

}
