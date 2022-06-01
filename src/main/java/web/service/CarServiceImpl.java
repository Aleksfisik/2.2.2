package web.service;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarServiceImpl implements CarService {
    private static final List<Car> carList = new ArrayList<>();

    static {
        carList.add(new Car("Kia", "black", 2017));
        carList.add(new Car("Lada", "black", 1900));
        carList.add(new Car("BMW", "green", 2007));
        carList.add(new Car("Mers", "yellow", 2000));
        carList.add(new Car("Dol", "blue", 2021));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count == 0) {
            return carList;
        }

        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
