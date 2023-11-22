/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//lab 3 example1
package handle.event;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 *
 * @author HP
 */
public class HandleEvent extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       HBox pane = new HBox(30);
    pane.setAlignment(Pos.CENTER);
    // Create two buttons
    Button btOK = new Button("OK");
    Button btCancel = new Button("Cancel");
    pane.getChildren().addAll(btOK, btCancel);
    
     OKHandlerClass handler1 = new OKHandlerClass();
    btOK.setOnAction(handler1);
    CancelHandlerClass handler2 = new CancelHandlerClass();
    btCancel.setOnAction(handler2);
    
         // Create a scene and place it in the stage
    Scene scene = new Scene(pane);
    primaryStage.setTitle("HandleEvent"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
        class OKHandlerClass implements EventHandler <ActionEvent> {
    @Override
    public void handle(ActionEvent e) {
    System.out.println("OK button clicked");
    }
    }
    class CancelHandlerClass implements EventHandler<ActionEvent> {
    @Override
    public void handle(ActionEvent e) {
    System.out.println("Cancel button clicked");
    }

}
