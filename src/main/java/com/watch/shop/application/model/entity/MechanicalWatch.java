package com.watch.shop.application.model.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

public class MechanicalWatch extends Watch {
    private String powerReserve;

    public MechanicalWatch() {
    }

    public MechanicalWatch(BigDecimal price, LocalDate date, Color color, String brand, String powerReserve) {
        super(price, date, color, brand);
        this.powerReserve = powerReserve;
    }

    public String getPowerReserve() {
        return powerReserve;
    }

    public void setPowerReserve(String powerReserve) {
        this.powerReserve = powerReserve;
    }

    @Override
    public String toString() {
        return String.format("%-15s %-10.2e %-10s, %-15s, %-15s\n", this.getBrand(),
                this.getPrice(),
                this.getColor(),
                this.getReceivedDate(),
                this.getPowerReserve());
    }
}
