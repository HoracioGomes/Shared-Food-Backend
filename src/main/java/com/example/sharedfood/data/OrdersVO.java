package com.example.sharedfood.data;

import java.io.Serializable;
import java.util.List;

public class OrdersVO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private Double totalOrderValue = 0.0;
    private List<FriendOrderVO> orders;

    public OrdersVO() {
    }

    public OrdersVO(Long id, Double totalOrderValue, List<FriendOrderVO> orders) {
        this.id = id;
        this.totalOrderValue = totalOrderValue;
        this.orders = orders;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getTotalOrderValue() {
        return totalOrderValue;
    }

    public void setTotalOrderValue(Double totalOrderValue) {
        this.totalOrderValue = totalOrderValue;
    }

    public List<FriendOrderVO> getOrders() {
        return orders;
    }

    public void setOrders(List<FriendOrderVO> orders) {
        this.orders = orders;
    }
}
