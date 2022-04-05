package web.DAO;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDAO {
    List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("Audi", 250, 1995));
        cars.add(new Car("BMW", 300, 2007));
        cars.add(new Car("Toyota", 270, 2005));
        cars.add(new Car("Ferrari", 350, 2015));
        cars.add(new Car("Lada", 180, 2004));
    }

    public List<Car> getCars() {
        return cars;
    }
}
