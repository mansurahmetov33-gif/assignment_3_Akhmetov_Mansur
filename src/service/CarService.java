package service;

import repository.CarRepository;

import model.Car;


import java.util.List;

public class CarService {

    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public void addCar(Car car) {
        carRepository.save(car);
    }

    public Car getCarById(int id) {
        return carRepository.findById(id);
    }

    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    public void deleteCar(int id) { carRepository.delete(id);
    }


    public List<Car> sortByPrice() {

        return carRepository.findAll().stream()
                .sorted((c1, c2) -> Double.compare(c1.getPrice(), c2.getPrice()))
                .toList();
    }

    public List<Car> getExpensiveCars(double minPrice) {

        return carRepository.findAll().stream()
                .filter(car -> car.getPrice() >= minPrice)
                .toList();
    }



}


