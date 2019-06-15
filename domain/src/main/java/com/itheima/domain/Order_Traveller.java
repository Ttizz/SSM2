package com.itheima.domain;

public class Order_Traveller {
    //order Traveller 中间表
    private String orderId;
    private String travellerId;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getTravellerId() {
        return travellerId;
    }

    public void setTravellerId(String travellerId) {
        this.travellerId = travellerId;
    }

    @Override
    public String toString() {
        return "Order_Traveller{" +
                "orderId='" + orderId + '\'' +
                ", travellerId='" + travellerId + '\'' +
                '}';
    }
}
