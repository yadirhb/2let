package edu.mum.cs.waa.service.impl;

import edu.mum.cs.waa.domain.Category;
import edu.mum.cs.waa.domain.Employee;
import edu.mum.cs.waa.repository.CategoryRepository;
import edu.mum.cs.waa.repository.EmployeeRepository;
import edu.mum.cs.waa.service.CategoryService;
import edu.mum.cs.waa.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;


	@Override
	public Category save(Category category) {
		return categoryRepository.save(category);
	}

	@Override
	public List<Category> findAll() {
		return (List<Category>)categoryRepository.findAll();
	}

	@Override
	public Category findById(Long id) {
		return (Category)categoryRepository.findOne(id);
	}

	@Override
	public void deleteById(Long id) {
		 categoryRepository.delete(id);
	}
}
