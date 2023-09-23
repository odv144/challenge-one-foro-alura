package odv.foro.alura.curso;


import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import odv.foro.alura.dto.DtoTopico;
import odv.foro.alura.modelo.DtoListadoTop;
import odv.foro.alura.modelo.Topico;
import odv.foro.alura.repository.TopicosRepository;

@RestController
@RequestMapping("/topico")
public class CursoController {

	@Autowired
	private TopicosRepository repository;
	
	@GetMapping
	public Page<DtoListadoTop>Leer(@PageableDefault(size=5, sort="titulo") Pageable paginacion){
		return repository.findAll(paginacion).map(DtoListadoTop::new);
		
	}
	
	@PostMapping
	public void Guardar(@RequestBody @Valid DtoTopico dtoTop) {
		System.out.println(dtoTop);
		
		repository.save(new Topico(dtoTop));
		
	}
	
}
