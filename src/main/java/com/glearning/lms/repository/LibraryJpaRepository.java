package com.glearning.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.glearning.lms.model.Library;

@Repository
public interface LibraryJpaRepository extends JpaRepository<Library, Long>{

}
