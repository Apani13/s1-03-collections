package io.andreapan.level01.exercise2.app;

import io.andreapan.level01.exercise2.model.SecondListNumbers;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class AppController {

    public StringBuilder run() {

       Service service = new Service();
       StringBuilder message = new StringBuilder();

       service.addNumbersToFirstArray();

       service.addNumbersToSecondArray();

       return message.append("FIRST ARRAY").append("\n")
               .append(service.showResultOfFirstArray()).append("\n")
               .append("SECOND ARRAY").append("\n")
               .append(service.showResultOfSecondArray());

    }

}
