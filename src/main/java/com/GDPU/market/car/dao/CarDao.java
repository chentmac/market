package com.GDPU.market.car.dao;

import com.GDPU.market.car.entity.Car;
import com.GDPU.market.car.entity.CarItems;
import com.GDPU.market.goods.entity.Goods;
import com.GDPU.market.user.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CarDao {

    Integer addToCar(@Param(value = "goods") Goods goods, @Param(value = "car") Car car, @Param(value = "counts") Integer counts, @Param(value = "subTotal") Float subTotal);

    Car getCar(@Param(value = "user") User user);

    Integer newCar(@Param(value = "user") User user);

    List<CarItems> getCarItems(Integer carid);

    Integer updateCar(@Param(value = "carId") Integer carId, @Param(value = "total") Float total);

    Integer deleteByCiid(Integer ciid);

    Integer deleteAll(Integer carid);
}
