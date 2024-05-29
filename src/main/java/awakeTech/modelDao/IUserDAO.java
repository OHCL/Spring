package awakeTech.modelDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import awakeTech.Spring.modelos.user;

@Repository
public interface IUserDAO extends JpaRepository<user, Long> {
}
