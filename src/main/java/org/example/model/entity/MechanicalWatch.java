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
public class MechanicalWatch extends Watch{
    private String powerReserve;
    public MechanicalWatch(Double price, Date date, Color color, String brand, String powerReserve){
        super(price, date, color, brand);
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
