package repository.impl;

import model.Car;
import repository.CarRepository;
import utils.DatabaseConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CarRepositoryImpl implements CarRepository {

    @Override
    public void save(Car car) {
        String sql = "INSERT INTO cars(name, price_per_day) VALUES (?, ?)";
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, car.getName());
            ps.setDouble(2, car.getPricePerDay());
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Car findById(int id) {
        return null;
    }

    @Override
    public List<Car> findAll() {
        return new ArrayList<>();
    }
}
