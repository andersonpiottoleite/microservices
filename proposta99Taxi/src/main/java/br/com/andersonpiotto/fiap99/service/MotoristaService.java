package br.com.andersonpiotto.fiap99.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.andersonpiotto.fiap99.client.DetramClient;
import br.com.andersonpiotto.fiap99.dto.MotoristaDTO;
import br.com.andersonpiotto.fiap99.model.Motorista;
import br.com.andersonpiotto.fiap99.repository.MotoristaRepository;
import br.com.andersonpiotto.fiap99.util.MotoristaConverter;

@Service
public class MotoristaService {
	
	@Autowired
	private MotoristaRepository motoristaRepository;
	
	@Autowired
	private DetramClient detramClient;
	
	@Autowired
	private MotoristaConverter motoristaConverter;
	
	public Long cadastra(String numeroCNH) {
		MotoristaDTO motoristaDTO = detramClient.getDadosMotorista(numeroCNH);
		Motorista motorista = motoristaConverter.convertToMotorista(motoristaDTO);
		return motoristaRepository.save(motorista).getId();
	}
	
	public MotoristaDTO getMotorista(Long idMotorista) {
		Optional<Motorista> motorista = motoristaRepository.findById(idMotorista);
		
		if(motorista.isPresent()) {
			return motoristaConverter.convertToMotoristaDTO(motorista.get());
		} else {
			throw new IllegalArgumentException("Motorista não encontrado");
		}
	}
}
