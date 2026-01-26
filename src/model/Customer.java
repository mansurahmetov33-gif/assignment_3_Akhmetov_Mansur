package model;

public class Customer extends BaseEntity {
    private String licenseNumber;

    public Customer(int id, String name, String licenseNumber) {
        super(id, name);
        this.licenseNumber = licenseNumber;
    }

    @Override
    public String getEntityType() {
        return "Customer";
    }

    @Override
    public String getDetails() {
        return "Customer: " + name + ", license: " + licenseNumber;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        if (licenseNumber == null || licenseNumber.isBlank()) {
            throw new IllegalArgumentException("License cannot be empty");
        }
        this.licenseNumber = licenseNumber;
    }
}
