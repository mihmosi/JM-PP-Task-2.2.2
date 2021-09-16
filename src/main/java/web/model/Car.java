package web.model;

import org.springframework.stereotype.Component;

@Component
public class Car {
    private int id;
    private String carModel;
    private String carColor;

    public Car(int id, String carModel, String carColor) {
        this.id = id;
        this.carModel = carModel;
        this.carColor = carColor;
    }

    public Car() {
    }

    @Override
    public String toString() {
        return "Car: " + "id=" + id +
                ", carModel='" + carModel + '\'' +
                ", carColor='" + carColor + '\'';
    }
}
