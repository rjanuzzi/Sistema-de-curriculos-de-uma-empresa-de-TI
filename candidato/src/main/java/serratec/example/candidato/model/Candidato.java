package serratec.example.candidato.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "candidato")

public class Candidato {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String cpf;
	private String nome;
	@Enumerated(EnumType.STRING)
	private Vaga vagaDesejada;
	@Enumerated(EnumType.STRING)
	private StatusCurriculo statusCurriculo;
	@Enumerated(EnumType.STRING)
	private Escolaridade escolaridade;
	private LocalDate dataNascimento;
	public Long getId() {
		return id;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Vaga getVagaDesejada() {
		return vagaDesejada;
	}
	public void setVagaDesejada(Vaga vagaDesejada) {
		this.vagaDesejada = vagaDesejada;
	}
	public StatusCurriculo getStatusCurriculo() {
		return statusCurriculo;
	}
	public void setStatusCurriculo(StatusCurriculo statusCurriculo) {
		this.statusCurriculo = statusCurriculo;
	}
	public Escolaridade getEscolaridade() {
		return escolaridade;
	}
	public void setEscolaridade(Escolaridade escolaridade) {
		this.escolaridade = escolaridade;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

}