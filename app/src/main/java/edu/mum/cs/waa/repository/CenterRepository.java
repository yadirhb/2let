package edu.mum.cs.waa.repository;

import edu.mum.cs.waa.domain.Center;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface CenterRepository extends CrudRepository<Center,Long> {
    @Query("select c from Center c where c.id= :id")
    Center findByCenterId(@Param("id") Long centerId);
}
