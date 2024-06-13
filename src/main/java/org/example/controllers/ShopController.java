package org.example.controllers;

import org.example.model.Color;
import org.example.model.ShopRepository;
import org.example.model.entity.MechanicalWatch;
import org.example.model.entity.QuartzWatch;
import org.example.model.entity.SolarWatch;
import org.example.model.entity.Watch;
import org.example.views.ShopView;

import java.util.Date;
import java.util.Scanner;

import static org.example.Messages.*;


public class ShopController {

    private final ShopRepository shopRepository;
    private final ShopView shopView;

    public ShopController() {
        this.shopRepository = new ShopRepository();
        this.shopView = new ShopView();
    }

    public void handleUserInput() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            printMainMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    addNewWatch(scanner);
                    break;
                case 2:
                    shopView.printAllWatches(shopRepository.getAllWatches());
                    break;
                case 3:
                    getSortingMenu(scanner);
                    break;
                case 4:
                    shopView.printTotalPrice(shopRepository.getTotalPrice());
                    break;
                default:
                    printInvalidChoice();
                    break;
            }
        }
    }


    private void getSortingMenu(Scanner scanner) {

        while (true) {
            printSortingMenu();
            int choie = scanner.nextInt();
            scanner.nextLine();
            switch (choie) {
                case 1:
                    shopView.printAllWatches(shopRepository.getWatchesSortedByPrice());
                    break;
                case 2:
                    shopView.printAllWatches(shopRepository.getWatchesSortedByColor());
                    break;
                case 3:
                    shopView.printAllWatches(shopRepository.getWatchesSortedByDate());
                    break;
                case 0:
                    return;
                default:
                    printInvalidChoice();
                    break;
            }

        }
    }


    private void addNewWatch(Scanner scanner) {
        Watch newWatch = null;
        printChoiceWatchType();

        while (newWatch == null) {
            int watchType = scanner.nextInt();
            scanner.nextLine();
            switch (watchType) {
                case 1:
                    newWatch = new SolarWatch();
                    printInputBatteryCapacity();
                    ((SolarWatch) newWatch).setBatteryCapacity(scanner.nextLine());
                    break;
                case 2:
                    newWatch = new QuartzWatch();
                    printInputBatteryLife();
                    ((QuartzWatch) newWatch).setBatteryLife(scanner.nextLine());
                    break;
                case 3:
                    newWatch = new MechanicalWatch();
                    printInputBatteryReserve();
                    ((MechanicalWatch) newWatch).setPowerReserve(scanner.nextLine());
                    break;
                default:
                    printInvalidChoice();
                    break;
            }
        }
        printInputBrand();
        newWatch.setBrand(scanner.nextLine());

        printInputPrice();
        newWatch.setPrice(scanner.nextDouble());

        printChoiceWatchColor();
        boolean validColor = false;

        while (!validColor) {
            switch (scanner.nextInt()) {
                case 1:
                    newWatch.setColor(Color.RED);
                    validColor = true;
                    break;
                case 2:
                    newWatch.setColor(Color.SILVER);
                    validColor = true;
                    break;
                case 3:
                    newWatch.setColor(Color.GOLD);
                    validColor = true;
                    break;
                case 4:
                    newWatch.setColor(Color.BLACK);
                    validColor = true;
                    break;
                default:
                    printInvalidChoice();
            }

        }
        newWatch.setReceivedDate(new Date());
        shopRepository.save(newWatch);
        printAddedWatch();
    }

}
