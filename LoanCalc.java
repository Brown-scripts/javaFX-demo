import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.geometry.Pos;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class LoanCalc extends Application{
    @Override
    public void start(Stage primaryStage){
        Label lb1=new Label("Annual Interest Rate:");
        Label lb2=new Label("Number Of Years:");
        Label lb3=new Label("Loan Amount:");
        Label lb4=new Label("Monthly Payment:");
        Label lb5=new Label("Total Payment:");
        
        TextField tf1=new TextField();
        TextField tf2=new TextField();
        TextField tf3=new TextField();
        TextField tf4=new TextField();
        TextField tf5=new TextField();
        
        Button bt1=new Button("Clear");
        bt1.setOnAction(e->{
                tf1.setText("0");
                tf2.setText("0");
                tf3.setText("0");
                tf4.setText("0");
                tf5.setText("0");         
                
        });
        
        Button bt2=new Button("Calculate");
        bt2.setOnAction(e->{
            String monthly=tf4.getText();
            double monthlymoney=Double.parseDouble(monthly);
            String years=tf2.getText();
            double noYears=Double.parseDouble(years);
            
            double totalPayment=(monthlymoney*noYears*12);
            String Tpayment=Double.toString(totalPayment);
            tf5.setText("ghs "+Tpayment);
        });
        
        GridPane Gpane=new GridPane();
        Gpane.add(lb1,0,1);
        Gpane.add(tf1,1,1);
        
        Gpane.add(lb2,0,2);
        Gpane.add(tf2,1,2);
        
        Gpane.add(lb3,0,3);
        Gpane.add(tf3,1,3);
        
        Gpane.add(lb4,0,4);
        Gpane.add(tf4,1,4);
        
        Gpane.add(lb5,0,5);
        Gpane.add(tf5,1,5);
        
        Gpane.setAlignment(Pos.CENTER);
        Gpane.setHgap(10);
        Gpane.setVgap(10);
        
        FlowPane Fpane=new FlowPane();
        Fpane.getChildren().addAll(Gpane,bt1,bt2);
        Fpane.setAlignment(Pos.TOP_CENTER);
        Fpane.setVgap(10);
        Fpane.setHgap(10);
        
        
        Scene scene=new Scene(Fpane,300,300);
        primaryStage.setTitle("Loan Calculator");
        primaryStage.setScene(scene);
        primaryStage.show(); 
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}