package com.watch.shop.application.view;

import com.watch.shop.application.model.entity.Watch;

import java.util.List;

public class ConsoleShopView implements View {
    public void printAllWatches(List<Watch> watchList) {
        printHeader();
        for (Watch watch : watchList) {
            print(watch.toString());
        }
    }

    public void printHeader() {
        print(String.format("%-15s %-10s %-15s %-35s, %-15s\n", "Brand", "Price", "Color", "Receiving date", "Energy info"));
    }

    public void print(String message) {
        System.out.println(message);
    }
}
