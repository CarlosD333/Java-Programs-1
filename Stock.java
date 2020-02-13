package com.CarlosDegollado;

import java.math.BigDecimal;

public class Stock implements ISellable {
    private int shares;
    private String symbol;
    private BigDecimal pricePerShare;

    public Stock(int shares, String symbol, String pricePerShare) {
        this.shares = shares;
        this.symbol = symbol;
        this.pricePerShare = pricePerShare;
    }

    public void setPricePerShare(BigDecimal pricePerShare) {
        this.pricePerShare = pricePerShare;
    }

    @Override
    public BigDecimal cost(BigDecimal n) {

    }

    @Override
    public void sale(int n) {

    }
}
