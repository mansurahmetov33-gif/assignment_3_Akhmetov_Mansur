package repository;

import model.Customer;

public interface CustomerRepository {
    void save(Customer customer);
    Customer findById(int id);
}
