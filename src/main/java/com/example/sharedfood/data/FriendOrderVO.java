package com.example.sharedfood.data;

import java.io.Serializable;

public class FriendOrderVO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;
    private Double orderValue;
    private Double amountDue = 0.0;
    private String paymentLink;

    public FriendOrderVO() {
    }

    public FriendOrderVO(Long id, String name, Double orderValue, Double amountDue, String paymentLink) {
        this.id = id;
        this.name = name;
        this.orderValue = orderValue;
        this.amountDue = amountDue;
        this.paymentLink = paymentLink;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getOrderValue() {
        return orderValue;
    }

    public void setOrderValue(Double orderValue) {
        this.orderValue = orderValue;
    }

    public Double getAmountDue() {
        return amountDue;
    }

    public void setAmountDue(Double amountDue) {
        this.amountDue = amountDue;
    }

    public String getPaymentLink() {
        return paymentLink;
    }

    public void setPaymentLink(String paymentLink) {
        this.paymentLink = paymentLink;
    }
}
