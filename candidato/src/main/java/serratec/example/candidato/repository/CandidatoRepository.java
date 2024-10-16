package serratec.example.candidato.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import serratec.example.candidato.model.Candidato;
import serratec.example.candidato.model.Escolaridade;
import serratec.example.candidato.model.Vaga;


public interface CandidatoRepository extends JpaRepository<Candidato, Long>{ 
	List<Candidato> findByCpfIgnoreCase(String cpf);
	List<Candidato> findByNomeIgnoreCase(String nome);
    List<Candidato> findByVagaDesejada(Vaga vagaDesejada);
    List<Candidato> findByEscolaridade(Escolaridade escolaridade);
	
}
