package level01.exercise2.model;

import java.util.ArrayList;
import java.util.List;

public class SecondListNumbers {

    private List<Integer> secondListNumbers;

    public SecondListNumbers() {
        this.secondListNumbers = new ArrayList<>();
    }

    public List<Integer> getSecondListNumbers() {
        return this.secondListNumbers;
    }


    public StringBuilder listSecondArrayNumbers() {
        StringBuilder message = new StringBuilder();

        for (Integer integer : secondListNumbers) {
            message.append(integer).append("\n");
        }
        return message;
    }

}
