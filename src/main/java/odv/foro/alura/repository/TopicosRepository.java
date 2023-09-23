 package odv.foro.alura.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import odv.foro.alura.modelo.Topico;
@Repository
public interface TopicosRepository extends JpaRepository<Topico, Long>{

}
