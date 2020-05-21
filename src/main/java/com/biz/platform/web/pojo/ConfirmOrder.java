package com.biz.platform.web.pojo;

import java.io.Serializable;
import java.util.List;

public class ConfirmOrder implements Serializable{

    private User user;
    private List<Order> orders;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
