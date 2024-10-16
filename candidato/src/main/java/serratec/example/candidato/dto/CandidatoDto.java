package serratec.example.candidato.dto;

import java.time.LocalDate;

import serratec.example.candidato.model.Candidato;
import serratec.example.candidato.model.Escolaridade;
import serratec.example.candidato.model.StatusCurriculo;
import serratec.example.candidato.model.Vaga;

public record CandidatoDto(
		 Long id,
		 String cpf,
		 String nome,
		 Vaga vagaDesejada,
		 StatusCurriculo statusCurriculo,
		 Escolaridade escolaridade,
		 LocalDate dataNascimento
		) {
	
	public Candidato toEntity() { 
		Candidato candidato = new Candidato();
		candidato.setId(this.id);
		candidato.setCpf(this.cpf);
		candidato.setNome(this.nome);
		candidato.setVagaDesejada(this.vagaDesejada);
		candidato.setStatusCurriculo(this.statusCurriculo);
		candidato.setEscolaridade(this.escolaridade);
		candidato.setDataNascimento(this.dataNascimento);
		
        return candidato;
	}
	
	public static CandidatoDto toDto(Candidato candidato) { 
		return new CandidatoDto(candidato.getId(), candidato.getCpf(), candidato.getNome(), 
				candidato.getVagaDesejada(), candidato.getStatusCurriculo(), candidato.getEscolaridade(),
				candidato.getDataNascimento());
				
	}
	
	
}