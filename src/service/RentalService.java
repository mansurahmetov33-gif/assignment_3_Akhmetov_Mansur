package service;

import model.Rental;
import repository.RentalRepository;

public class RentalService {

    private final RentalRepository rentalRepository;

    public RentalService(RentalRepository rentalRepository) {
        this.rentalRepository = rentalRepository;
    }

    public void createRental(Rental rental) {
        rentalRepository.save(rental);
    }
}
