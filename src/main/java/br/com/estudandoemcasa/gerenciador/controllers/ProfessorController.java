package br.com.estudandoemcasa.gerenciador.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.estudandoemcasa.gerenciador.dto.ProfessorDTO;
import br.com.estudandoemcasa.gerenciador.models.Professor;
import br.com.estudandoemcasa.gerenciador.repository.ProfessorRepository;

@Controller
public class ProfessorController {

	@Autowired
	private ProfessorRepository professorRepository;

	@GetMapping("/professores")
	public ModelAndView index() {

		List<Professor> professores = professorRepository.findAll();

		ModelAndView mv = new ModelAndView("professores/index");
		mv.addObject("professores", professores);
		return mv;
	}

	@GetMapping("/professor/new")
	public String enew() {
		return "professores/new";
	}

	@PostMapping("/professores")
	public String create(@Valid ProfessorDTO professorDto, BindingResult bindResult) {
		if (!bindResult.hasErrors()) {
			Professor professor = professorDto.toProfessor();
			professorRepository.save(professor);
			return "redirect:/professores";
		} else {
			return "redirect:/professor/new";
		}
	}

}
