package level02.exercise2.model;

import level02.exercise1.model.Restaurant;
import java.util.Comparator;

public class RestaurantComparator implements Comparator<Restaurant> {

    @Override
    public int compare(Restaurant r1, Restaurant r2) {

        int nameComparison = r1.getName().compareTo(r2.getName());

        if (nameComparison != 0) {
            return nameComparison;
        }

        return Integer.compare(r2.getScore(), r1.getScore());
    }



}
