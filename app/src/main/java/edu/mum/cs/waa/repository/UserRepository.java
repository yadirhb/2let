package edu.mum.cs.waa.repository;

import edu.mum.cs.waa.domain.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {

    @Query("SELECT user FROM users user where user.username=:username OR user.email = :username")
    User findByUsernameOrEmail(String username);

    User findUserByEmail(String email);

    User findUserByUsername(String username);
}
