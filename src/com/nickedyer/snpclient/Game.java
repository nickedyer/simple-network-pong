package com.nickedyer.snpclient;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class Game extends Pane {
    //Fixed variables for main menu height and width
    private static final int GAME_WIDTH = 800;
    private static final int GAME_HEIGHT = 600;

    //The scene that runs on top of the pane
    private Scene mainScene;

    public Game() {
        Scene mainScene = new Scene(this, GAME_WIDTH, GAME_HEIGHT);
        mainScene.setFill(Color.WHITE);

    }
}

