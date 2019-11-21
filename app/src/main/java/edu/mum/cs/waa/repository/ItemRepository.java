package edu.mum.cs.waa.repository;

import edu.mum.cs.waa.domain.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends CrudRepository<Item, Long> {
  
}
