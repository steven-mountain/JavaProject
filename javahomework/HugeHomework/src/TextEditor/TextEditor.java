package TextEditor;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class TextEditor extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage arg0) throws Exception {
		TextField t1 = new TextField();
		t1.setPrefHeight(600);
		t1.setPrefWidth(800);
		t1.setStyle(
			"-fx-background-color:#CFCFCF;"+
			"-fx-font-size:18"
		);
		Button b = new Button("save");
		GridPane g = new GridPane();
		g.setMargin(b, new Insets(20, 0, 0, 379));
		b.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent arg0) {
				try {
					BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("²âÊÔ½á¹û.txt")));
					bw.write(t1.getText());
					bw.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		});
		g.add(t1, 0, 0);
		g.add(b, 0, 1);
		g.setAlignment(Pos.CENTER);
		Scene s = new Scene(g);
		Stage s1 = new Stage();
		s1.setScene(s);
		s1.setHeight(800);
		s1.setWidth(800);
		s1.show();
		System.out.println(b.getWidth());
	}
}

