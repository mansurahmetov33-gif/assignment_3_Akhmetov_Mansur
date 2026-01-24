import model.Car;
import repository.CarRepository;
import repository.impl.CarRepositoryImpl;
import service.CarService;

public class Main {

    public static void main(String[] args) {
        CarRepository carRepository = new CarRepositoryImpl();
        CarService carService = new CarService(carRepository);

        carService.addCar(new Car(0, "Toyota", 50.0));
        carService.addCar(new Car(0, "BMW", 80.0));

        carService.getAllCars().forEach(System.out::println);
    }
}
