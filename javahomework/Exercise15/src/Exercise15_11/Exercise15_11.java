package Exercise15_11;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Exercise15_11 extends Application {
  @Override 
  public void start(Stage primaryStage) {     
    Pane pane = new Pane();
    Circle circle = new Circle(50, 50, 10);
    pane.getChildren().add(circle);
    
    circle.setFocusTraversable(true);
    circle.setOnKeyPressed(e -> { 
      if (e.getCode() == KeyCode.UP) {
        circle.setCenterY(circle.getCenterY() - 2); 
      }
      else if (e.getCode() == KeyCode.DOWN) {
        circle.setCenterY(circle.getCenterY() + 2); 
      }
      else if (e.getCode() == KeyCode.LEFT) {
        circle.setCenterX(circle.getCenterX() - 2); 
      }
      if (e.getCode() == KeyCode.RIGHT) {
        circle.setCenterX(circle.getCenterX() + 2); 
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

