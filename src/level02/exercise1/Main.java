package level02.exercise1;

import level02.exercise1.app.RestaurantController;

public class Main {

    public static void main(String[] args) {

            StringBuilder message;
            RestaurantController restaurantController = new RestaurantController();

            message = restaurantController.run();

            System.out.println(message);

    }
}
