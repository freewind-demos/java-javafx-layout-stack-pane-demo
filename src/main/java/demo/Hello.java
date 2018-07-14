package demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Hello extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello");
        StackPane root = new StackPane() {{
            getChildren().add(new Pane() {{
                getChildren().addAll(
                        new Pane() {{
                            this.setStyle("-fx-background-color: #AAAAAA");
                            this.setPrefHeight(200);
                            this.setPrefWidth(200);
                        }},
                        new Pane() {{
                            this.setStyle("-fx-background-color: RED");
                            this.setPrefHeight(100);
                            this.setPrefWidth(100);
                        }},
                        new Button("Hello")
                );
            }});
        }};
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }
}