package com.watch.shop.application.view.utils;

import java.math.BigDecimal;
import java.util.Scanner;

public class InputHandler {
    Scanner scanner = new Scanner(System.in);

    public Integer readIntegerInput() {
        Integer input = scanner.nextInt();
        scanner.nextLine();
        return input;
    }

    public BigDecimal readPriceInput() {
        double input = scanner.nextDouble();
        scanner.nextLine();
        return BigDecimal.valueOf(input);
    }

    public String readLineInput() {
        return scanner.nextLine();
    }
}
