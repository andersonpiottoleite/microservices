package br.com.andersonpiotto.fiap99.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.andersonpiotto.fiap99.mock.factory.MotoristaMockFactory;
import br.com.andersonpiotto.fiap99.service.MotoristaService;

/** Classe que representa o Controler do <code>Motorista</code>
 * 
 * @author Anderson Piotto
 * @since 24/09/2020
 * @version 1.0.0
 */

@RestController
@RequestMapping("/api/v1") 
public class MotoristaController {
	
	@Autowired
	private MotoristaService motoristaService;
	
	@Autowired 
	private MotoristaMockFactory motoristaMockFactory;
	
	@GetMapping("/mock-detram/motorista/{numeroCNH}")
	public ResponseEntity<?> getDadosMockadosMotoristaDetram(@PathVariable("numeroCNH") String numeroCNH){
		try {
			return ResponseEntity.ok(motoristaMockFactory.mockaMotorista(numeroCNH));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
		}
	}
	
	@PostMapping("/motorista/{numeroCNH}")
	public ResponseEntity<?> cadastraMotoristaNoDetram(@PathVariable("numeroCNH") String numeroCNH){
		try {
			return ResponseEntity.ok(motoristaService.cadastra(numeroCNH));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
		}
	}
	
	@GetMapping("/motorista/{idMotorista}")
	public ResponseEntity<?> getMotorista(@PathVariable("idMotorista") Long idMotorista){
		try {
			return ResponseEntity.ok(motoristaService.getMotorista(idMotorista));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
		}
	}

}
