package VDcom.Task41.Repository;

import VDcom.Task41.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author Artur Gilyazov
 * Репозиторий для хранения пользователей
 **/


public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findOneById(Long id);
}
