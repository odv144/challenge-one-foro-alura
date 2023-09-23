package odv.foro.alura.modelo;

public record DtoListadoTop(String titulo, String mensaje) {
	public DtoListadoTop(Topico topico) {
		this(topico.getTitulo(),topico.getMensaje());
	}

}
