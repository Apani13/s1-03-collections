package level02.exercise1.app;

import level01.exercise1.Model.Month;
import level02.exercise1.model.Restaurant;

import java.util.ArrayList;
import java.util.HashSet;

public class RestaurantService {

    private HashSet<Restaurant> restaurantHashSet;

    public RestaurantService() {
        this.restaurantHashSet = new HashSet<>();;
    }


    public HashSet<Restaurant> getRestaurantHashSet() {
        return this.restaurantHashSet;
    }

    public void createObjectsAndPopulateHashSet() {
        restaurantHashSet.add(new Restaurant("Pomodoro", 10));
        restaurantHashSet.add(new Restaurant("IndianSushi", 4));
        restaurantHashSet.add(new Restaurant("NoodleSopa", 7));
        restaurantHashSet.add(new Restaurant("Pomodoro", 10));
        restaurantHashSet.add(new Restaurant("IndianSushi", 6));
    }


    public String listHashSet() {

        StringBuilder message = new StringBuilder();

        for (Restaurant restaurant : restaurantHashSet) {
            message.append(restaurant.getName()).append("\n")
                    .append(restaurant.getScore()).append("\n");
        }
        return message.toString();
    }

}
