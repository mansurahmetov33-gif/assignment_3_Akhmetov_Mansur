package repository;

import model.Car;
import java.util.List;
import repository.interfaces.Repository;
public interface CarRepository extends Repository<Car> {
    void save(Car car);
    Car findById(int id);
    List<Car> findAll();
}
