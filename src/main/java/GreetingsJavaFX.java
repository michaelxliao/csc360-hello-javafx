import javafx.application.*;
import javafx.geometry.Insets;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.control.*;
import java.util.Random;

public class GreetingsJavaFX extends Application
{

	public static void main(String[] args)
	{
		launch(args);
	}
	
	Button btn;
	Color color = Color.rgb(0,0,0,0);
	BorderPane pane;
	
	@Override public void start (Stage primaryStage) 
	{
		// Create the button
		btn = new Button();
		btn.setText("Click me if you are feeling shady!");
		btn.setOnAction(e->buttonClick());
		
		// Add label and button to a layout pane
		pane = new BorderPane();
		pane.setCenter(btn);
				
		// Add layout pane to a scene
		Scene scene = new Scene(pane, 300, 250);
		scene.setFill(color);
		
		// Add the scene to the stage, set the title, and show the stage
		primaryStage.setScene(scene);
		primaryStage.setTitle("Color Party");
		primaryStage.show();
	}
	
	public void buttonClick()
	{
		// Generate new background color
		Random rand = new Random();
		int r = rand.nextInt(256);
		int g = rand.nextInt(256);
		int b = rand.nextInt(256);
		color = Color.rgb(r, g, b, 1);
		
		// Set color of border pane
		pane.setBackground(new Background(new BackgroundFill(color, CornerRadii.EMPTY, Insets.EMPTY)));
	}

}
