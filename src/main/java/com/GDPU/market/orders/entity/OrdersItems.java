package com.GDPU.market.orders.entity;

import com.GDPU.market.goods.entity.Goods;

public class OrdersItems {

    private Integer oiid;
    private Goods goods;
    private Orders orders;
    private Integer counts;
    private Float subTotal;

    public Integer getOiid() {
        return oiid;
    }

    public void setOiid(Integer oiid) {
        this.oiid = oiid;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
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
        return "OrdersItems{" +
                "oiid=" + oiid +
                ", goods=" + goods +
                ", orders=" + orders +
                ", counts=" + counts +
                ", subTotal=" + subTotal +
                '}';
    }
}
