package Exercise15_15;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Exercise15_15 extends Application {  
  @Override 
  public void start(Stage primaryStage) {     
    Pane pane = new Pane();

    pane.setOnMouseClicked(e -> { 
      if (e.getButton() == MouseButton.PRIMARY) {      
        Circle circle = new Circle(e.getX(), e.getY(), 5);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);
        pane.getChildren().add(circle);
      }
      else if (e.getButton() == MouseButton.SECONDARY) { 
        ObservableList<Node> list = pane.getChildren();
        for (int i = 0; i < list.size(); i++) {
          if (list.get(i).contains(e.getX(), e.getY())) {
            list.remove(i);
          }
        }
      }
    });
    
    Scene scene = new Scene(pane, 400, 250);
    primaryStage.setScene(scene); 
    primaryStage.show(); 
  }
  public static void main(String[] args) {
    launch(args);
  }
} 

