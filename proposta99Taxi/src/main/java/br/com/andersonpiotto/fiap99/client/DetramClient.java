package br.com.andersonpiotto.fiap99.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import br.com.andersonpiotto.fiap99.dto.MotoristaDTO;

/** Classe que representa o client de Motorista
 * 
 * @author Anderson Piotto
 * @since 24/09/2020
 * @version 1.0.0
 */

@Component
public class DetramClient {
	
	@Value("${detram.api.get.motorista}")
	private String urlgetMotorista;
	
	public MotoristaDTO getDadosMotorista(String numeroCNH) {
		if(numeroCNH == null || numeroCNH.isEmpty()) {
			throw new IllegalArgumentException("Numero CNH não informado!");
		}
		
		RestTemplate restTemplate = new RestTemplate();
		String url = urlgetMotorista+numeroCNH; 
		ResponseEntity<MotoristaDTO> response = restTemplate.exchange(url, HttpMethod.GET, new HttpEntity<>(getHeaders()), MotoristaDTO.class);
		
		return response.getBody();
	}
	 
	private HttpHeaders getHeaders() {
	        HttpHeaders headers = new HttpHeaders();
	        headers.setContentType(MediaType.APPLICATION_JSON);
	        headers.setAccept(List.of(MediaType.APPLICATION_JSON));
	        return headers;
	}

}
