package com.ohgiraffers.springcafe.cafe.model.item;

import jakarta.persistence.*;

@Entity
@Table(name = "Item")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_id", nullable = false)
    private Integer itemId;

    @Column(name = "item_name", nullable = false)
    private String itemName;

    @Column(name = "item_price", nullable = false)
    private int itemPrice;

    @Column(name = "item_status", nullable = false)
    private boolean itemStatus;

    public Item() {
    }

    private Item(Integer itemId, String itemName, int itemPrice, boolean itemStatus) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemStatus = itemStatus;
    }

    public static Item builder(){
        return new Item();
    }

    public Item itmeId(Integer itemId) {
        this.itemId = itemId;
        return this;
    }

    public Item itemName(String itemName){
        this.itemName = itemName;
        return this;
    }

    public Item itemPrice(int itemPrice){
        this.itemPrice = itemPrice;
        return this;
    }

    public Item itemStatus(boolean itemStatus){
        this.itemStatus = itemStatus;
        return this;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemId=" + itemId +
                ", itemName='" + itemName + '\'' +
                ", itemPrice=" + itemPrice +
                ", itemStatus=" + itemStatus +
                '}';
    }
}
