package edu.mum.cs.waa.repository;

import edu.mum.cs.waa.domain.Role;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {

    @Query("select r from roles r where r.name= :role")
    Role getRoleByRoleName(@Param("role") String role);
}
