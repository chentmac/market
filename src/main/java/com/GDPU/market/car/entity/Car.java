package com.GDPU.market.car.entity;

import com.GDPU.market.user.entity.User;

import java.util.List;

public class Car {

    private Integer carid;
    private User user;
    private Float total;
    private List<CarItems> carItemsList;

    public Integer getCarid() {
        return carid;
    }

    public void setCarid(Integer carid) {
        this.carid = carid;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public List<CarItems> getCarItemsList() {
        return carItemsList;
    }

    public void setCarItemsList(List<CarItems> carItemsList) {
        this.carItemsList = carItemsList;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carid=" + carid +
                ", user=" + user +
                ", total=" + total +
                ", carItemsList=" + carItemsList +
                '}';
    }
}
