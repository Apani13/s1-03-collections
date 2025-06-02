package level02.exercise2;

import level02.exercise1.app.RestaurantController;
import level02.exercise2.app.Controller;

public class Main {

    public static void main(String[] args) {

        StringBuilder message;
        Controller controller = new Controller();

        message = controller.run();

        System.out.println(message.toString());

    }

}
