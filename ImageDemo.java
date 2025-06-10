package application;

import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.geometry.*;
import javafx.scene.image.*;

public class ImageDemo extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Start the JavaFX application by calling launch().
		launch(args);
	}

	// Override the start() method.
	public void start(Stage myStage) {

		// Give the stage a title.
		myStage.setTitle("Display an Image");

		// Use a FlowPane for the root node.
		FlowPane rootNode = new FlowPane();

		// Use center alignment.
		rootNode.setAlignment(Pos.CENTER);

		// Create a scene.
		Scene myScene = new Scene(rootNode, 500, 300);

		// Set the scene on the stage.
		myStage.setScene(myScene);

		// Create an image.
		Image javaFXLogo = new Image("E:\\workspace\\JavaFXSkel\\src\\application\\JavaFX_logo.png");

		// Create an image view that uses the image.
		ImageView javaFXLogoView = new ImageView(javaFXLogo);

		// Add the image to the scene graph.
		rootNode.getChildren().add(javaFXLogoView);

		// Show the stage and its scene.
		myStage.show();
	}
}
