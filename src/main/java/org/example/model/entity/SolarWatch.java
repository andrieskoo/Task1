package org.example.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.example.model.Brand;
import org.example.model.Color;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class SolarWatch extends Watch{
    private String batteryCapacity;

    public SolarWatch(Double price, Date date, Color color, String brand, String batteryCapacity){
        super(price, date, color, brand);
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
