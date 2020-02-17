package Exercise15_1;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import java.util.ArrayList;

public class Exercise15_01 extends Application {
  @Override
  public void start(Stage primaryStage) {
    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 1; i <= 52; i++) {
      list.add(i);
    }
    java.util.Collections.shuffle(list);
    
    HBox hBox = new HBox(5);
    hBox.setAlignment(Pos.CENTER);
    hBox.getChildren().add(new ImageView("image/card/" + list.get(0) + ".png"));
    hBox.getChildren().add(new ImageView("image/card/" + list.get(1) + ".png"));
    hBox.getChildren().add(new ImageView("image/card/" + list.get(2) + ".png"));
    hBox.getChildren().add(new ImageView("image/card/" + list.get(3) + ".png"));
    
    Button btRefresh = new Button("Refresh");
    btRefresh.setOnAction(e -> {
      java.util.Collections.shuffle(list);
      hBox.getChildren().clear();
      hBox.getChildren().add(new ImageView("image/card/" + list.get(0) + ".png"));
      hBox.getChildren().add(new ImageView("image/card/" + list.get(1) + ".png"));
      hBox.getChildren().add(new ImageView("image/card/" + list.get(2) + ".png"));
      hBox.getChildren().add(new ImageView("image/card/" + list.get(3) + ".png"));
    });
   
    BorderPane pane = new BorderPane();
    pane.setCenter(hBox);
    pane.setBottom(btRefresh);
    BorderPane.setAlignment(btRefresh, Pos.TOP_CENTER);

    Scene scene = new Scene(pane, 250, 150);
    primaryStage.setScene(scene); 
    primaryStage.show(); 
  }

  public static void main(String[] args) {
    launch(args);
  }
} 
