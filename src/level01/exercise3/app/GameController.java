package level01.exercise3.app;

import level01.exercise3.data.ScoreSaver;
import level01.exercise3.model.Player;

import java.util.List;
import java.util.Scanner;

public class GameController {

    private final GameService gameService;
    private final ScoreSaver scoreSaver;
    private final Scanner scanner;

    public GameController(GameService gameService, ScoreSaver scoreSaver) {
        this.gameService = gameService;
        this.scoreSaver = scoreSaver;
        this.scanner = new Scanner(System.in);
    }

    public void run() {
        showWelcomeMessage();
        Player player = createPlayer();

        List<String> countries = gameService.selectRandomCountries(10);

        for (int i = 0; i < countries.size(); i++) {
            String country = countries.get(i);
            System.out.print("QUESTION " + (i + 1) + ": What is the capital of " + country + "? ");
            String userAnswer = scanner.nextLine().trim();

            if (gameService.isCorrectAnswer(country, userAnswer)) {
                System.out.println("CORRECT!");
                player.addPoint();
            } else {
                System.out.println("INCORRECT... The answer is " + gameService.getCapital(country));
            }

            System.out.println();
        }

        showFinalScore(player);
        saveScore(player);
    }

    private void showWelcomeMessage() {
        System.out.println("===== CAPITALS QUIZ =====");
        System.out.println("Answer correctly the capital of ten cities");
        System.out.println("Good Luck...!\n");
    }

    private Player createPlayer() {
        System.out.print("Enter your name: ");
        String name = scanner.nextLine().trim();
        return new Player(name);
    }

    private void showFinalScore(Player player) {
        System.out.println("\nTHE END");
        System.out.println(player.getName() + ", your final score is: " + player.getScore() + " pts.");
    }

    private void saveScore(Player player) {
        try {
            scoreSaver.save(player);
            System.out.println("Score saved successfully.");
        } catch (RuntimeException e) {
            System.err.println("ERROR: Could not save score. Please try again.");
        }
    }

}
