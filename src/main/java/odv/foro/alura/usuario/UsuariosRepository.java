package odv.foro.alura.usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UsuariosRepository extends JpaRepository<Usuario, Long>{

}
