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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Car{");
        sb.append("id=").append(id);
        sb.append(", carModel='").append(carModel).append('\'');
        sb.append(", carColor='").append(carColor).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
