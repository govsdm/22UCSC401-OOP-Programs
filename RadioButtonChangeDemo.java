//A simple demonstration of Radio Buttons.

//This program responds to the action events generated
//by a radio button selection. It also shows how to
//fire the button under program control.

package application;

import javafx.application.*;
import javafx.beans.value.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

public class RadioButtonChangeDemo extends Application {
	Label response;

	public static void main(String[] args) {

		// Start the JavaFX application by calling launch().
		launch(args);
	}

	// Override the start() method.
	public void start(Stage myStage) {

		// Give the stage a title.

		myStage.setTitle("Demonstrate Radio Buttons");

		// Use a FlowPane for the root node. In this case,
		// vertical and horizontal gaps of 10.
		FlowPane rootNode = new FlowPane(10, 10);

		// Center the controls in the scene.
		rootNode.setAlignment(Pos.CENTER);

		// Create a scene.
		Scene myScene = new Scene(rootNode, 220, 120);

		// Set the scene on the stage.
		myStage.setScene(myScene);

		// Create a label that will report the selection.
		response = new Label("");

		// Create the radio buttons.
		RadioButton rbTrain = new RadioButton("Train");
		RadioButton rbCar = new RadioButton("Car");
		RadioButton rbPlane = new RadioButton("Airplane");

		// Create a toggle group.
		ToggleGroup tg = new ToggleGroup();

		// Add each button to a toggle group.
		rbTrain.setToggleGroup(tg);
		rbCar.setToggleGroup(tg);
		rbPlane.setToggleGroup(tg);

		// Use a change listener to respond to a change of selection within
		// the group of radio buttons.
		tg.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
			public void changed(ObservableValue<? extends Toggle> changed, Toggle oldVal, Toggle newVal) {
				
				// Cast new to RadioButton.
				RadioButton rb = (RadioButton) newVal;
				
				// Display the selection.
				response.setText("Transport selected is " + rb.getText());
			}
		});
		
		// Select the first button. This will cause a change event
		// on the toggle group.
		rbTrain.setSelected(true);

		// Add the label and buttons to the scene graph.
		rootNode.getChildren().addAll(rbTrain, rbCar, rbPlane, response);

		// Show the stage and its scene.
		myStage.show();
	}
}