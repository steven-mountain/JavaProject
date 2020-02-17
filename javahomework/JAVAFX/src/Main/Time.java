package Main;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Time extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Text t = new Text("time");
		Button b = new Button("stop");
		GridPane ap = new GridPane();
		ap.add(t, 0, 0);
		ap.add(b, 0, 1);
		ap.setAlignment(Pos.CENTER);
		Scene scene = new Scene(ap);
		Stage s = new Stage();
		s.setScene(scene);
		s.setHeight(500);
		s.setWidth(500);
		Timeline tl = new Timeline(new KeyFrame(Duration.millis(1000), e ->
			t.setText(new Date().toString())));
		tl.setCycleCount(Timeline.INDEFINITE);
		tl.play();
		s.show();
	}
	
}
