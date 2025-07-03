package level02.exercise2.app;

import level02.exercise1.model.Restaurant;

import java.util.Iterator;
import java.util.NavigableSet;

public class ComparatorService {

    private final NavigableSet<Restaurant> restaurants;
    private static final String NL = System.lineSeparator();

    public ComparatorService(NavigableSet<Restaurant> restaurants) {
        this.restaurants = restaurants;
    }

    public String listRestaurants() {
        StringBuilder message = new StringBuilder();

        Iterator<Restaurant> iteratorRestaurant = restaurants.iterator();
        while (iteratorRestaurant.hasNext()) {
            message.append(iteratorRestaurant.next()).append(NL);
        }
        return message.toString();
    }

}
