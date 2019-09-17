package com.CarlosDegollado;

import java.math.BigDecimal;

public class Circle {

    public BigDecimal findCircleArea(double r) {

        BigDecimal radius = new BigDecimal(r);
        BigDecimal rSqr = new BigDecimal(radius.multiply(radius) + "");
        BigDecimal pi = new BigDecimal(3.14159);
        BigDecimal area = new BigDecimal(pi.multiply(rSqr) + "");

        return area;
    }
}
