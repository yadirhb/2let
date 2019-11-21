package edu.mum.cs.waa.service.impl;

import edu.mum.cs.waa.domain.Category;
import edu.mum.cs.waa.domain.Item;
import edu.mum.cs.waa.repository.ItemRepository;
import edu.mum.cs.waa.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ItemServiceImpl implements ItemService {

	@Autowired
	private ItemRepository itemRepository;


	@Override
	public Item save(Item item) {
		return itemRepository.save(item);
	}

	@Override
	public List<Item> findAll() {
		return (List<Item>)itemRepository.findAll();
	}

	@Override
	public Item findById(Long id) {
		return (Item)itemRepository.findOne(id);
	}

	@Override
	public void deleteById(Long id) {
		itemRepository.delete(id);
	}
}
