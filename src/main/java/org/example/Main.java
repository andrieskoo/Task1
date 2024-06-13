package org.example;

import org.example.controllers.ShopController;

public class Main {
    public static void main(String[] args) {
        ShopController shopController = new ShopController();

        shopController.handleUserInput();
    }
}