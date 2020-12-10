package com.nickedyer.snpclient;

import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

/**
 * Class used to construct a main menu screen for Simple Network Pong in JavaFX.
 *
 * @author Nicholas Dyer
 */
public class MainMenu extends Pane {
    //Fixed variables for main menu height and width
    private static final int MAIN_MENU_WIDTH = 800;
    private static final int MAIN_MENU_HEIGHT = 600;

    //The scene that runs on top of the pane
    private Scene mainScene;

    /**
     * Constructor for MainMenu. Creates a MainMenu pane.
     */
    public MainMenu() {
        //Creates a scene using this pane as the parent
        mainScene = new Scene(this, MAIN_MENU_WIDTH, MAIN_MENU_HEIGHT);
        //Sets the scene's fill to black
        mainScene.setFill(Color.BLACK);

        //Creates title text
        Text title = new Text();
        title.setFont(new Font("Verdana", 50));
        title.setText("Simple Network\nPong");
        title.setFill(Color.WHITE);
        title.setTextAlignment(TextAlignment.CENTER);
        title.setX(MAIN_MENU_WIDTH / 2.0 - (title.getLayoutBounds().getWidth()) / 2);
        title.setY(100);
        getChildren().add(title);


        //Creates the start button
        StylizedButton startButton = new StylizedButton("Start");
        startButton.setCenterXY(MAIN_MENU_WIDTH / 2, 300);
        //Creates click event handler and adds it to both the button and the text
        EventHandler<MouseEvent> startEventHandler = e -> {
            RunningPanes.removePane("mainMenu");
            RunningPanes.addPane("game", new Game());
            Main.setScene(RunningPanes.getPane("game").getScene());
        };
        startButton.addEventHandler(MouseEvent.MOUSE_CLICKED, startEventHandler);
        startButton.text.addEventHandler(MouseEvent.MOUSE_CLICKED, startEventHandler);
        //Adds start button to screen
        getChildren().add(startButton);
        getChildren().add(startButton.text);
    }
}

/**
 * Stylized button class for MainMenu.
 */
class StylizedButton extends Rectangle {
    //Fixed variables for button size
    private static final int BUTTON_WIDTH = 300;
    private static final int BUTTON_HEIGHT = 50;
    private static final int TEXT_SIZE = 35;
    //Text of the button
    protected Text text = new Text();

    /**
     * Constructor for StylizedButton. Creates a button at 0,0 with text on it.
     *
     * @param text The text to be on the button
     */
    public StylizedButton(String text) {
        setWidth(BUTTON_WIDTH);
        setHeight(BUTTON_HEIGHT);
        setFill(Color.BLACK);
        setStroke(Color.WHITE);
        setStrokeWidth(3);
        setText(text);
    }

    /**
     * Sets the text on an instance of StylizedButton.
     *
     * @param text The text to be displayed on the button
     */
    public void setText(String text) {
        this.text.setText(text);
        this.text.setFont(new Font("Verdana", TEXT_SIZE));
        this.text.setFill(Color.WHITE);
        this.text.setTextAlignment(TextAlignment.CENTER);
        this.text.setX(getX() + (getWidth() / 2) - (this.text.getLayoutBounds().getWidth() / 2));
        this.text.setY(getY() + (getHeight() / 2) + (this.text.getLayoutBounds().getHeight() / 3.5));
    }

    /**
     * Sets the center of the X coordinate of an instance of StylizedButton to a given value
     *
     * @param x Value of the new X coordinate
     */
    public void setCenterX(int x) {
        setX(x - (getWidth() / 2));
        setText(text.getText());
    }

    /**
     * Sets the center of the Y coordinate of an instance of StylizedButton to a given value
     *
     * @param y Value of the new Y coordinate
     */
    public void setCenterY(int y) {
        setY(y + (getHeight() / 2));
        setText(text.getText());
    }

    /**
     * Sets the center  an instance of StylizedButton to a given coordinate
     *
     * @param x Value of the new X coordinate
     * @param y Value of the new Y coordinate
     */
    public void setCenterXY(int x, int y) {
        setCenterX(x);
        setCenterY(y);
    }
}
