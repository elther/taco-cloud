package ugemang.takocloud.repository.user;

import org.springframework.data.repository.CrudRepository;
import ugemang.takocloud.domain.user.User;

public interface UserRepository extends CrudRepository<User,Long> {
    User findByUsername(String username);
}
