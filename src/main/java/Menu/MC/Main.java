package Menu.MC;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.nio.file.Paths;

/**
 * This class is the Main class for the main menu.
 * @author Thomas Neal
 */
public class Main extends Application {
    /**
     * This is the method that is initially called the start the main menu and
     * program.
     * @param stage
     * this parameter takes in the stage (GUI window).
     * @throws Exception
     * exception thrown is starting the game/stage fails.
     */
    @Override
    public void start(Stage stage) throws Exception {
        Parent page = FXMLLoader.load(getClass().getResource("Menu.fxml"));
        Scene scene = new Scene(page);
        stage.setScene(scene);
        stage.show();
    }
}
