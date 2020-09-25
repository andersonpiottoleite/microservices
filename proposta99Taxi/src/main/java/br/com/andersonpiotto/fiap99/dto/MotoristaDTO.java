package br.com.andersonpiotto.fiap99.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

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
