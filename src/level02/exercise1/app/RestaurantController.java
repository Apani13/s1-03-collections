package level02.exercise1.app;

public class RestaurantController {

    public StringBuilder run() {

        RestaurantService restaurantService = new RestaurantService();
        StringBuilder message = new StringBuilder();


        restaurantService.createObjectsAndPopulateHashSet();

        return message.append("--- HASHSET WITHOUT DUPLICATES ---\n")
                .append(restaurantService.listHashSet());

    }
}
