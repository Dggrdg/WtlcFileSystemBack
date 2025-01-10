package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.User;

@Repository
public interface LoginRepository extends JpaRepository<User, Integer> {

	User findByUserNameAndPassword(String userName, String password);
}
