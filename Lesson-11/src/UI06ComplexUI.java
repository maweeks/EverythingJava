import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class UI06ComplexUI extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Test UI");
        StackPane root = new StackPane();
        Scene scene1 = new Scene(root, 300, 135);
        BorderPane base = new BorderPane();
        BorderPane mainContent = new BorderPane();

        StackPane header = new StackPane();
        Label headerLabel = new Label();
        headerLabel.setText("Matt's Program");
        headerLabel.getStyleClass().add("header");
        header.getChildren().add(headerLabel);
        mainContent.setTop(header);

        StackPane content = new StackPane();
        TextField contentText = new TextField();
        headerLabel.getStyleClass().add("content");
        content.getChildren().add(contentText);
        mainContent.setCenter(content);

        VBox sideMenu = new VBox();
        sideMenu.getChildren().addAll(
                createAlertButton("Home"),
                createAlertButton("List"),
                createAlertButton("Print"),
                createAlertButton("Sort"),
                createAlertButton("Exit"));

        base.setLeft(sideMenu);
        base.setCenter(mainContent);
        root.getChildren().add(base);
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

    private Button createAlertButton(String buttonText){
        Button btn = new Button();
        btn.setText(buttonText);
        btn.getStyleClass().add("sideButton");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                createAlert(buttonText, Alert.AlertType.INFORMATION);
            }
        });
        return btn;
    }
}
