package edu.mum.cs.waa.repository;

import edu.mum.cs.waa.domain.Area;
import edu.mum.cs.waa.domain.Center;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface AreaRepository extends CrudRepository<Area, Long> {
    @Query("select a from Area a where a.id= :id")
    Area findByAreaId(@Param("id") Long areaId);
}
