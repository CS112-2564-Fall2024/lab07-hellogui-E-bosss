package edu.miracosta.cs112.lab07;//package name here depending on your IDE

import javafx.application.Application;  //abstract class used for JavaFX GUI's
import javafx.geometry.Insets;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;              //class for GUI window
import javafx.scene.Scene;              //class for specific view in GUI window
import javafx.scene.layout.VBox;        //class for layout pane, organized top-to-bottom
import javafx.scene.control.Label;      //class for label component
import javafx.scene.control.Button;     //class for button component
import javafx.event.EventHandler;       //interface for handling events
import javafx.event.ActionEvent;        //class for type of event for action (like button or key pressed)

public class HelloApplication extends Application implements EventHandler<ActionEvent> { //inheriting core functionality + this class will handle events
    /*** GUI COMPONENTS ***/
    // TODO: follow step 25 in README.md to create reference variables

    /*** DRIVER main ***/
    public static void main(String[] args) {
        launch(args); //method from Application class, must be called to setup javafx application
    }

    Button buttonSave;
    Button buttonCount;
    Label label1;
    Label label2;

    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Hello GUI: Ethan Senger");

        label1 = new Label();
        label1.setText("Hello GUI World");
        label1.setPadding(new Insets(0, 10, 10, 10));

        label2 = new Label();
        label2.setText("Thanks For Visiting");
        label2.setPadding(new Insets(0, 10, 10, 10));

        AnchorPane anchorPane = new AnchorPane();

        buttonSave = new Button("Save");
        buttonSave.setOnAction(this::handle);

        buttonCount = new Button("Count");
        buttonCount.setOnAction(this::handle);

        HBox hb1 = new HBox();
        hb1.setPadding(new Insets(0, 10, 10, 10));
        hb1.setSpacing(10);
        hb1.getChildren().add(buttonSave);

        HBox hb2 = new HBox();
        hb2.setPadding(new Insets(0, 10, 10, 10));
        hb2.setSpacing(10);
        hb2.getChildren().add(buttonCount);

        anchorPane.getChildren().addAll(label1, label2, hb1, hb2);

        AnchorPane.setTopAnchor(label1, 8.0);
        AnchorPane.setLeftAnchor(label1, 5.0);

        AnchorPane.setTopAnchor(label2, 8.0);
        AnchorPane.setRightAnchor(label2, 5.0);

        AnchorPane.setBottomAnchor(hb2, 8.0);
        AnchorPane.setLeftAnchor(hb2, 5.0);

        AnchorPane.setBottomAnchor(hb1, 8.0);
        AnchorPane.setRightAnchor(hb1, 5.0);


        StackPane layout = new StackPane();
        layout.getChildren().add(anchorPane);

        Scene scene = new Scene(layout, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    // TODO: follow steps 2-9 in README.md to create a start method

    // TODO: follow steps 10-21 in README.md to add objects to your layout (inside start)

    // TODO: follow steps 22-34 in README.md to create an event handler
    public void handle(ActionEvent actionEvent) {

        if (actionEvent.getSource() == buttonSave) {
            Button button = (Button) actionEvent.getSource();
            if("Save".equals(button.getText())) {
                label2.setText("Thanks For Saving!");
            }
        }

        if(actionEvent.getSource() == buttonCount) {
            Button button = (Button) actionEvent.getSource();
            if("Count".equals(button.getText())) {
                label2.setText("" + count());
            }
        }

        public int count() {
            for(int i = 0; i < 0)
        }
    }
}