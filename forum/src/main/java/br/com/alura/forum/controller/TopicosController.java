package br.com.alura.forum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.forum.controller.dto.TopicoDto;
import br.com.alura.forum.modelo.Topico;
import br.com.alura.forum.repository.TopicoRepository;

@RestController
public class TopicosController {
	
	@Autowired
	private TopicoRepository topicoRepository;
	
	@RequestMapping("/topicos")
	public List<TopicoDto> listar() {
		//// lista em memória
		//Topico topico = new Topico("Dúvida", "Dúvida com Spring", new Curso("Spring", "Programação"));
		//return Topico.converter(Arrays.asList(topico, topico, topico));
		List<Topico> topicos = topicoRepository.findAll();
		
		return Topico.converter(topicos);
	}
}
