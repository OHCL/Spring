package awakeTech.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import awakeTech.Spring.modelos.user;


@Repository
public interface userRepository extends JpaRepository<user, Long> {
}