package br.com.estudandoemcasa.gerenciador.dto;

import java.math.BigDecimal;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

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

	@NotBlank
	@NotNull
	private String nome;
	
	@NotNull
	@DecimalMin(value="0.0")
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
