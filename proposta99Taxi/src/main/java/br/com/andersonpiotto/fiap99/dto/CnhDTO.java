package br.com.andersonpiotto.fiap99.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode(of = "id")
@Getter
@Setter
public class CnhDTO {

	private Long id;

	private String numero;

	private boolean ativa;

}
