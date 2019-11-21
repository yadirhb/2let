package edu.mum.cs.waa.service;

import edu.mum.cs.waa.domain.Item;

import java.util.List;

public interface ItemService {

	Item save(Item item);

	List<Item> findAll();

	Item findById(Long id);

	void deleteById(Long id);
}
