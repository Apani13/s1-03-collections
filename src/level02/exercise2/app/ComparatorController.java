package level02.exercise2.app;

import level02.exercise1.app.RestaurantService;

public class ComparatorController {

    private static final String NL = System.lineSeparator();
    private final RestaurantService restaurantService;
    private final ComparatorService comparatorService;


    public ComparatorController() {
        restaurantService = new RestaurantService();
        restaurantService.createObjectsAndPopulateSet();

        comparatorService = new ComparatorService(
                restaurantService.getRestaurants());
    }


    public StringBuilder run() {

        StringBuilder message = new StringBuilder();


        message.append("CREATING OBJECTS AND POPULATING SET.....")
                .append(NL);

        message.append("RESTAURANTS SORTED BY NAME AND SCORE:")
                .append(NL)
                .append(comparatorService.listRestaurants());

        return message;

    }

}
