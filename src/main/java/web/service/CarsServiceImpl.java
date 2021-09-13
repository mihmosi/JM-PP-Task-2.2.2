package web.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.CarsDaoImpl;
import web.model.Car;

import java.util.List;

@Service
public class CarsServiceImpl implements CarsService {
    private int number;
    private final CarsDaoImpl carsDao;

    private CarsServiceImpl(CarsDaoImpl carsDao) {
        this.carsDao = carsDao;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Transactional(readOnly = true)
    @Override
    public List<Car> getCars(int number) {
        return carsDao.getCarsDao(number);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Car> getCars() {
        return carsDao.getCarsDao();
    }

}
