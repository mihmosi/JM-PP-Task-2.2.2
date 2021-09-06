package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarsDao {
    List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car(1, "BMW", "black"));
        cars.add(new Car(2, "Mazda", "red"));
        cars.add(new Car(3, "Toyota", "blue"));
        cars.add(new Car(4, "Ford", "yellow"));
        cars.add(new Car(5, "Ram", "white"));
    }

    public List<Car> getCars(int numder) {
        if (numder > 0 & numder < 5) {
            return cars.stream().limit(numder).collect(Collectors.toList());
        }
        return cars;
    }
}
