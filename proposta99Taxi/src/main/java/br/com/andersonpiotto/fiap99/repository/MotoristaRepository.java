package br.com.andersonpiotto.fiap99.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.andersonpiotto.fiap99.model.Motorista;

/** Classe que representa um repository do <code>Motorista</code>
 * 
 * @author Anderson Piotto
 * @since 24/09/2020
 * @version 1.0.0
 */

@Repository
public interface MotoristaRepository extends CrudRepository<Motorista, Long>{

}
