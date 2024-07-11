package com.watch.shop.application.controllers;

import com.watch.shop.application.model.entity.Color;
import com.watch.shop.application.model.service.ShopService;
import com.watch.shop.application.model.entity.MechanicalWatch;
import com.watch.shop.application.model.entity.QuartzWatch;
import com.watch.shop.application.model.entity.SolarWatch;
import com.watch.shop.application.model.entity.Watch;
import com.watch.shop.application.view.ConsoleShopView;
import com.watch.shop.application.view.utils.InputHandler;

import java.time.LocalDate;

import static com.watch.shop.application.view.utils.Messages.ADDED_WATCH;
import static com.watch.shop.application.view.utils.Messages.BATTERY_CAPACITY;
import static com.watch.shop.application.view.utils.Messages.BATTERY_LIFE;
import static com.watch.shop.application.view.utils.Messages.BATTERY_RESERVE;
import static com.watch.shop.application.view.utils.Messages.BRAND;
import static com.watch.shop.application.view.utils.Messages.EXIT;
import static com.watch.shop.application.view.utils.Messages.INVALID_CHOICE;
import static com.watch.shop.application.view.utils.Messages.MAIN_MENU;
import static com.watch.shop.application.view.utils.Messages.PRICE;
import static com.watch.shop.application.view.utils.Messages.SORT_MENU;
import static com.watch.shop.application.view.utils.Messages.TOTAL_PRICE_MESSAGE;
import static com.watch.shop.application.view.utils.Messages.WATCH_COLOR_MENU;
import static com.watch.shop.application.view.utils.Messages.WATCH_TYPE_MENU;

public class ShopController {
    private final ShopService shopRepository;
    private final ConsoleShopView shopView;
    private final InputHandler inputHandler;

    public ShopController(ConsoleShopView view, ShopService repository, InputHandler inputHandler) {
        this.shopView = view;
        this.shopRepository = repository;
        this.inputHandler = inputHandler;
    }

    public void run() {
        while (true) {
            shopView.print(MAIN_MENU);

            switch (inputHandler.readIntegerInput()) {
                case 1 -> addNewWatch();
                case 2 -> shopView.printAllWatches(shopRepository.getAllWatches());
                case 3 -> getSortingMenu();
                case 4 -> shopView.print(String.format(TOTAL_PRICE_MESSAGE, shopRepository.getTotalPrice()));
                case 0 -> shopView.print(EXIT);
                default -> shopView.print(INVALID_CHOICE);
            }
        }
    }

    private void getSortingMenu() {
        while (true) {
            shopView.print(SORT_MENU);

            switch (inputHandler.readIntegerInput()) {
                case 1 -> shopView.printAllWatches(shopRepository.getWatchesSortedByPriceASC());
                case 2 -> shopView.printAllWatches(shopRepository.getWatchesSortedByColor());
                case 3 -> shopView.printAllWatches(shopRepository.getWatchesSortedByDate());
                case 0 -> {
                    return;
                }
                default -> shopView.print(INVALID_CHOICE);
            }
        }
    }

    private void addNewWatch() {
        Watch newWatch = null;
        shopView.print(WATCH_TYPE_MENU);

        while (newWatch == null) {

            switch (inputHandler.readIntegerInput()) {
                case 1 -> {
                    newWatch = new SolarWatch();
                    shopView.print(BATTERY_CAPACITY);
                    ((SolarWatch) newWatch).setBatteryCapacity(inputHandler.readLineInput());
                }
                case 2 -> {
                    newWatch = new QuartzWatch();
                    shopView.print(BATTERY_LIFE);
                    ((QuartzWatch) newWatch).setBatteryLife(inputHandler.readLineInput());
                }
                case 3 -> {
                    newWatch = new MechanicalWatch();
                    shopView.print(BATTERY_RESERVE);
                    ((MechanicalWatch) newWatch).setPowerReserve(inputHandler.readLineInput());
                }
                default -> shopView.print(INVALID_CHOICE);
            }
        }
        shopView.print(BRAND);
        newWatch.setBrand(inputHandler.readLineInput());

        shopView.print(PRICE);
        newWatch.setPrice(inputHandler.readPriceInput());

        shopView.print(WATCH_COLOR_MENU);
        setNewWatchColor(newWatch);

        newWatch.setReceivedDate(LocalDate.now());
        shopRepository.save(newWatch);
        shopView.print(ADDED_WATCH);
    }

    private void setNewWatchColor(Watch newWatch){
        boolean validColor = false;

        while (!validColor) {

            switch (inputHandler.readIntegerInput()) {
                case 1 -> {
                    newWatch.setColor(Color.RED);
                    validColor = true;
                }
                case 2 -> {
                    newWatch.setColor(Color.SILVER);
                    validColor = true;
                }
                case 3 -> {
                    newWatch.setColor(Color.GOLD);
                    validColor = true;
                }
                case 4 -> {
                    newWatch.setColor(Color.BLACK);
                    validColor = true;
                }
                default -> shopView.print(INVALID_CHOICE);
            }
        }
    }
}
