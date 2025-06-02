package level02.exercise2.app;

import level02.exercise1.app.RestaurantService;
import level02.exercise1.model.Restaurant;
import level02.exercise2.model.RestaurantComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Controller {

    public static StringBuilder run() {

        RestaurantService restaurantService = new RestaurantService();

        restaurantService.createObjectsAndPopulateHashSet();

        List<Restaurant> restaurants = new ArrayList<>(restaurantService.getRestaurantHashSet());

        Collections.sort(restaurants, new RestaurantComparator());

        StringBuilder message = new StringBuilder();

        message.append("\nRESTAURANTS SORTED BY NAME AND SCORE:\n");

        for (Restaurant r : restaurants){
            message.append(r).append("\n");
        }

        return message;

    }

}
