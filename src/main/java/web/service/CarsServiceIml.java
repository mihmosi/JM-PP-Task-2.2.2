package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.CarsDaoImpl;
import web.model.Car;

import java.util.List;

@Component
public class CarsServiceIml implements CarsService {
    private int number;
    @Autowired
    CarsDaoImpl carsDao;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public List<Car> getCars(int number) {
        return carsDao.getCarsDao(number);
    }

    @Override
    public List<Car> getCars() {
        return carsDao.getCarsDao();
    }

}
