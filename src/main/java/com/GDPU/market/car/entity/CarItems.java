package com.GDPU.market.car.entity;

import com.GDPU.market.goods.entity.Goods;

public class CarItems {

    private Integer ciid;
    private Goods goods;
    private Car car;
    private Integer counts;
    private Float subTotal;

    public Integer getCiid() {
        return ciid;
    }

    public void setCiid(Integer ciid) {
        this.ciid = ciid;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Integer getCounts() {
        return counts;
    }

    public void setCounts(Integer counts) {
        this.counts = counts;
    }

    public Float getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(Float subTotal) {
        this.subTotal = subTotal;
    }

    @Override
    public String toString() {
        return "CarItems{" +
                "ciid=" + ciid +
                ", goods=" + goods +
                ", car=" + car +
                ", counts=" + counts +
                ", subTotal=" + subTotal +
                '}';
    }
}
