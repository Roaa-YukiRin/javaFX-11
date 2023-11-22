/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/********************
           lab 3 exr2
*********************/
package controlcircle;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.BorderPane;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
/**
 *
 * @author HP
 */
public class ControlCircle extends Application {
    private Circle c= new Circle(50);
    @Override
    public void start(Stage primaryStage) {
 
    Circle circle = new Circle(50);
    circle.setStroke(Color.BLACK);
    circle.setFill(Color.WHITE);
    
    HBox hBox = new HBox();
    hBox.setSpacing(10);
    hBox.setAlignment(Pos.CENTER);
    
    Button btEnlarge = new Button("Enlarge");
    Button btShrink = new Button("Shrink");
    
//    iner class
//            // Create and register the handler
//        btEnlarge.setOnAction(new EnlargeHandler());
//        btShrink.setOnAction(new ShrinkHandler());

////anonymose iner class
//    btEnlarge.setOnAction(new EventHandler<ActionEvent>() {
//    @Override // Override the handle method
//    public void handle(ActionEvent e) {
//    c.setRadius(c.getRadius() + 2);
//    }
//    });
//    btShrink.setOnAction(new EventHandler<ActionEvent>() {
//    @Override // Override the handle method
//    public void handle(ActionEvent e) {
//    c.setRadius(c.getRadius() - 2);
//    }
//    });

    
    hBox.getChildren().addAll (btEnlarge, btShrink);
    
    BorderPane borderPane = new BorderPane();
    borderPane.setCenter(circle);
    borderPane.setBottom(hBox);
    
        // Create and register the handler with Lambda Expression(multy)
//    btEnlarge.setOnAction((ActionEvent e) ->{
//    c.setRadius(c.getRadius() + 2);
//    });
//    btShrink.setOnAction((ActionEvent e) ->{
//    c.setRadius(c.getRadius() - 2);
//    }
//    ); 
//multy
//btEnlarge.setOnAction( (e) -> {c.setRadius(c.getRadius() + 10);} );
//btShrink.setOnAction( (e) -> {c.setRadius(c.getRadius() - 10);} );
//Omitting the parentheses if we have a single inferred type
btEnlarge.setOnAction( e -> {c.setRadius(c.getRadius() + 2);} );
btShrink.setOnAction( e -> {c.setRadius(c.getRadius() - 2);} );
    
            c.setOnMouseClicked(e -> {
       if (e.getButton() == MouseButton.PRIMARY) {
       c.setRadius(c.getRadius() + 2);
       }
       else if (e.getButton() == MouseButton.SECONDARY) {
       c.setRadius(c.getRadius() - 2);

//       borderPane.setOnKeyPressed(e -> {
//if (e.getCode() == KeyCode.UP) {
//c.setRadius(c.getRadius() + 2);
//}
//else if (e.getCode() == KeyCode.DOWN) {
//c.setRadius(c.getRadius() - 2);
//}
//}); 
//c.requestFocus();
   Scene scene = new Scene(borderPane, 200, 150);
    primaryStage.setTitle("ControlCircle");
    primaryStage.setScene(scene); 
    primaryStage.show(); 
        }
    
//    iner class
//            class ShrinkHandler implements EventHandler<ActionEvent> {
//        @Override // Override the handle method
//        public void handle(ActionEvent e) {
//            c.setRadius(c.getRadius()-10);}
//        }
//
//            class EnlargeHandler implements EventHandler<ActionEvent> {
//        @Override // Override the handle method
//        public void handle(ActionEvent e) {
//            c.setRadius(c.getRadius()+10);}
//        }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
