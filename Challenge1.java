package javafxdemo;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

public class Challenge1 extends Application {
    @Override
    public void start(Stage primaryStage) {
        Button Nextbt = new Button("NEXT");
        Nextbt.setOnAction(new NtHandler());

        Button Prvbt = new Button("PREVIOUS");
        Prvbt.setOnAction(new PrvHandler());

        HBox pane = new HBox();
        pane.getChildren().addAll(Nextbt, Prvbt);
        pane.setAlignment(Pos.CENTER);
        pane.setSpacing(10);

        Scene scene = new Scene(pane, 300, 300);

        primaryStage.setTitle("Challenge ONE");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    class NtHandler implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event) {
            System.out.println("NEXT Button Pressed");
        }
    }

    class PrvHandler implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event) {
            System.out.println("PREVIOUS Button Pressed");
        }
    }
}
