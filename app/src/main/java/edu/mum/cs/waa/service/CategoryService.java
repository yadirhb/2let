package edu.mum.cs.waa.service;

import edu.mum.cs.waa.domain.Category;
import edu.mum.cs.waa.domain.Employee;

import java.util.List;

public interface CategoryService {

	Category save(Category category);

	List<Category> findAll();

	Category findById(Long id);

	void deleteById(Long id);
}
