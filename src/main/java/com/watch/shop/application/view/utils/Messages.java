package com.watch.shop.application.view.utils;

public class Messages {
    public static String SORT_MENU = """
            Chose actions:
                1 - sort by price
                2 - sort by color
                3 - sort by date in come
                0 - back
            Please make your choose:\s
            """;

    public static String MAIN_MENU = """
            Chose actions:
                1 - add watch
                2 - get all Shop products
                3 - get sorted Shop products
                4 - get Total products price
                0 - exit
            Please make your choose:\s
            """;

    public static String WATCH_TYPE_MENU = """
            Choice watch type:
            1 - Solar
            2 - Quartz
            3 - Mechanical
                    
            Please make your choose:
            """;

    public static String WATCH_COLOR_MENU = """
            Please choice color:
                1 - Red
                2 - Silver
                3 - Gold
                4 - Black
                    
            Please make your choose:
            """;

    public static String INVALID_CHOICE = """
            Invalid input, please try again
            """;

    public static String BATTERY_CAPACITY = """
            Chosen solar watch. Please input battery capacity in mAh:
            """;

    public static String BATTERY_LIFE = """
            Chosen quartz watch. Please input battery life in years:
            """;

    public static String BATTERY_RESERVE = """
            Chosen mechanical watch. Please input power reserve lie in hours:
            """;

    public static String BRAND = """
            Please input brand:
            """;

    public static String PRICE = """
            Please input price
            """;

    public static String ADDED_WATCH = """
            The watch was added
            """;

    public static String TOTAL_PRICE_MESSAGE = """
            The total price of all watches in store is: %s
            """;
    public static String EXIT = """
            Thank You for using the store
            """;
}
