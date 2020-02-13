package com.CarlosDegollado;

public class Apartment extends Building {
    private String apartmentNumber;

    public Apartment(String address, int nbrOfFloors, boolean garage, String apartmentNumber) {
        super(address, nbrOfFloors, garage);
        this.apartmentNumber = apartmentNumber;
    }
    @Override
    public String toString() {
        String result = super.toString() + "\nApartment Number: " + this.apartmentNumber;
        return result;
    }
}
