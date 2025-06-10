package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;

public class Main extends Application {
	
	@Override
	public void init() {
		System.out.println("Inside init() method");
	}
	
	@Override
	public void start(Stage primaryStage) {
		System.out.println("Inside the start() method");
		
		//give the stage a title
		primaryStage.setTitle("Second JavaFX Application");
		
		//Create a root node. In this case, a flow layout pane
		FlowPane rootNode = new FlowPane();
		
		//create a scene
		Scene myScene = new Scene(rootNode, 700, 600);
		
		//set the scene on the stage
		primaryStage.setScene(myScene);
		
		//show the stage and its scene
		primaryStage.show();
	}

	@Override
	public void stop() {
		System.out.println("Inside the stop() method");
	}
	
	public static void main(String[] args) {
		System.out.println("Launching JavaFX application");
		launch(args);
	}
}
