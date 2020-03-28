/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediaplayer;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;

import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 *
 * @author YVON
 */
public class MediaPlayer extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("MediaFXML.fxml"));
        
        
        Scene scene = new Scene(root);
        stage.setTitle("J-Media");
                      
       scene.setOnMouseClicked(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent doubleClicked) {
            if(doubleClicked.getClickCount() ==2){
                stage.setFullScreen(true);
            }
            
            }
           
       });
            
     stage.getIcons().add(new Image("file:/images/film.png"));
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
