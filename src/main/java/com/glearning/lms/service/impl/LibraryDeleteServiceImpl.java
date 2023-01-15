package com.glearning.lms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.glearning.lms.model.Library;
import com.glearning.lms.repository.LibraryJpaRepository;
import com.glearning.lms.service.LibraryDeleteService;

@Service
public class LibraryDeleteServiceImpl implements LibraryDeleteService {

	@Autowired
	LibraryJpaRepository libraryRepository;
	
	@Override
	public String deleteOneLibrary(Library library) {
		libraryRepository.delete(library);
		return "Deleted Library: "+ library;
	}
	
	@Override
	public String pruneTable() {
		libraryRepository.deleteAll();
		return "prune complete";
	}
	
	@Override
	public String deleteAllThese(List<Library> libraries) {
		libraryRepository.deleteAll(libraries);
		return "Delete All Complete";
	}
	
	@Override
	public String deleteAllInBatch() {
		libraryRepository.deleteAllInBatch();
		return "Deleted All in Batch Completed";
	}
	
	@Override
	public String deleteLibraryById(Long id) {
		libraryRepository.deleteById(id);
		return "Library with id: "+id+" is deleted";
	}
	
	@Override
	public String deleteAllTheseInBatch(List<Library> libraries) {
		libraryRepository.deleteInBatch(libraries);
		return "Deleted all the libraries in the list in batch mode";
	}
	
	
}
