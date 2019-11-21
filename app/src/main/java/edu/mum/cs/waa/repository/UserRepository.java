package edu.mum.cs.waa.repository;

import edu.mum.cs.waa.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {

    User findByEmail(String email);

    User findUserByUsername(String username);
}
