package br.com.andersonpiotto.fiap99.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/** Classe que representa Motorista
 * 
 * @author Anderson Piotto
 * @since 24/09/2020
 * @version 1.0.0
 */

@EqualsAndHashCode(of = "id")
@Getter
@Setter
@Entity
public class Motorista {
	
	@Id @GeneratedValue
	private Long id;
	
	private String primeiroNome;
	
	private String cpf;
	
	private String genero;
	
	private String cidade;
			
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="ID_CNH")
	private CNH cnh;
}
