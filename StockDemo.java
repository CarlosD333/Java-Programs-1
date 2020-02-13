package com.CarlosDegollado;

import java.math.BigDecimal;

public class StockDemo {
    public static void main(String[] args) {
        Stock disney = new Stock(56000, "DIS", "112.07");
        BigDecimal cost1 = disney.cost(5);
        System.out.println("Disney cost: " + cost1);
        disney.setPricePerShare("115.38");
        cost1 = disney.cost(5);
        System.out.println("Disney cost: " + cost1);

        System.out.println();
        Stock amazon = new Stock(48700, "AMZN", "1502.06");
        amazon.sale(50000);
        System.out.println();
        amazon.sale(32876);
    }
}
