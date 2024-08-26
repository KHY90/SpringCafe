package com.ohgiraffers.springcafe.cafe.repository;

import com.ohgiraffers.springcafe.cafe.model.cafe.Cafe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CafeRepository extends JpaRepository<Cafe, Integer> {
}
