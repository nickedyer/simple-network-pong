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

public class MainMenu extends Pane {
    private static final int MAIN_MENU_WIDTH = 800;
    private static final int MAIN_MENU_HEIGHT = 600;

    public MainMenu() {
        Scene mainScene = new Scene(this, MAIN_MENU_WIDTH, MAIN_MENU_HEIGHT);
        mainScene.setFill(Color.BLACK);

        Text title = new Text();
        title.setFont(new Font("Verdana", 50));
        title.setText("Simple Network\nPong");
        title.setFill(Color.WHITE);
        title.setTextAlignment(TextAlignment.CENTER);
        title.setX(MAIN_MENU_WIDTH / 2 - (title.getLayoutBounds().getWidth()) / 2);
        title.setY(100);

        getChildren().add(title);

        StylizedButton startButton = new StylizedButton("Start");
        startButton.setCenterX(MAIN_MENU_WIDTH / 2);
        startButton.setCenterY(300);

        EventHandler<MouseEvent> startEventHandler = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                System.exit(0);
            }
        };
        startButton.addEventHandler(MouseEvent.MOUSE_CLICKED, startEventHandler);
        startButton.text.addEventHandler(MouseEvent.MOUSE_CLICKED, startEventHandler);

        getChildren().add(startButton);
        getChildren().add(startButton.text);
    }
}

class StylizedButton extends Rectangle {
    private static final int BUTTON_WIDTH = 300;
    private static final int BUTTON_HEIGHT = 50;
    private static final int TEXT_SIZE = 35;
    protected Text text = new Text();

    public StylizedButton(String text) {
        setWidth(BUTTON_WIDTH);
        setHeight(BUTTON_HEIGHT);
        setFill(Color.BLACK);
        setStroke(Color.WHITE);
        setStrokeWidth(3);
        setText(text);
    }

    public void setText(String s) {
        text.setText(s);
        text.setFont(new Font("Verdana", TEXT_SIZE));
        text.setFill(Color.WHITE);
        text.setTextAlignment(TextAlignment.CENTER);
        text.setX(getX() + (getWidth() / 2) - (text.getLayoutBounds().getWidth() / 2));
        text.setY(getY() + (getHeight() / 2) + (text.getLayoutBounds().getHeight() / 3.5));
    }

    public void setCenterX(int x) {
        setX(x - (getWidth() / 2));
        setText(text.getText());
    }

    public void setCenterY(int y) {
        setY(y + (getHeight() / 2));
        setText(text.getText());
    }
}
