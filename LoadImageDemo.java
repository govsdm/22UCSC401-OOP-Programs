package application;

import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;
import javafx.scene.image.*;

public class LoadImageDemo extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Start the JavaFX application by calling launch().
		launch(args);

	}

	// Override the start() method.
	public void start(Stage myStage) {
		
		// Give the stage a title.
		myStage.setTitle("Use an Image in a Label");
		
		// Use a FlowPane for the root node.
		FlowPane rootNode = new FlowPane();
		
		// Use center alignment.
		rootNode.setAlignment(Pos.CENTER);
		
		// Create a scene.
		Scene myScene = new Scene(rootNode, 600, 300);
		
		// Set the scene on the stage.
		myStage.setScene(myScene);
		
		// Create an ImageView that contains the specified image.
		ImageView imgLogo = new ImageView("E:\\\\workspace\\\\JavaFXSkel\\\\src\\\\application\\\\JavaFX_logo.png");
		
		// Create a label that contains both an image and text.
		Label imgLogoLabel = new Label("JavaFX Logo", imgLogo);
		
		imgLogoLabel.setContentDisplay(ContentDisplay.TOP);
		
		// Add the label to the scene graph.
		rootNode.getChildren().add(imgLogoLabel);
		
		// Show the stage and its scene.
		myStage.show();
	}
}
