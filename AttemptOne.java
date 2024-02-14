/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package javafxdemo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 *
 * @author user
 */
public class AttemptOne extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button bt1 = new Button("OK");
        Button bt2 = new Button("CANCEL");
      FlowPane pane= new FlowPane();
      pane.setPadding(new Insets(100,100,100,120));
        pane.getChildren().addAll(bt1,bt2);
        Scene scene=new Scene(pane,500,300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Attempt One");
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
