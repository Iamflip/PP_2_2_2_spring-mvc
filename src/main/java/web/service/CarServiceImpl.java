package web.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService{
    private List<Car> cars = List.of(new Car[] {
            new Car("Audi", 250, 1995),
            new Car("BMW", 300, 2007),
            new Car("Toyota", 270, 2005),
            new Car("Ferrari", 350, 2015),
            new Car("Lada", 180, 2004)});


    @Override
    public List<Car> getCars(int count) {
        List<Car> carList = new ArrayList<>();

        if (count <= 0) {
            return null;
        } else if (count > 0 && count < 6) {
            for (int i = 0; i < count; i++) {
                carList.add(cars.get(i));
            }
        } else {
            carList.addAll(cars);
        }

        return carList;
    }
}
