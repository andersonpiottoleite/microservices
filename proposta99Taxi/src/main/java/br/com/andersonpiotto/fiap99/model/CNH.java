package br.com.andersonpiotto.fiap99.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/** Classe que representa a CNH do <code>Motorista</code>
 * 
 * @author Anderson Piotto
 * @since 24/09/2020
 * @version 1.0.0
 */

@EqualsAndHashCode(of = "id")
@Getter
@Setter
@Entity
public class CNH {
	
	@Id @GeneratedValue
	private Long id;
	
	private String numero;
	
	private boolean ativa;
}
