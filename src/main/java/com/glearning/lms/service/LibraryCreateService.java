package com.glearning.lms.service;

import java.util.List;

import com.glearning.lms.model.Library;

public interface LibraryCreateService {
	
	String addSingleLibrary(Library library);

	String addAllLibraries(List<Library> libraries);

	Library addLibrararywithSaveAndFlush(Library library);

}
