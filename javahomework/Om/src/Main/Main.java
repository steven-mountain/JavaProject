package Main;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application{

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(@SuppressWarnings("exports") Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Stage s1 = new Stage();
		s1.setTitle("JavaFX");
		s1.setHeight(500);
		s1.setWidth(500);
		s1.getIcons().add(new Image("file:///D:/обть/twiter.png"));
		s1.initStyle(StageStyle.UNIFIED);
//		s1.setX(500);
//		s1.setY(500);
//		s1.setOpacity(0.5);
		s1.heightProperty().addListener(new ChangeListener<Number>() {

			@Override
			public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
				// TODO Auto-generated method stub
				System.out.println("Current height:" + arg2);
			}
		});
		s1.widthProperty().addListener(new ChangeListener<Number>() {

			@Override
			public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
				// TODO Auto-generated method stub
				System.out.println("current width " + arg2);
			}
		});
		
		System.out.println(s1.getWidth());
//		s1.getIcons().add(new Image("twiter.png"));
		Stage s2 = new Stage();
		s2.setTitle("s2");
		s2.initStyle(StageStyle.UNIFIED);
		s1.initOwner(s2);
		s2.show();
		s1.show();
		
	}
	
}
