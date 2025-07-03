package level02.exercise2;

import level02.exercise2.app.ComparatorController;

public class Main {

    public static void main(String[] args) {

        StringBuilder message;
        ComparatorController controller = new ComparatorController();

        message = controller.run();

        System.out.println(message);

    }

}
