package repository;

import model.Car;
import java.util.List;

public interface CarRepository {
    void save(Car car);
    Car findById(int id);
    List<Car> findAll();
}
