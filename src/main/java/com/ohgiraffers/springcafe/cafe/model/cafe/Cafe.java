package com.ohgiraffers.springcafe.cafe.model.cafe;

import jakarta.persistence.*;

@Entity
@Table(name = "Cafe")
public class Cafe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id", nullable = false)
    private Integer orderId;

    @Column(name = "user_id", nullable = false)
    private Integer userId;

    @Column(name = "item_id", nullable = false)
    private Integer itemId;

    @Column(name = "order_amount", nullable = false)
    private int orderAmount;

    public Cafe() {
    }

    private Cafe(Integer orderId, Integer userId, Integer itemId, int orderAmount) {
        this.orderId = orderId;
        this.userId = userId;
        this.itemId = itemId;
        this.orderAmount = orderAmount;
    }

    public static Cafe builder(){
        return new Cafe();
    }

    public Cafe orderId(Integer orderId){
        this.orderId = orderId;
        return this;
    }

    public Cafe userId(Integer userId){
        this.userId = userId;
        return this;
    }

    public Cafe itemId(Integer itemId){
        this.itemId = itemId;
        return this;
    }

    public Cafe orderAmount(int orderAmount){
        this.orderAmount = orderAmount;
        return this;
    }

    @Override
    public String toString() {
        return "Cafe{" +
                "orderId=" + orderId +
                ", userId=" + userId +
                ", itemId=" + itemId +
                ", orderAmount=" + orderAmount +
                '}';
    }
}
