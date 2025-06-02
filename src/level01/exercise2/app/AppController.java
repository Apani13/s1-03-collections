package level01.exercise2.app;

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
