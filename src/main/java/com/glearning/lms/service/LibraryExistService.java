package com.glearning.lms.service;

public interface LibraryExistService {
	
	boolean checkLibraryExistsById(Long id);

	boolean checkLibraryExistsByExample(String commaSeperatedBookNames);
}
