package level02.exercise1.app;

import level02.exercise1.model.Restaurant;
import level02.exercise2.model.RestaurantComparator;

import java.util.Collections;
import java.util.NavigableSet;
import java.util.TreeSet;

public class RestaurantService {

    private final NavigableSet<Restaurant> restaurants;

    public RestaurantService() {
        this.restaurants = new TreeSet<>(new RestaurantComparator());
    }


    public NavigableSet<Restaurant> getRestaurants() {
        return Collections.unmodifiableNavigableSet(restaurants);
    }


    public void createObjectsAndPopulateSet() {
        restaurants.add(new Restaurant("Pomodoro", 10));
        restaurants.add(new Restaurant("IndianSushi", 4));
        restaurants.add(new Restaurant("NoodleSopa", 7));
        restaurants.add(new Restaurant("Pomodoro", 10));
        restaurants.add(new Restaurant("IndianSushi", 6));
    }

}
