package br.com.andersonpiotto.fiap99.util;

import org.springframework.stereotype.Component;

import br.com.andersonpiotto.fiap99.dto.CnhDTO;
import br.com.andersonpiotto.fiap99.dto.MotoristaDTO;
import br.com.andersonpiotto.fiap99.model.CNH;
import br.com.andersonpiotto.fiap99.model.Motorista;

/** Classe que representa um conversor de objetos para o <code>Motorista</code>
 * 
 * @author Anderson Piotto
 * @since 24/09/2020
 * @version 1.0.0
 */

@Component
public class MotoristaConverter {
	
	public Motorista convertToMotorista(MotoristaDTO motoristaDTO) {
		Motorista motorista = new Motorista();
		motorista.setPrimeiroNome(motoristaDTO.getPrimeiroNome());
		
		CNH cnh = new CNH();
		cnh.setAtiva(motoristaDTO.getCnh().isAtiva());
		cnh.setNumero(motoristaDTO.getCnh().getNumero());
		
		motorista.setCnh(cnh);
		motorista.setCpf(motoristaDTO.getCpf());
		motorista.setGenero(motoristaDTO.getGenero());
		motorista.setCidade(motoristaDTO.getCidade());
		return motorista;
	}
	
	public MotoristaDTO convertToMotoristaDTO(Motorista motorista) {
		MotoristaDTO motoristaDTO = new MotoristaDTO();
		motoristaDTO.setId(motorista.getId());
		motoristaDTO.setPrimeiroNome(motorista.getPrimeiroNome());
		
		CnhDTO cnhDTO = new CnhDTO();
		cnhDTO.setId(motorista.getCnh().getId());
		cnhDTO.setAtiva(motorista.getCnh().isAtiva());
		cnhDTO.setNumero(motorista.getCnh().getNumero());
		
		motoristaDTO.setCnh(cnhDTO);
		motoristaDTO.setCpf(motorista.getCpf());
		motoristaDTO.setGenero(motorista.getGenero());
		motoristaDTO.setCidade(motorista.getCidade());
		return motoristaDTO;
	}

}
