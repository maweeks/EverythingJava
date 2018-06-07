// basic frame
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class TempMain extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Test UI");
        StackPane root = new StackPane();
        primaryStage.setScene(new Scene(root, 300, 300));
        primaryStage.show();
    }
}
