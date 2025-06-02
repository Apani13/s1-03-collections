package level01.exercise3.model;

public class Player {

    private String name;
    private int score;

    public Player(String name) {
        this.name = name;
        this.score = score;
    }


    public String getName() {
        return this.name;
    }


    public int getScore() {
        return score;
    }


    public void addPoint() {
        score++;
    }


    @Override
    public String toString() {
        return "PLAYER:\n"
                + "name: " + this.name
                + "score: " + this.score;
    }



}
