package br.com.estudandoemcasa.gerenciador.models;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity  
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Professor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Getter @Setter private Long id;
	
	@Column(nullable = false)
	@Getter @Setter private String nome;
	@Getter @Setter private BigDecimal salario;
	
	@Enumerated(EnumType.STRING)
	@Getter @Setter private StatusProfessor statusProfessor; 
	
}
