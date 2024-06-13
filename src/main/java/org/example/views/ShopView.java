package org.example.views;

import org.example.model.entity.Watch;

import java.util.List;

public class ShopView {

    public void printAllWatches(List<Watch> watchList){
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.printf("%-15s %-10s %-15s %-35s, %-15s\n", "Brand", "Price", "Color", "Receiving date", "Energy info");
        System.out.println("---------------------------------------------------------------------------------------------");

        for (Watch watch : watchList){
            System.out.printf(watch.toString());
        }

        System.out.println("");

    }

    public void printTotalPrice(Double totalPrice) {
        System.out.println("\nThe total price of all watches in store is: " + totalPrice + "$.\n");
    }
}
