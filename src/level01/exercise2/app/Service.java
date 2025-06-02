package level01.exercise2.app;

import level01.exercise2.model.FirstListNumbers;
import level01.exercise2.model.SecondListNumbers;
import java.util.List;
import java.util.ListIterator;


public class Service {

    private FirstListNumbers firstListNumbers;
    private SecondListNumbers secondListNumbers;
    private List<Integer> firstListNumbersArray;


    public Service() {
        this.firstListNumbers = new FirstListNumbers();
        this.firstListNumbersArray = firstListNumbers.getFirstListNumbers();
        this.secondListNumbers = new SecondListNumbers();

    }

    public void addNumbersToFirstArray() {

        for (int i = 1; i <= 10; i++) {
            this.firstListNumbersArray.add(i);
        }

    }

    public void addNumbersToSecondArray() {

        ListIterator<Integer> iterator = firstListNumbersArray
                .listIterator(firstListNumbersArray.size());

        while (iterator.hasPrevious()) {
            Integer integer = iterator.previous();
            this.secondListNumbers.getSecondListNumbers().add(integer);

        }

    }

    public StringBuilder showResultOfFirstArray() {
        return this.firstListNumbers.listFirstArrayNumbers();
    }

    public StringBuilder showResultOfSecondArray() {
        return this.secondListNumbers.listSecondArrayNumbers();
    }


}
