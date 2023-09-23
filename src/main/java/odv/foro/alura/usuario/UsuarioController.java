package odv.foro.alura.usuario;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import odv.foro.alura.usuario.dto.DtoGetUser;
import odv.foro.alura.usuario.dto.DtoPostUser;

@RestController
@RequestMapping("/user")
public class UsuarioController {

	@Autowired
	private UsuariosRepository repository;
	
	@GetMapping
	//no deberia devolver todos sino uno solo segun info recuperada
	public List<DtoGetUser>Leer(){
		return repository.findAll().stream().map(DtoGetUser::new).toList();
		
	}
	
	@PostMapping
	public void Guardar(@RequestBody @Valid DtoPostUser dtoPostUser) {
		//System.out.println(dtoTop);
		
		repository.save(new Usuario(dtoPostUser));
		
	}
	
}
