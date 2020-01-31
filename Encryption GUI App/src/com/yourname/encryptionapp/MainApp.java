package com.yourname.encryptionapp;

import java.io.IOException;
import java.util.ArrayList;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

// I created this class by right clicking on the package then New->Other->JavaFX->Classes->JavaFX Main Class 

public class MainApp extends Application {

	private Stage primaryStage;
    
	
	// Java will call the start method for us when the app launches
	// and it will create a 'stage' for use to put all of our scenes into
    @Override
    public void start(Stage primaryStage) {

    	this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Java FX App Template");

        // set up the main view for the app (in this case it's the onl view
        initMainLayout();
        
    }
    
    
     
    // The main() method is optional in an JavaFX app
    // You would need it if you wanted to pass in parameters when launching the app from 
    // the command line
    public static void main(String[] args) {
        launch(args);
    }
    
    
   
    /**
     * Initializes the main layout/view.
     */
    public void initMainLayout() {
        try {
        	
        	// Load the main view.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("MainView.fxml"));
            AnchorPane mainView = (AnchorPane) loader.load();

            // Create a scene for the main view to be put into 
            Scene scene = new Scene(mainView);
            
            // Add the scene to the primary stage
            primaryStage.setScene(scene);
            
            // Raise the curtains to reveal the view in the scene
            primaryStage.show();
            
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
