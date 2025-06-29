package level02.exercise2.app;

import level02.exercise1.app.RestaurantService;
import level02.exercise1.model.Restaurant;

public class Controller {

    public static StringBuilder run() {

        RestaurantService service = new RestaurantService();
        String NL = System.lineSeparator();
        StringBuilder message = new StringBuilder();


        message.append("CREATING OBJECTS AND POPULATING SET.....")
                .append(NL);
        service.createObjectsAndPopulateSet();



        message.append("RESTAURANTS SORTED BY NAME AND SCORE:")
                .append(NL);

        for (Restaurant r : service.getRestaurants()){
            message.append(r).append(NL);
        }

        return message;

    }

}
