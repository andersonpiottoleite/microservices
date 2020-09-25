package br.com.andersonpiotto.fiap99.mock.factory;

import org.springframework.stereotype.Component;

import br.com.andersonpiotto.fiap99.dto.CnhDTO;
import br.com.andersonpiotto.fiap99.dto.MotoristaDTO;

@Component
public class MotoristaMockFactory {
	
	public MotoristaDTO mockaMotorista(String numeroCNH) {
		MotoristaDTO motoristaDTO = new MotoristaDTO();
		
		motoristaDTO.setPrimeiroNome("Vin Diesel");
		motoristaDTO.setCidade("Rio de Janeiro");
		motoristaDTO.setCpf("3561848826");
		motoristaDTO.setGenero("Masculino");
		CnhDTO cnh = new CnhDTO();
		cnh.setNumero(numeroCNH);
		cnh.setAtiva(true);
		motoristaDTO.setCnh(cnh);
		
		return motoristaDTO;
	}

}
