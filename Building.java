package com.CarlosDegollado;

public class Building {
    private String address;
    private int nbrOfFloors;
    private boolean garage;

    public Building(String address, int nbrOfFloors, boolean garage) {
        this.address = address;
        this.nbrOfFloors = nbrOfFloors;
        this.garage = garage;
    }
    @Override
    public String toString() {
        String garageAnswer = "";
        if (this.garage == true) {
            garageAnswer = "Yes";
        } else {
            garageAnswer = "No";
        }

        String result = "Address: " + this.address + "\nNumber of Floors: " +
                this.nbrOfFloors + "\nGarage: " + garageAnswer;
        return result;
    }
}
