package odv.foro.alura.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/he")

public class HelloController {
	
	@GetMapping
	public String HelloWord() {
		return "Hello word! I am programmer";
	}
	
}
