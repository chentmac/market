package com.GDPU.market.car.service;

import com.GDPU.market.car.entity.Car;
import com.GDPU.market.car.entity.CarItems;
import com.GDPU.market.goods.entity.Goods;
import com.GDPU.market.user.entity.User;

import java.util.List;

public interface CarService {
    Integer addToCar(Goods goods, Car car, Integer counts, Float subTotal);

    Car getCar(User user);

    Integer newCar(User user);

    List<CarItems> getCarItems(Integer carid);

    Integer updateCar(Integer carId, Float total);

    Integer deleteByCiid(Integer ciid);

    Integer deleteAll(Integer carid);
}
