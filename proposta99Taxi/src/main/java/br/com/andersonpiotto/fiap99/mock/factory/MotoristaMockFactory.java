package br.com.andersonpiotto.fiap99.mock.factory;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import br.com.andersonpiotto.fiap99.dto.CnhDTO;
import br.com.andersonpiotto.fiap99.dto.MotoristaDTO;
import br.com.andersonpiotto.fiap99.model.CNH;

/** Classe que representa uma fabrica de Motorista mockados, para sumular os dados do DETRAN
 * 
 * @author Anderson Piotto
 * @since 24/09/2020
 * @version 1.0.0
 */

@Component
public class MotoristaMockFactory {
	
	public MotoristaDTO mockaMotorista(String numeroCNH) {
		Motorista motorista = getMotoristas().get(numeroCNH);
		
		MotoristaDTO motoristaDTO = new MotoristaDTO();
		motoristaDTO.setPrimeiroNome(motorista.getPrimeiroNome());
		motoristaDTO.setCidade(motorista.getCidade());
		motoristaDTO.setCpf(motorista.getCpf());
		motoristaDTO.setGenero(motorista.getGenero());
		CnhDTO cnh = new CnhDTO();
		cnh.setNumero(motorista.getCnh().getNumero());
		cnh.setAtiva(motorista.getCnh().isAtiva());
		motoristaDTO.setCnh(cnh);
		
		return motoristaDTO;
	}
	
	private Map<String, Motorista> getMotoristas(){
		Map<String, Motorista> motoristas = new HashMap<String, Motorista>();
		CNH cnh = new CNH();
		cnh.setAtiva(true);
		cnh.setNumero("88780202910");
		motoristas.put("88780202910", new Motorista(1L, "Vin Diesel", "3561848826", "Masculino", "Rio de Janeiro", cnh));
		
		CNH cnh2 = new CNH();
		cnh2.setAtiva(false);
		cnh2.setNumero("99258316779");
		motoristas.put("99258316779", new Motorista(2L, "The Rock", "3561848826", "Masculino", "Dallas", cnh2));
		
		return motoristas;
	}
	
	private class Motorista{
		public Motorista(Long id, String primeiroNome, String cpf, String genero, String cidade, CNH cnh) {
			this.id = id;
			this.primeiroNome = primeiroNome;
			this.cpf = cpf;
			this.genero = genero;
			this.cidade = cidade;
			this.cnh = cnh;
		}

		private Long id;
		
		private String primeiroNome;
		
		private String cpf;
		
		private String genero;
		
		private String cidade;
		
		private CNH cnh;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getPrimeiroNome() {
			return primeiroNome;
		}

		public void setPrimeiroNome(String primeiroNome) {
			this.primeiroNome = primeiroNome;
		}

		public String getCpf() {
			return cpf;
		}

		public void setCpf(String cpf) {
			this.cpf = cpf;
		}

		public String getGenero() {
			return genero;
		}

		public void setGenero(String genero) {
			this.genero = genero;
		}

		public String getCidade() {
			return cidade;
		}

		public void setCidade(String cidade) {
			this.cidade = cidade;
		}

		public CNH getCnh() {
			return cnh;
		}

		public void setCnh(CNH cnh) {
			this.cnh = cnh;
		}

	}

}
