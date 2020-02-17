package Exercise14_27;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Exercise14_27 extends Application {
  @Override
  public void start(Stage primaryStage) {
    DetailedClockPane clock = new DetailedClockPane();
    String timeString = clock.getHour() + ":" + clock.getMinute() 
      + ":" + clock.getSecond();
    Label lblCurrentTime = new Label(timeString);

    BorderPane pane = new BorderPane();
    pane.setCenter(clock);
    pane.setBottom(lblCurrentTime);
    BorderPane.setAlignment(lblCurrentTime, Pos.TOP_CENTER);

    Scene scene = new Scene(pane, 250, 250);
    primaryStage.setTitle("Exercise14_27"); 
    primaryStage.setScene(scene); 
    primaryStage.show(); 
  }
  
  public static void main(String[] args) {
    launch(args);
  }
} 

class DetailedClockPane extends Pane {
  private int hour;
  private int minute;
  private int second;

  private double w = 250, h = 250;
  
  public DetailedClockPane() {
    setCurrentTime();
  }

  public DetailedClockPane(int hour, int minute, int second) {
    this.hour = hour;
    this.minute = minute;
    this.second = second;
    paintClock();
  }

  public int getHour() {
    return hour;
  }

  public void setHour(int hour) {
    this.hour = hour;
    paintClock();
  }

  public int getMinute() {
    return minute;
  }

  public void setMinute(int minute) {
    this.minute = minute;
    paintClock();
  }

  public int getSecond() {
    return second;
  }

  public void setSecond(int second) {
    this.second = second;
    paintClock();
  }

  public double getW() {
    return w;
  }
  
  public void setW(double w) {
    this.w = w;
    paintClock();
  }
  
  public double getH() {
    return h;
  }
  
  public void setH(double h) {
    this.h = h;
    paintClock();
  }
  
  public void setCurrentTime() {
    Calendar calendar = new GregorianCalendar();

    this.hour = calendar.get(Calendar.HOUR_OF_DAY);
    this.minute = calendar.get(Calendar.MINUTE);
    this.second = calendar.get(Calendar.SECOND);
    
    paintClock(); 
  }
  
  private void paintClock() {
    double clockRadius = Math.min(w, h) * 0.8 * 0.5;
    double centerX = w / 2;
    double centerY = h / 2;

    Circle circle = new Circle(centerX, centerY, clockRadius);
    circle.setFill(Color.WHITE);
    circle.setStroke(Color.BLACK);
    double sLength = clockRadius * 0.8;
    double secondX = centerX + sLength * 
      Math.sin(second * (2 * Math.PI / 60));
    double secondY = centerY - sLength * 
      Math.cos(second * (2 * Math.PI / 60));
    Line sLine = new Line(centerX, centerY, secondX, secondY);
    sLine.setStroke(Color.RED);

    double mLength = clockRadius * 0.65;
    double xMinute = centerX + mLength * 
      Math.sin(minute * (2 * Math.PI / 60));
    double minuteY = centerY - mLength * 
      Math.cos(minute * (2 * Math.PI / 60));
    Line mLine = new Line(centerX, centerY, xMinute, minuteY);
    mLine.setStroke(Color.BLUE);
    
    double hLength = clockRadius * 0.5;
    double hourX = centerX + hLength * 
      Math.sin((hour % 12 + minute / 60.0) * (2 * Math.PI / 12));
    double hourY = centerY - hLength *
      Math.cos((hour % 12 + minute / 60.0) * (2 * Math.PI / 12));
    Line hLine = new Line(centerX, centerY, hourX, hourY);
    hLine.setStroke(Color.GREEN);
    
    getChildren().clear();  
    getChildren().addAll(circle, sLine, mLine, hLine);
    
    
    for (double i = 0; i < 60; i++) {
      double percent;

      if (i % 5 == 0) {
        percent = 0.9;
      }
      else {
        percent = 0.95;
      }

      double xOuter = centerX + clockRadius * Math.sin(i * (2 * Math.PI / 60));
      double yOuter = centerY - clockRadius * Math.cos(i * (2 * Math.PI / 60));
      double xInner = centerX + percent * clockRadius * Math.sin(i * (2 * Math.PI / 60));
      double yInner = centerY - percent * clockRadius * Math.cos(i * (2 * Math.PI / 60));

      getChildren().add(new Line(xOuter, yOuter, xInner, yInner));
    }

    for (int i = 0; i < 12; i++) {
      double x = centerX + 0.8 * clockRadius * Math.sin(i * (2 * Math.PI / 12));
      double y = centerY - 0.8 * clockRadius * Math.cos(i * (2 * Math.PI / 12));

      Text text = new Text(x - 4, y + 4, "" + ((i == 0) ? 12 : i));
      getChildren().add(text);
    }
  }
}

