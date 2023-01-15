package com.glearning.lms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import com.glearning.lms.model.Library;
import com.glearning.lms.repository.LibraryJpaRepository;
import com.glearning.lms.service.LibraryExistService;

@Service
public class LibraryExistServiceImpl implements LibraryExistService {

	@Autowired
	LibraryJpaRepository libraryRepository;

	@Override
	public boolean checkLibraryExistsById(Long id) {
		return libraryRepository.existsById(id);
	}

	@Override
	public boolean checkLibraryExistsByExample(String commaSeperatedBookNames) {
		Library library = new Library();
		library.setCommaSeperatedBooknames(commaSeperatedBookNames);
		ExampleMatcher exampleMatcher = ExampleMatcher.matching()
				.withMatcher("commaSeperatedBooknames", ExampleMatcher.GenericPropertyMatchers.exact())
				.withIgnorePaths("name", "id");
		Example<Library> example = Example.of(library, exampleMatcher);
		return libraryRepository.exists(example);
	}

}
