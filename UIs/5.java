// alert hbox
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class TempMain extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Test UI");
        Button btn1 = new Button();
        btn1.setText("Hello info");
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                createAlert("I have a great message for you!", AlertType.INFORMATION);
            }
        });
        Button btn2 = new Button();
        btn2.setText("Hello warn");
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                createAlert("I have a bad message for you!", AlertType.WARNING);
            }
        });
        Button btn3 = new Button();
        btn3.setText("Hello erro");
        btn3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                createAlert("I have a terrible message for you!", AlertType.ERROR);
            }
        });

        StackPane root = new StackPane();
        HBox hbox = new HBox();
        hbox.setSpacing(10);
        hbox.getChildren().addAll(btn1, btn2, btn3);

        root.getChildren().add(hbox);
        primaryStage.setScene(new Scene(root, 300, 300));
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
