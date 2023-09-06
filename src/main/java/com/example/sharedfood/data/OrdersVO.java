package com.example.sharedfood.data;

import java.io.Serializable;
import java.util.List;

public class OrdersVO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private Double totalItemsValue;
    private PlusValueVO plusValue;
    private Double discount;
    private List<FriendOrderVO> friendsOrders;

    public OrdersVO() {
    }

    public OrdersVO(Long id, Double totalItemsValue, PlusValueVO plusValue, Double discount, List<FriendOrderVO> friendsOrders) {
        this.id = id;
        this.totalItemsValue = totalItemsValue;
        this.plusValue = plusValue;
        this.discount = discount;
        this.friendsOrders = friendsOrders;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getTotalItemsValue() {
        return totalItemsValue;
    }

    public void setTotalItemsValue(Double totalItemsValue) {
        this.totalItemsValue = totalItemsValue;
    }

    public PlusValueVO getPlusValue() {
        return plusValue;
    }

    public void setPlusValue(PlusValueVO plusValue) {
        this.plusValue = plusValue;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public List<FriendOrderVO> getFriendsOrders() {
        return friendsOrders;
    }

    public void setFriendsOrders(List<FriendOrderVO> friendsOrders) {
        this.friendsOrders = friendsOrders;
    }
}
