package javafxdemo;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.geometry.Pos;


public class F2C extends Application{
@Override
public void start(Stage primaryStage){
   
    Label F2C =new Label("Fahrenheight to Celsuis Converter");
    Label Flb=new Label("Fahrenheight");
    Label Clb=new Label("Celcuis");
    
    TextField tfF=new TextField();
    tfF.setPrefColumnCount(2);
    
    TextField tfC=new TextField();
    tfC.setPrefColumnCount(4);
    
     Button bt1=new Button("Convert");
    bt1.setOnAction(e->{ 
    String fahrenheitValue = tfF.getText(); 
    double fValue = Double.parseDouble(fahrenheitValue); 
 
    double cValue = ((fValue - 32)*5/9); 
    String celsiusValue = Double.toString(cValue); 
    tfC.setText(celsiusValue); 
 });
    
    GridPane pane=new GridPane();
    pane.add(Flb,0,1);
    pane.add(tfF,0,2);
    pane.add(tfC,1,2);
    pane.add(Clb,1,1);
    //pane.add(bt1,0,3);
    pane.setAlignment(Pos.CENTER);
    pane.setVgap(5);
    pane.setHgap(15);
    
    VBox Vpane=new VBox(5);
    Vpane.getChildren().addAll(F2C,pane,bt1);
    Vpane.setAlignment(Pos.TOP_CENTER);
    
    Scene scene=new Scene(Vpane,200,200);
    primaryStage.setScene(scene);
    primaryStage.show();

}
    public static void main(String[] args) {
        launch(args);
    }
    
}