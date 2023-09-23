package odv.foro.alura.usuario.dto;

import odv.foro.alura.usuario.Usuario;

public record DtoGetUser(
		String email,
		String contrasena
		)
{
	public DtoGetUser(Usuario user) {
		this(user.getEmail(),user.getContrasena());
	}
	
}
