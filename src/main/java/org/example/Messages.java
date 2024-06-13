package org.example;

public class Messages {
    public static void printSortingMenu() {
        System.out.println("\nChose actions:");
        System.out.println("1 - sort by price");
        System.out.println("2 - sort by color");
        System.out.println("3 - sort by date in come");
        System.out.println("0 - back");
        System.out.print("Please make your choose: ");
    }

    public static void printMainMenu() {
        System.out.println("\nChose actions:");
        System.out.println("1 - add watch");
        System.out.println("2 - get all Shop products");
        System.out.println("3 - get sorted Shop products");
        System.out.println("4 - get Total products price");

        System.out.print("Please make your choose: ");
    }
    public static void printChoiceWatchType() {
        System.out.println("\nChoice watch type:");
        System.out.println("1 - Solar");
        System.out.println("2 - Quartz");
        System.out.println("3 - Mechanical");

        System.out.print("Please make your choose: ");
    }
    public static void printChoiceWatchColor() {
        System.out.println("\nPlease choice color:");
        System.out.println("1 - Red");
        System.out.println("2 - Silver");
        System.out.println("3 - Gold");
        System.out.println("4 - Black");

        System.out.print("Please make your choose: ");
    }
    public static void printInvalidChoice() {
        System.out.println("Invalid input, please try again");
    }
    public static void printInputBatteryCapacity() {
        System.out.println("\nChosen solar watch. Please input battery capacity in mAh: ");
    }
    public static void printInputBatteryLife() {
        System.out.println("\nChosen quartz watch. Please input battery life in years: ");
    }
    public static void printInputBatteryReserve() {
        System.out.println("\nChosen mechanical watch. Please input power reserve lie in hours: ");
    }
    public static void printInputBrand() {
        System.out.println("\nPlease input brand: ");
    }
    public static void printInputPrice() {
        System.out.println("\nPlease input price");
    }
    public static void printAddedWatch() {
        System.out.println("\nThe watch was added\n\n");
    }


}
