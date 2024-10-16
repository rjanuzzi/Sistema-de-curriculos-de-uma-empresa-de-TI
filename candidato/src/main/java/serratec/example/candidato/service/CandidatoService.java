package serratec.example.candidato.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import serratec.example.candidato.dto.CandidatoDto;
import serratec.example.candidato.model.Candidato;
import serratec.example.candidato.model.Escolaridade;
import serratec.example.candidato.model.Vaga;
import serratec.example.candidato.repository.CandidatoRepository;



@Service
public class CandidatoService {

    @Autowired
    private CandidatoRepository repositorio;

    public List<CandidatoDto> obterTodos() {
        return repositorio.findAll().stream()
            .map(CandidatoDto::toDto)
            .toList();
    }

    public Optional<CandidatoDto> obterPorId(Long id) {
        return repositorio.findById(id)
            .map(CandidatoDto::toDto);
    }

    public CandidatoDto salvarCandidato(CandidatoDto dto) {
        Candidato candidatoEntity = repositorio.save(dto.toEntity());
        return CandidatoDto.toDto(candidatoEntity);
    }

    public boolean apagarCandidato(Long id) {
        if (!repositorio.existsById(id)) {
            return false;
        }
        repositorio.deleteById(id);
        return true;
    }

    public Optional<CandidatoDto> alterarCandidato(Long id, CandidatoDto dto) {
        if (!repositorio.existsById(id)) {
            return Optional.empty();
        }
        Candidato candidatoEntity = dto.toEntity();
        candidatoEntity.setId(id);
        repositorio.save(candidatoEntity);
        return Optional.of(CandidatoDto.toDto(candidatoEntity));
    }

    public List<CandidatoDto> obterPorNome(String nome) {
        List<Candidato> candidatos = repositorio.findByNomeIgnoreCase(nome);
        return candidatos.stream()
            .map(CandidatoDto::toDto)
            .toList();
    }

    public List<CandidatoDto> obterPorCpf(String cpf) {
        List<Candidato> candidatos = repositorio.findByCpfIgnoreCase(cpf);
        return candidatos.stream()
            .map(CandidatoDto::toDto)
            .toList();
    }

    public List<CandidatoDto> obterPorVaga(Vaga vaga) {
        List<Candidato> candidatos = repositorio.findByVagaDesejada(vaga);
        return candidatos.stream()
            .map(CandidatoDto::toDto)
            .toList();
    }

    public List<CandidatoDto> obterPorEscolaridade(Escolaridade escolaridade) {
        List<Candidato> candidatos = repositorio.findByEscolaridade(escolaridade);
        return candidatos.stream()
            .map(CandidatoDto::toDto)
            .toList();
    }
}