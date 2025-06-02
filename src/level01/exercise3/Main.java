package level01.exercise3;

import level01.exercise3.app.GameController;
import level01.exercise3.app.GameService;
import level01.exercise3.data.ScoreSaver;

public class Main {
    public static void main(String[] args) {
        GameService gameService = new GameService();
        ScoreSaver scoreSaver = new ScoreSaver("src/level01/exercise3/resources/classification.txt");
        GameController controller = new GameController(gameService, scoreSaver);

        controller.run();
    }
}
