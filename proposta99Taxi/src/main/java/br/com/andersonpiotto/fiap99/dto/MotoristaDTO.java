package br.com.andersonpiotto.fiap99.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/** Classe que DTO representa o dados do <code>Motorista</code>
 * 
 * @author Anderson Piotto
 * @since 24/09/2020
 * @version 1.0.0
 */

@EqualsAndHashCode(of = "id")
@Getter
@Setter
public class MotoristaDTO {
	private Long id;
	
	private String primeiroNome;
	
	private String cpf;
	
	private String genero;
	
	private String cidade;
	
	private CnhDTO cnh;

}
