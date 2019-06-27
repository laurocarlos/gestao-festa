package br.com.lapaz.festa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.lapaz.festa.model.Convidado;
import br.com.lapaz.festa.repository.Convidados;

@Controller
@RequestMapping("/convidados")
public class ConvidadosController {
	@Autowired
	private Convidados convidados;

	//	@GetMapping("/convidados")
	//	public String list() {
	//		return "ListaConvidados";
	//	}

	@GetMapping
	public ModelAndView listar() {
		ModelAndView modelAndView = new ModelAndView("ListaConvidados");
		modelAndView.addObject(new Convidado());
		modelAndView.addObject("convidados", convidados.findAll());
		return modelAndView;
	}

	@PostMapping
	public String salvar(Convidado convidado) {
		this.convidados.save(convidado);
		return "redirect:/convidados";
	}
}
