package com.watch.shop.application.model.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

public abstract class Watch implements Cloneable {
    private BigDecimal price;
    private LocalDate receivedDate;
    private Color color;
    private String brand;

    public Watch() {
    }

    public Watch(BigDecimal price, LocalDate receivedDate, Color color, String brand) {
        this.price = price;
        this.receivedDate = receivedDate;
        this.color = color;
        this.brand = brand;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public LocalDate getReceivedDate() {
        return receivedDate;
    }

    public void setReceivedDate(LocalDate receivedDate) {
        this.receivedDate = receivedDate;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public abstract String toString();

    @Override
    public Watch clone() {
        try {
            return (Watch) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
