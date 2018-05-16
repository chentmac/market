package com.GDPU.market.orders.entity;

import com.GDPU.market.user.entity.User;

import java.util.Date;
import java.util.List;

public class Orders {

    private String oid;
    private User user;
    private String address;
    private Date createTime;
    private Float total;
    private List<OrdersItems> ordersItemsList;

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public List<OrdersItems> getOrdersItemsList() {
        return ordersItemsList;
    }

    public void setOrdersItemsList(List<OrdersItems> ordersItemsList) {
        this.ordersItemsList = ordersItemsList;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "oid='" + oid + '\'' +
                ", user=" + user +
                ", address='" + address + '\'' +
                ", createTime=" + createTime +
                ", total=" + total +
                ", ordersItemsList=" + ordersItemsList +
                '}';
    }
}
