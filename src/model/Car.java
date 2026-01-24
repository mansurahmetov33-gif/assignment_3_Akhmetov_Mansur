package model;

public class Car extends BaseEntity {
    private double pricePerDay;

    public Car(int id, String name, double pricePerDay) {
        super(id, name);
        this.pricePerDay = pricePerDay;
    }

    @Override
    public String getEntityType() {
        return "Car";
    }

    @Override
    public String getDetails() {
        return "Car: " + name + ", price per day: " + pricePerDay;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(double pricePerDay) {
        if (pricePerDay <= 0) {
            throw new IllegalArgumentException("Price must be positive");
        }
        this.pricePerDay = pricePerDay;
    }
}
