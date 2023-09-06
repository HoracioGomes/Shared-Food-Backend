package com.example.sharedfood.services;

import com.example.sharedfood.data.FriendOrderVO;
import com.example.sharedfood.data.OrdersVO;
import org.springframework.stereotype.Service;

@Service
public class OrdersService {

    public OrdersVO calculateDues(OrdersVO ordersVO) {

        Double totalOrderValue = ordersVO.getTotalItemsValue()
                + ordersVO.getPlusValue().getValue()
                - ordersVO.getDiscount();

        for (FriendOrderVO friendOrder :
                ordersVO.getFriendsOrders()) {
            Double proportion = friendOrder.getTotalItemsValue() / ordersVO.getTotalItemsValue();
            Double due = proportion * totalOrderValue;
            friendOrder.setAmountDue(due);
        }

        return ordersVO;

    }
}
