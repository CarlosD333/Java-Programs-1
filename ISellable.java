package com.CarlosDegollado;

import java.math.BigDecimal;

public interface ISellable {
    public abstract BigDecimal cost(int n);

    public abstract void sale(int n);
}
