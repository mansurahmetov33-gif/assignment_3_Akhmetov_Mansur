package utils;

import model.Car;

import java.util.Comparator;
import java.util.List;

public class SortingUtils {

    public static List<Car> sortByPriceAsc(List<Car> cars) {
        return cars.stream()
                .sorted(Comparator.comparingDouble(Car::getPrice))
                .toList();
    }

    public static List<Car> sortByPriceDesc(List<Car> cars) {
        return cars.stream()
                .sorted(Comparator.comparingDouble(Car::getPrice).reversed())
                .toList();
    }
}
