package application;

//Demonstrate Menus
import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;

public class RadioCheckMenuDemo extends Application {
	Label response;

	public static void main(String[] args) {
		// Start the JavaFX application by calling launch().
		launch(args);
	}

	// Override the start() method.
	public void start(Stage myStage) {

		// Give the stage a title.
		myStage.setTitle("Demonstrate Menus");

		// Use a BorderPane for the root node.
		BorderPane rootNode = new BorderPane();

		// Create a scene.
		Scene myScene = new Scene(rootNode, 300, 300);

		// Set the scene on the stage.
		myStage.setScene(myScene);

		// Create a label that will report the selection.
		response = new Label("Menu Demo");

		// Create the menu bar.
		MenuBar mb = new MenuBar();

		// Create the File menu.
		Menu fileMenu = new Menu("File");
		MenuItem open = new MenuItem("Open");
		MenuItem close = new MenuItem("Close");
		MenuItem save = new MenuItem("Save");
		MenuItem exit = new MenuItem("Exit");
		fileMenu.getItems().addAll(open, close, save, new SeparatorMenuItem(), exit);

		// Add File menu to the menu bar.
		mb.getMenus().add(fileMenu);

		// Create the Options menu.
		Menu optionsMenu = new Menu("Options");

		// Create the Colors sub-menu.
		Menu colorsMenu = new Menu("Colors");

		// Use check menu items for colors. This allows
		// the user to select more than one color.
		CheckMenuItem red = new CheckMenuItem("Red");
		CheckMenuItem green = new CheckMenuItem("Green");
		CheckMenuItem blue = new CheckMenuItem("Blue");
		colorsMenu.getItems().addAll(red, green, blue);
		optionsMenu.getItems().add(colorsMenu);

		// Select green for the default color selection.
		green.setSelected(true);

		// Create the Priority sub-menu.
		Menu priorityMenu = new Menu("Priority");

		// Use radio menu items for the priority setting.
		// This lets the menu show which priority is used
		// and also ensures that one and only one priority
		// can be selected at any one time.
		RadioMenuItem high = new RadioMenuItem("High");
		RadioMenuItem low = new RadioMenuItem("Low");

		// Create a toggle group and use it for the radio menu items.
		ToggleGroup tg = new ToggleGroup();
		high.setToggleGroup(tg);
		low.setToggleGroup(tg);

		// Select High priority for the default selection.
		high.setSelected(true);

		// Add the radio menu items to the Priority menu and
		// add the Priority menu to the Options menu.
		priorityMenu.getItems().addAll(high, low);
		optionsMenu.getItems().add(priorityMenu);

		// Add a separator.
		optionsMenu.getItems().add(new SeparatorMenuItem());

		// Create the Reset menu item.
		MenuItem reset = new MenuItem("Reset");
		optionsMenu.getItems().add(reset);

		// Add Options menu to the menu bar.
		mb.getMenus().add(optionsMenu);

		// Create the Help menu.
		Menu helpMenu = new Menu("Help");
		MenuItem about = new MenuItem("About");
		helpMenu.getItems().add(about);

		// Add Help menu to the menu bar.
		mb.getMenus().add(helpMenu);

		// Create one event handler that will handle menu action events.
		EventHandler<ActionEvent> MEHandler = new EventHandler<ActionEvent>() {
			public void handle(ActionEvent ae) {
				String name = ((MenuItem) ae.getTarget()).getText();
				// If Exit is chosen, the program is terminated.
				if (name.equals("Exit"))
					Platform.exit();
				response.setText(name + " selected");
			}
		};

		// Set action event handlers for the menu items.
		open.setOnAction(MEHandler);
		close.setOnAction(MEHandler);
		save.setOnAction(MEHandler);
		exit.setOnAction(MEHandler);
		red.setOnAction(MEHandler);
		green.setOnAction(MEHandler);
		blue.setOnAction(MEHandler);
		high.setOnAction(MEHandler);
		low.setOnAction(MEHandler);
		reset.setOnAction(MEHandler);
		about.setOnAction(MEHandler);

		// Add the menu bar to the top of the border pane and
		// the response label to the center position.
		rootNode.setTop(mb);
		rootNode.setCenter(response);

		// Show the stage and its scene.
		myStage.show();
	}
}
