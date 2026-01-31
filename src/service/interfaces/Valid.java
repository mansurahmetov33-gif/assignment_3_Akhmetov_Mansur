package service.interfaces;

public interface Valid<T> {

    boolean isValid(T obj);

    default void printValidation() {
        System.out.println("Validation in progress...");
    }
}
