package odv.foro.alura.usuario;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import odv.foro.alura.modelo.Topico;
import odv.foro.alura.usuario.dto.DtoPostUser;

@Table(name = "usuarios")
@Entity(name = "Usuario")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of="id")
public class Usuario {
	public Usuario(@Valid DtoPostUser dtoPostUser) {
		this.nombre = dtoPostUser.nombre();
		this.email = dtoPostUser.email();
		this.contrasena = dtoPostUser.contrasena();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private String email;
	private String contrasena;
	
	@ManyToOne
	@JoinColumn(name="topico_id")
	private Topico topico;

}
