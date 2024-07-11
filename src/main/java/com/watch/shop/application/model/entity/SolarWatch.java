package com.watch.shop.application.model.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

public class SolarWatch extends Watch {
    private String batteryCapacity;

    public SolarWatch() {
    }

    public SolarWatch(BigDecimal price, LocalDate date, Color color, String brand, String batteryCapacity) {
        super(price, date, color, brand);
        this.batteryCapacity = batteryCapacity;
    }

    public String getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(String batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public String toString() {
        return String.format("%-15s %-10.2e %-10s, %-15s, %-15s\n", this.getBrand(),
                this.getPrice(),
                this.getColor(),
                this.getReceivedDate(),
                this.getBatteryCapacity());
    }
}
