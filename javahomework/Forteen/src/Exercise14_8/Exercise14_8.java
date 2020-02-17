package Exercise14_8;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Exercise14_08 extends Application {
  @Override 
  public void start(Stage primaryStage) {       
    GridPane pane = new GridPane();
        
    for (int i = 0; i < 6; i++) { 
      for (int j = 0; j < 9; j++) {
        pane.add(new ImageView("image/card/" + (i * 6 + j + 1) + ".png"), j, i);
      }
    }
        
    Scene scene = new Scene(pane, 600, 600);
    primaryStage.setTitle("Exercise14_08"); 
    primaryStage.setScene(scene); 
    primaryStage.show(); 
  }

  public static void main(String[] args) {
    launch(args);
  }
} 

