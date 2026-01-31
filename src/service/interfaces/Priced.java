package service.interfaces;

public interface Priced {

    double getPrice();

    default boolean isFree() {
        return getPrice() == 0;
    }

    static void info() {
        System.out.println("Priced interface for paid objects");
    }
}
