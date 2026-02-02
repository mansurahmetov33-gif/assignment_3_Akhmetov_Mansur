import model.Car;
import model.Engine;
import repository.CarRepository;
import repository.impl.CarRepositoryImpl;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        CarRepository carRepository = new CarRepositoryImpl();

        // Create engines
        Engine engine1 = new Engine("Petrol", 150);
        Engine engine2 = new Engine("Diesel", 120);

        // Create cars
        Car car1 = new Car(1, "Toyota", 50.0, engine1);
        Car car2 = new Car(2, "BMW", 80.0, engine2);

        // Save to database
        carRepository.save(car1);
        carRepository.save(car2);

        // Get all cars
        System.out.println("All cars:");
        List<Car> cars = carRepository.findAll();
        cars.forEach(c -> System.out.println(c.getDetails()));

        // Find by id
        System.out.println("\nFind car with id = 1:");
        Car found = carRepository.findById(1);
        if (found != null) {
            System.out.println(found.getDetails());
        }

        // Update car
        if (found != null) {
            found.setPricePerDay(60.0);
            carRepository.update(found);
            System.out.println("\nUpdated car:");
            System.out.println(found.getDetails());
        }

        // Delete car
        carRepository.delete(2);
        System.out.println("\nAfter delete:");

        carRepository.findAll()
                .forEach(c -> System.out.println(c.getDetails()));
    }
}

