package level01.exercise3.data;

import level01.exercise3.model.Player;

import java.io.FileWriter;
import java.io.IOException;

public class ScoreSaver {

    private final String scoreFilePath;

    public ScoreSaver(String scoreFilePath) {
        this.scoreFilePath = scoreFilePath;
    }

    public void save(Player player) {
        try (FileWriter writer = new FileWriter(scoreFilePath, true)) {
            writer.write(player.getName() + " - " + player.getScore() + " pts\n");
        } catch (IOException e) {
            throw new RuntimeException("Score could not be saved. ", e);
        }
    }

}
