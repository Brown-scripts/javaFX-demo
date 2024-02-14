package javafxdemo;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.FlowPane;



public class ButtonHandler extends Application{
    @Override
    public void start(Stage primaryStage){
        Button bt1=new Button("OK");
        bt1.setOnAction(new ButtonHandler1());
        FlowPane pane=new FlowPane();
        pane.setPadding(new Insets(15,15,15,15));
        pane.setAlignment(Pos.CENTER);
        pane.getChildren().add(bt1);
        Scene scene=new Scene(pane,500,500);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Button Handler");
        primaryStage.show();
        
};

   public static void main(String args[]){
   launch(args);
   }

   class ButtonHandler1 implements EventHandler<ActionEvent>{
        @Override
        public void handle(ActionEvent Event ){
        System.out.println("OK pressed");
        }
    }
};

 