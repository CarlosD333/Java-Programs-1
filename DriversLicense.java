package com.CarlosDegollado;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.time.LocalDateTime;

public class DriversLicense {

    private String name;
    private int id;
    private int expYear;
    private int expMonth;
    private int expDay;

    public DriversLicense(String name, int id, int expMonth,
                          int expDay, int expYear) {
        this.name = name;
        this.id = id;
        this.expYear = expYear;
        this.expMonth = expMonth;
        this.expDay = expDay;
    }

    public boolean isExpired() {
        LocalDateTime date = LocalDateTime.now();

        int month = date.getMonthValue();
        int day = date.getDayOfMonth();
        int year = date.getYear();

        if (this.expYear < year) {
            return true;
        } else if (this.expYear == year && this.expMonth < month) {
            return true;
        } else if (this.expYear == year && this.expMonth == month
                   && this.expDay <= day) {
            return true;
        }
        return false;
    }

    public void displayInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("ID: " + this.id);
        System.out.println("Expiration: " + this.expMonth +
                            "/" + this.expDay + "/" + this.expYear);
    }
}
