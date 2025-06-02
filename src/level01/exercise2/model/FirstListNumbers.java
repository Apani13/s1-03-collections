package level01.exercise2.model;

import java.util.ArrayList;
import java.util.List;

public class FirstListNumbers {

    private List<Integer> firstListNumbers;

    public FirstListNumbers() {
        this.firstListNumbers = new ArrayList<>();
    }

    public List<Integer> getFirstListNumbers() {
        return this.firstListNumbers;
    }


    public StringBuilder listFirstArrayNumbers() {
        StringBuilder message = new StringBuilder();

         for (Integer integer : firstListNumbers) {
            message.append(integer).append("\n");
        }
         return message;
    }

}
