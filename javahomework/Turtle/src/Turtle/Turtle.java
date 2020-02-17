package Turtle;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Turtle extends Application{
	public static double nowx = 0;
	public static double nowy = 0;
	Boolean isDrop = false;
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		//小乌龟图片
		ImageView turtle = new ImageView("turtle.png");
		turtle.setFitWidth(100);
		turtle.setFitHeight(50);
		//用户输入指令的地方
		TextField order = new TextField();
		order.setTooltip(new Tooltip("在这里输入命令"));
		
		VBox vb = new VBox();
		vb.setPrefSize(200, 600);
		vb.setStyle(
				"-fx-background-color:#F5B7B1;"
		);
		
		
		Label l = new Label("指令(800，600)");
		l.setStyle(
			"-fx-text-fill:#3498DB;"+
			"-fx-font-size:20;"
		);
		Text t = new Text();
		t.setText("输入\"drop pen\" 乌龟开始画图；\n"
				+ "输入\"lift pen\" 乌龟停止画图；\n"
				+ "输入\"数字，数字\"来移动你的乌龟，\n路径即为所画的图\n"
		);
		t.setStyle(
			"-fx-font-size:12;"
		);
		t.setFill(Color.web("#3498DB"));
		
		Text status = new Text("乌龟是否提笔：是");
		status.setStyle(
			"-fx-font-size:12;"
		);
		status.setFill(Color.web("#3498DB"));
		Button input = new Button("输入");
		input.setStyle(
			"-fx-background-color:#3498DB;"+
			"-fx-text-fill:#17202A;"+
			"-fx-text-size:10;"+
			"-fx-border-color: #17202A00;"
		);
		
		
		//设置路径
		vb.setSpacing(20);
		vb.getChildren().add(t);
		vb.getChildren().add(l);
		vb.getChildren().add(order);
		vb.getChildren().add(input);
		vb.getChildren().add(status);
		vb.setPadding(new Insets(10.0));
		vb.setAlignment(Pos.CENTER_LEFT);
		
		
		//画图的地方
		AnchorPane hb = new AnchorPane();

		hb.setPrefSize(800, 600);
		hb.getChildren().add(turtle);
		hb.setStyle(
				"-fx-background-color:#B2BABB;"
		);
		
		GridPane ap = new GridPane();
		ap.add(hb, 0, 0);
		ap.add(vb, 1, 0);
		ap.setPrefSize(1000, 600);
		Scene scene = new Scene(ap);
		Stage s = new Stage();
		s.setScene(scene);
		s.setTitle("Turtle Graphics");
		s.getIcons().add(new Image("turtle.png"));
		s.setResizable(false);
		s.initStyle(StageStyle.UTILITY);
		s.show();
		
		input.setOnAction(e -> {
			String temp = order.getText();
			if(temp.equals("drop pen")) {
				status.setText("乌龟是否提笔：否");
				isDrop = true;
				order.setText("");
			}else if(temp.equals("lift pen")) {
				status.setText("乌龟是否提笔：是");
				isDrop = false;
				order.setText("");
			}else {
				Pattern p = Pattern.compile("[0-9]+");
				Matcher m = p.matcher(temp);
				System.out.println("按钮");
				double prex = nowx;
				double prey = nowy;
				if (m.find()) {
					nowx = Double.parseDouble(m.group());
					turtle.setTranslateX(nowx);
				}

				if (m.find()) {
					nowy = Double.parseDouble(m.group());
					turtle.setTranslateY(nowy);
				}
				if (isDrop)
					hb.getChildren().add(new Line(prex, prey, nowx, nowy));
				order.setText("");
			}
		});
	}

}
