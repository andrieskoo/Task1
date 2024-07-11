package com.watch.shop.application.model.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

public class QuartzWatch extends Watch {
    private String batteryLife;

    public QuartzWatch() {
    }

    public QuartzWatch(BigDecimal price, LocalDate date, Color color, String brand, String batteryLife) {
        super(price, date, color, brand);
        this.batteryLife = batteryLife;
    }

    public String getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(String batteryLife) {
        this.batteryLife = batteryLife;
    }

    @Override
    public String toString() {
        return String.format("%-15s %-10.2e %-10s, %-15s, %-15s\n", this.getBrand(),
                this.getPrice(),
                this.getColor(),
                this.getReceivedDate(),
                this.getBatteryLife());
    }
}
