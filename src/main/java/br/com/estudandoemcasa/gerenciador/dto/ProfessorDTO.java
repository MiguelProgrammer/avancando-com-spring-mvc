package br.com.estudandoemcasa.gerenciador.dto;

import java.math.BigDecimal;

import br.com.estudandoemcasa.gerenciador.models.Professor;
import br.com.estudandoemcasa.gerenciador.models.StatusProfessor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/*
 * DTO - Pattern
 */
@Getter
@Setter
@ToString
public class ProfessorDTO {

	private String nome;
	private BigDecimal salario;
	private StatusProfessor statusProfessor;
	
	public Professor toProfessor() {
		Professor professor = new Professor();
		professor.setNome(this.nome);
		professor.setSalario(this.salario);
		professor.setStatusProfessor(this.statusProfessor);
		
		return professor;
		
	}
}
