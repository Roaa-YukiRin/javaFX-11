/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication4;

import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.shape.Rectangle;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 *
 * @author HP
 */
public class JavaFXApplication4 extends Application {
    
    @Override
    public void start(Stage Stage) {
      
        //image
      //  Image image = new Image("https://i.pinimg.com/originals/0a/2e/04/0a2e0498d7c52eb08172329554324ea4.jpg");
       Image image = new Image("javafxapplication4/images (31).jpg");
        ImageView imageView = new ImageView(image);
        imageView.setX(20);
        imageView.setY(30);
        imageView.setFitHeight(350);
        imageView.setFitWidth(300);
        imageView.setPreserveRatio(true); 
        
        //Rectangle
        Rectangle rectangle = new Rectangle();
        rectangle.setX(80);
        rectangle.setY(100);
        rectangle.setWidth(150);
        rectangle.setHeight(209);
        rectangle.setFill(Color.ALICEBLUE);
        
        //TEXT
        Text text= new Text ();
        text.setText("Congratulation ");
        text.setX(90);
        text.setY(160);
        text.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20));
        text.setFill(Color.DARKBLUE);
        
        Text text1= new Text ();
        text1.setText("for the new job!!");
        text1.setX(90);
        text1.setY(200);
        text1.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20));
        text1.setFill(Color.DARKBLUE);
      
        
        
        Group group = new Group (imageView ,rectangle , text , text1);
        Scene scene = new Scene( group , 390 , 440) ; 
        
        Stage.setTitle("LAB1_Congratulation_Card");
        Stage.setScene(scene);
        Stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
