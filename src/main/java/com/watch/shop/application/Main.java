package com.watch.shop.application;

import com.watch.shop.application.controllers.ShopController;
import com.watch.shop.application.model.service.ShopService;
import com.watch.shop.application.view.ConsoleShopView;
import com.watch.shop.application.view.utils.InputHandler;

public class Main {
    public static void main(String[] args) {
        ShopService shopRepository = new ShopService();
        ConsoleShopView shopView = new ConsoleShopView();
        InputHandler inputHandler = new InputHandler();
        ShopController shopController = new ShopController(shopView, shopRepository, inputHandler);

        shopController.run();
    }
}