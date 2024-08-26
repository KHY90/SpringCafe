package com.ohgiraffers.springcafe.user.repository;

import com.ohgiraffers.springcafe.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}