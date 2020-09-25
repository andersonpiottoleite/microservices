package br.com.andersonpiotto.fiap99.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/** Classe DTO que representa a <code>CNH</code> do <code>Motorista</code>
 * 
 * @author Anderson Piotto
 * @since 24/09/2020
 * @version 1.0.0
 */


@EqualsAndHashCode(of = "id")
@Getter
@Setter
public class CnhDTO {

	private Long id;

	private String numero;

	private boolean ativa;

}
