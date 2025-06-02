package level01.exercise1;

import level01.exercise1.app.AppController;

public class Main {

    public static void main(String[] args) {

        String message;
        AppController appController = new AppController();

        message = appController.run();

        System.out.println(message);

    }

}
