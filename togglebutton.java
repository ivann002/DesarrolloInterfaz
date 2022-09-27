import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
  
public class ToggleButtonExample extends Application {
  
    public void start(Stage stage)
    {
  
        // Hbox layout
        HBox root = new HBox();
        root.setPadding(new Insets(10));
        root.setSpacing(5);
  
        // Gender
        root.getChildren().add(new Label("Your gender:"));
  
        // Creating a ToggleGroup
        ToggleGroup group = new ToggleGroup();
  
        // Creating new Toggle buttons.
        ToggleButton maleButton = new ToggleButton("Male");
        ToggleButton femaleButton = new ToggleButton("Female");
  
        // Set toggle group
        // In a group, maximum only
        // one button is selected
        maleButton.setToggleGroup(group);
        femaleButton.setToggleGroup(group);
  
        maleButton.setUserData("Male");
        femaleButton.setUserData("Female");
  
        // male button is selected at first by default
        maleButton.setSelected(true);
  
        root.getChildren().addAll(maleButton, femaleButton);
  
        // create the scene
        Scene scene = new Scene(root, 450, 300);
  
        stage.setTitle("Toggle Button");
        stage.setScene(scene);
        stage.show();
    }
  
    // Main Method
    public static void main(String[] args)
    {
        launch(args);
    }
}
