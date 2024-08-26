package com.ohgiraffers.springcafe.cafe.repository;

import com.ohgiraffers.springcafe.cafe.model.item.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Integer> {


}
