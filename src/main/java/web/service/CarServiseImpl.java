package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiseImpl implements CarService {
    private final List<Car> cars = Arrays.asList(
            new Car("BMW", "Black", 2020),
            new Car("Audi", "White", 2019),
            new Car("Mercedes", "Silver", 2021),
            new Car("Toyota", "Blue", 2018),
            new Car("Honda", "Red", 2022)
    );

    @Override
    public List<Car> getCars(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
