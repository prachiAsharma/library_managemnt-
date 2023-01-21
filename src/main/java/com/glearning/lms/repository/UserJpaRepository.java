package com.glearning.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.glearning.lms.model.User;

@Repository
public interface UserJpaRepository extends JpaRepository<User, Long>{

}
