package io.andreapan.level01.exercise1.app;

import io.andreapan.level01.exercise1.Model.Month;

import java.util.HashSet;

public class AppController {

    public String run() {

        Service service = new Service();
        StringBuilder message = new StringBuilder();

        service.createAndAddMonths();
        service.addDuplicatesToArray();


        message.append("ARRAYLIST WITH DUPLICATES\n")
                .append(service.listArray()).append("\n");


        HashSet<Month> monthHashSet = new HashSet<>(service.getMonths());


        message.append("HASHSET WITHOUT DUPLICATES\n")
                .append(service.listHashSet(monthHashSet)).append("\n");

        message.append("HASHSET LISTED WITH ITERATOR\n")
                .append(service.listHashSetIterator(monthHashSet)).append("\n");

        return message.toString();
    }


}
