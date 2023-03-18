package security.oauth.repository.user;

import org.springframework.data.jpa.repository.JpaRepository;
import security.oauth.domain.user.Users;

import java.util.Optional;

public interface UserRepository extends JpaRepository<Users, Long> {
    Optional<Users> findByEmail(String email);
}
