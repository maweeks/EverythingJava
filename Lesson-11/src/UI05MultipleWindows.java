import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class UI05MultipleWindows extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Test UI");
        StackPane root = new StackPane();
        StackPane root2 = new StackPane();
        Scene scene1 = new Scene(root, 300, 300);
        Scene scene2 = new Scene(root2, 500, 300);

        Button btn1x = new Button();
        btn1x.setText("Go to pane 1");
        btn1x.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                createAlert("Going to pane 1", AlertType.INFORMATION);
                primaryStage.setScene(scene1);
            }
        });
        root2.getChildren().add(btn1x);

        Button btn1 = new Button();
        btn1.setText("Go to pane 2");
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                createAlert("Going to pane 2", AlertType.INFORMATION);
                primaryStage.setScene(scene2);
            }
        });

        root.getChildren().add(btn1);
        primaryStage.setScene(scene1);
        primaryStage.show();
    }

    private void createAlert(String text, AlertType type) {
        Alert alert = new Alert(type);
        alert.setTitle("Information Dialog");
        alert.setHeaderText(null);
        alert.setContentText(text);
        alert.showAndWait();
    }
}
