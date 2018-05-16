package com.GDPU.market.car.service.impl;

import com.GDPU.market.car.dao.CarDao;
import com.GDPU.market.car.entity.Car;
import com.GDPU.market.car.entity.CarItems;
import com.GDPU.market.car.service.CarService;
import com.GDPU.market.goods.entity.Goods;
import com.GDPU.market.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("CarService")
public class CarServiceImpl implements CarService {

    @Autowired
    private CarDao carDao;

    public Integer addToCar(Goods goods, Car car, Integer counts, Float subTotal) {
        return carDao.addToCar(goods, car, counts, subTotal);
    }

    public Car getCar(User user) {
        return carDao.getCar(user);
    }

    public Integer newCar(User user) {
        return carDao.newCar(user);
    }

    public List<CarItems> getCarItems(Integer carid) {
        return carDao.getCarItems(carid);
    }

    public Integer updateCar(Integer carId, Float total) {
        return carDao.updateCar(carId, total);
    }

    public Integer deleteByCiid(Integer ciid) {
        return carDao.deleteByCiid(ciid);
    }

    public Integer deleteAll(Integer carid) {
        return carDao.deleteAll(carid);
    }
}
