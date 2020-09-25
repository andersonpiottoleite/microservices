package br.com.andersonpiotto.fiap99.bo;

import org.springframework.stereotype.Component;

import br.com.andersonpiotto.fiap99.model.CNH;

/** Classe que representa a camada de negócios da aplicação
 * 
 * @author Anderson Piotto
 * @since 24/09/2020
 * @version 1.0.0
 */

@Component
public class MotoristaBusinessObject {
	
	public boolean validaCnhAtiva(CNH cnh) {
		if (cnh.isAtiva()) {
			return true;
		}
		return false;
	}

}
