package odv.foro.alura.modelo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;
import odv.foro.alura.dto.DtoTopico;



@Table(name = "topicos")
@Entity(name = "Topico")
@Getter
@Setter
public class Topico {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String titulo;
	private String mensaje;
	@Temporal(TemporalType.TIMESTAMP)
	private LocalDateTime fecha_creacion; 
	@Enumerated(EnumType.STRING)
	private StatusTopico status;
	
	private Integer usuario_id;
	private Integer curso_id;
	
	
	//private List<Respuesta> respuestas = new ArrayList<>();
	@PrePersist
    protected void onCreate() {
        fecha_creacion = LocalDateTime.now();
    }
	
	public Topico() {
		
	}
	public Topico(String titulo, String mensaje) {
		this.titulo = titulo;
		this.mensaje = mensaje;
		//this.curso = curso;
	}

	public Topico(DtoTopico dtoTop) {
		this.titulo = dtoTop.titulo();
		this.mensaje=dtoTop.mensaje();
		this.status = dtoTop.status();
		this.fecha_creacion= dtoTop.fecha_creacion();
		this.curso_id= dtoTop.curso_id();
		this.usuario_id = dtoTop.usuario_id();
		
		
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Topico other = (Topico) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
