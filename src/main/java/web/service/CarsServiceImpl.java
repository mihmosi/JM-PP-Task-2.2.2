package web.service;

import org.springframework.stereotype.Service;
import web.dao.CarsDaoImpl;
import web.model.Car;

import java.util.List;

@Service
public class CarsServiceImpl implements CarsService {

    private final CarsDaoImpl carsDao;

    private CarsServiceImpl(CarsDaoImpl carsDao) {
        this.carsDao = carsDao;
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
