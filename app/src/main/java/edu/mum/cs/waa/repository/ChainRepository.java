package edu.mum.cs.waa.repository;

import edu.mum.cs.waa.domain.Area;
import edu.mum.cs.waa.domain.Chain;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface ChainRepository extends CrudRepository<Chain, Long> {
    @Query("select ch from Chain ch where ch.id= :id")
    Chain findByChainId(@Param("id") Long chainId);
}
