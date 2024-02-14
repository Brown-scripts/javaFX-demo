package javafxdemo;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class SubmitForm extends Application{
@Override
public void start(Stage primaryStage){
    Button sb=new Button("SUBMIT");
    sb.setOnAction(new sbHandler());
    
    Label namelb =new Label("NAME:");
    TextField tf1=new TextField();
    
    Label agelb =new Label("AGE:");
    TextField tf2=new TextField();
    
    Label gendlb =new Label("GENDER:");
    TextField tf3=new TextField();
    
    VBox pane=new VBox();
    Scene scene=new Scene(pane,300,400);
    pane.setAlignment(Pos.CENTER);
    pane.getChildren().addAll(namelb,tf1,agelb,tf2,gendlb,tf3,sb);
    pane.setPadding(new Insets(50,50,50,50));
    pane.setSpacing(10);
     
    primaryStage.setScene(scene);
    primaryStage.setTitle("Submit Form");
    primaryStage.show(); 
    }
      
    public static void main(String[] args){
    launch(args);
    }
    
    public class sbHandler implements EventHandler<ActionEvent>{
    @Override
    public void handle(ActionEvent event){
        System.out.println("FORM SUBMITTED");
    }}
}