package level01.exercise1.app;

import level01.exercise1.Model.Month;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Service {

    private ArrayList<Month> months;

    public Service() {
        this.months = new ArrayList<>();
    }


    public ArrayList<Month> getMonths() {
        return this.months;
    }


    public void createAndAddMonths() {

        months.add(new Month("January"));
        months.add(new Month("February"));
        months.add(new Month("March"));
        months.add(new Month("April"));
        months.add(new Month("May"));
        months.add(new Month("June"));
        months.add(new Month("July"));
        months.add(new Month("September"));
        months.add(new Month("October"));
        months.add(new Month("November"));
        months.add(new Month("December"));

        Month august = new Month("August");

        months.add(7, august);

    }


    public void addDuplicatesToArray() {

        months.add(new Month("January"));
        months.add(new Month("February"));
        months.add(new Month("March"));
        months.add(new Month("April"));

    }

    public String listArray() {
        StringBuilder message = new StringBuilder();
        for (Month month : months) {
            message.append(month.getName()).append("\n");
        }
        return message.toString();
    }

    public String listHashSet(HashSet<Month> monthHashSet) {
        StringBuilder message = new StringBuilder();
        for (Month month : monthHashSet) {
            message.append(month.getName()).append("\n");
        }
        return message.toString();
    }




    public String listHashSetIterator(HashSet<Month> monthHashSet) {
        StringBuilder message = new StringBuilder();
        Iterator<Month> iterator = monthHashSet.iterator();

        while (iterator.hasNext()) {
            Month month = iterator.next();
            message.append(month.getName()).append("\n");
        }

        return message.toString();
    }




}
