package br.com.estudandoemcasa.gerenciador.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.estudandoemcasa.gerenciador.models.Professor;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Long> {

}
