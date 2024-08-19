package com.ohgiraffers.springcafe.cafe.model.cafe;

import jakarta.persistence.*;

@Entity
@Table(name = "Cafe")
public class Cafe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cafe_id", nullable = false)
    private Integer cafeId;





}
