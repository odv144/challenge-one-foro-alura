package odv.foro.alura.dto;

import java.time.LocalDateTime;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import odv.foro.alura.modelo.StatusTopico;

public record DtoTopico(
		@NotNull
		String titulo, 
		
		@NotBlank
		String mensaje,
		
		LocalDateTime fecha_creacion, 
		StatusTopico status,
		Integer usuario_id,
		Integer curso_id
		
		) {

	

}
