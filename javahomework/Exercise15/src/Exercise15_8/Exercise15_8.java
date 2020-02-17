package Exercise15_8;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Exercise15_08 extends Application {  
  @Override 
  public void start(Stage primaryStage) {
    Pane pane = new Pane();
    Text text = new Text();
    pane.getChildren().add(text);
    
    pane.setOnMousePressed(e -> {
      text.setX(e.getX());
      text.setY(e.getY());
      text.setText("(" + e.getX() + ", " + e.getY() + ")");
    });
 
    Scene scene = new Scene(pane, 400, 250);
    primaryStage.setScene(scene); 
    primaryStage.show(); 
  }

  public static void main(String[] args) {
    launch(args);
  }
}
