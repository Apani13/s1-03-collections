package level01.exercise1.app;

import level01.exercise1.Model.Month;

import java.util.HashSet;

public class AppController {

    public String run() {

        Service service = new Service();
        StringBuilder message = new StringBuilder();

        service.createAndAddMonths();

        message.append("ARRAYLIST WITHOUT AUGUST\n")
                        .append(service.getMonths());

        service.createAndAddAugust();

        message.append("ARRAYLIST WITH AUGUST CORRECTLY PLACED\n")
                        .append(service.getMonths());

        service.addDuplicatesToArray();

        message.append("ARRAYLIST WITH DUPLICATES\n")
                .append(service.listArrayWithDuplicateMonths()).append("\n");


        HashSet<Month> monthHashSet = new HashSet<>(service.getMonths());


        message.append("HASHSET WITHOUT DUPLICATES\n")
                .append(service.listHashSetWithoutDuplicateMonths(monthHashSet)).append("\n");

        message.append("HASHSET LISTED WITH ITERATOR\n")
                .append(service.listHashSetIterator(monthHashSet)).append("\n");

        return message.toString();
    }


}
