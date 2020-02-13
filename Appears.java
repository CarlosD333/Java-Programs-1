package com.carlosdegollado;

public class Appears implements IAppears {
    private String A;
    private String B;

    public Appears() {
        this.A = "";
        this.B = "";
    }

    public Appears(String A, String B) {
        this.A = A;
        this.B = B;
    }

    public String getA() {
        return this.A;
    }

    public String getB() {
        return this.B;
    }

    public void setA(String A) {
        this.A = A;
    }

    public void setB(String B) {
        this.B = B;
    }
    
}
