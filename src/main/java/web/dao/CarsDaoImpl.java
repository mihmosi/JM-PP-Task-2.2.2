package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
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
    public List<Car> getCarsDao(int numder) {
        if (numder > 0 & numder < 5) {
            // создаем стрим,  ограничиваем по параметру и возвращаем список
            return cars.stream().limit(numder).collect(Collectors.toList());
        }
        return cars;
    }

    @Override
    public List<Car> getCarsDao() {
        return cars;
    }

}
