package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarsDaoImpl implements CarsDao {
    // инициализируем лист
    private final List<Car> cars;

    // наполняем список
    {
        cars = new ArrayList<>();
        cars.add(new Car(1, "BMW", "black"));
        cars.add(new Car(2, "Mazda", "red"));
        cars.add(new Car(3, "Toyota", "blue"));
        cars.add(new Car(4, "Ford", "yellow"));
        cars.add(new Car(5, "Ram", "white"));
    }

    /* логика возврата количества машин по аргументу в getCars из контроллера */
    @Override
    public List<Car> getCarsDao(int number) {
        // создаем стрим,  ограничиваем по параметру и возвращаем список
        return cars.stream().limit(number).collect(Collectors.toList());
    }

    @Override
    public List<Car> getCarsDao() {
        return cars;
    }

}
