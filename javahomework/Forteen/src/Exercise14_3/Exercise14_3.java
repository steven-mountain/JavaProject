package Exercise14_3;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.image.ImageView;

public class Exercise14_03 extends Application {
  @Override 
  public void start(Stage primaryStage) {

    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 1; i <= 52; i++) {
      list.add(i);
    }
    java.util.Collections.shuffle(list);
    
    HBox pane = new HBox(5);
    pane.setAlignment(Pos.CENTER);
    pane.getChildren().add(new ImageView("image/card/" + list.get(0) + ".png"));
    pane.getChildren().add(new ImageView("image/card/" + list.get(1) + ".png"));
    pane.getChildren().add(new ImageView("image/card/" + list.get(2) + ".png"));
   
    
    Scene scene = new Scene(pane);
    primaryStage.setTitle("Exercise14_03"); 
    primaryStage.setScene(scene); 
    primaryStage.show(); 
  }

  public static void main(String[] args) {
    launch(args);
  }
} 

