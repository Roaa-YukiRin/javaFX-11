/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_roaa_kalantan_441004834;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Circle;
import javafx.scene.text.*;
/**
 *
 * @author HP
 */
public class Lab2_roaa_kalantan_441004834 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Circle circle = new Circle(); 
        circle.setCenterX(30); //Setting the Properties of the Circle
        circle.setCenterY(20);
        circle.setRadius(50);
        circle.setFill(Color.WHITE);
        circle.setStrokeWidth(3);
        circle.setStroke(Color.ORANGE);
        //line 1
        Line line = new Line(); 
        line.setStartX(90.0f); //Setting the Properties of the Line
        line.setStartY(10.0f);
        line.setEndX(350.0f);
        line.setEndY(10.0f);
         line.setStrokeWidth(3);
        line.setStroke(Color.ORANGE);
        
        //line 1
        Line line2 = new Line(); 
        line2.setStartX(90.0f); //Setting the Properties of the Line
        line2.setStartY(30.0f);
        line2.setEndX(300.0f);
        line2.setEndY(30.0f);
         line2.setStrokeWidth(3);
        line2.setStroke(Color.ORANGE);
       //Rectangle()
            Rectangle rectangle = new Rectangle(); 
        rectangle.setX(145); //Setting the Properties of the Rectangle
        rectangle.setY(50);
        rectangle.setWidth(295);
        rectangle.setHeight(410);
        rectangle.setFill(Color.WHITE);
        rectangle.setStrokeWidth(3);
        rectangle.setStroke(Color.ORANGE);
        
        //Rectangle()
            Rectangle rectangle1 = new Rectangle(); 
        rectangle1.setX(120); //Setting the Properties of the Rectangle
        rectangle1.setY(480);
        rectangle1.setWidth(270);
        rectangle1.setHeight(95);
        rectangle1.setFill(Color.WHITE);
        rectangle1.setStrokeWidth(3);
        
        //pectsher
        Image image1 = new Image("lab2_roaa_kalantan_441004834/tap.png");
        ImageView imageView2 = new ImageView(image1);
        imageView2.setX(150);
        imageView2.setY(460);
        imageView2.setFitHeight(560);
        imageView2.setFitWidth(200);
        imageView2.setPreserveRatio(true); 
        
        Text text1= new Text("  Ex Rank Supporting Role \n replay in Prestigious Scool ");//Drawing a text
        text1.setFont(Font.font("Edwardian Script ITC", 20));//Setting the font of the text
        text1.setX(130);//Setting the position of the text
        text1.setY(520);
        text1.setFill(Color.BEIGE);//Setting color to the text
        text1.setStrokeWidth(1);
        text1.setUnderline(true);
        text1.setStroke(Color.DARKSLATEBLUE);
        
        //pectsher
        Image image = new Image("lab2_roaa_kalantan_441004834/Ex-Rank-Supporting-Roles-Replay-in-a-Prestigious-School.png");
        ImageView imageView = new ImageView(image);
        imageView.setX(155);
        imageView.setY(55);
        imageView.setFitHeight(400);
        imageView.setFitWidth(470);
        imageView.setPreserveRatio(true); 
        
       // BAK 
        Group group = new Group(rectangle, imageView,line,circle,line2,rectangle1,imageView2,text1); //creating a Group object 
    Scene scene = new Scene(group ,500, 600); //Creating a Scene bey passing the group object, height and width 
    scene.setFill(Color.rgb(100,127,127)); //setting color to the scene 
    primaryStage.setTitle("LAB2_COVER"); //Setting the title to Stage. 
    primaryStage.setScene(scene); //Adding the scene to Stage 
    primaryStage.show(); //Displaying the contents of the stage
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
